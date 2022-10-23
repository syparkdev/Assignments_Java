package lab5;


/*박세연 1613665 영어영문학과
 * 21-06-28
 * n명의 플레이어를 입력받아 갬블링 게임을 실행하는 프로그램입니다.
 */

import java.util.Scanner;

public class GamblingGame2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int win = 0;
		
		System.out.print("갬블링 게임에 참여할 선수 숫자>>");
		int memberCount = scan.nextInt();
		scan.nextLine();
		
		Person players[] = new Person[memberCount];
		String names[] = new String[memberCount];
		
		for (int i = 0; i < memberCount; i++)
		{
			System.out.print((i+1) + "번째 선수 이름>>");     //선수 이름을 입력받아 Person 객체 생성		
			names[i] = scan.nextLine();
			players[i] = new Person(names[i]);
		}
		
		int i = 0;                                                       //선수의 차례를 가리키는 필드

		while (true)
		{
			players[i].turn();                                        //선수의 순서를 알려주는 메소드 호출
			String enter = scan.nextLine();              //엔터키를 입력받는 실행문
			if (enter != null && enter.equals(""))     //엔터키를 입력받으면 게임을 실행하는 조건문
				win = players[i].roll();
			if (win == 1)                                               //승자 발생시 게임 종료
				break;
			i++;
			if (i == memberCount) //마지막 플레이어 이후 다시 첫번째 플레이어의 차례로 돌려주는 실행문
				i = 0;
		}
		
		scan.close();
	}
}