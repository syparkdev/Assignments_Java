package lab5;


/*박세연 1613665 영어영문학과
 * 21-06-28
 * 갬블링 게임을 실행하는 프로그램입니다.
 */

import java.util.Scanner;

class Person                                      //Person 클래스 작성
{
	String name;
	int num[] = new int[3];
	
	
	
	public Person(String name)       //Person 클래스 생성자
	{
		super();
		this.name = name;
	}

	public void turn()                         //차례를 알려주는 메소드
	{
		System.out.println("[" + name + "]:<Enter>");
	}
	
	public int roll()                             //난수를 생성하고 승리 여부를 리턴하는 메소드
	{	
		System.out.print("\t\t\t\t");
		for (int i = 0; i < 3; i++)
		{
			num[i] = (int)(Math.random() * 3 + 1);	
			System.out.print(num[i]);
			System.out.print("\t\t");
		}
		
		if (num[0] == num[1] && num[0] == num[2])
		{
			System.out.println(name + "님이 이겼습니다!");
			return 1;
		}
		else
		{
			System.out.println("아쉽군요!");
			return 0;
		}
	}
}

public class GamblingGame 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int win = 0;
		
		System.out.print("1번째 선수 이름>>");     //선수 이름을 입력받아 Person 객체 생성
		String name1 = scan.nextLine();
		Person p1 = new Person(name1);
		
		System.out.print("2번째 선수 이름>>");
		String name2 = scan.nextLine();
		Person p2 = new Person(name2);

		while (true)
		{
			p1.turn();                        //p1의 순서를 알려주는 메소드 호출
			String enter = scan.nextLine();              //엔터키를 입력받는 실행문
			if (enter != null && enter.equals(""))     //엔터키를 입력받으면 게임을 실행하는 조건문
				win = p1.roll();
			if (win == 1)                                               //승자 발생시 게임 종료
				break;
			
			p2.turn();                        //p1의 순서를 알려주는 메소드 호출
			enter = scan.nextLine();                           //엔터키를 입력받는 실행문
			if (enter != null && enter.equals(""))     //엔터키를 입력받으면 게임을 실행하는 조건문
				win = p2.roll();
			if (win == 1)                                               //승자 발생시 게임 종료
				break;
		}

		
		scan.close();
	}
}