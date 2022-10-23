package lab2;

/*박세연 1613665 영어영문학과
21-06-23
컴퓨터와 가위바위보 게임을 하는 프로그램입니다.*/

import java.util.Scanner;

public class GBBWithComputer 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};                  //컴퓨터의 선택지 배열
		String user = "";                                                 //사용자의 입력을 저장할 변수 초기화
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");   //게임 시작 안내문 출력
		
		while (!(user.equals("그만")))                 //사용자가 그만을 입력하지 않으면 반복
		{
			System.out.print("가위 바위 보!>>");  //사용자의 선택을 입력하라는 메시지
			user = scan.next();
			int com = (int)(Math.random() * 3);  //컴퓨터의 선택을 난수로 생성해서 인덱스로 사용
			
			System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[com] + ", ");
			//사용자와 컴퓨터의 선택을 출력
			System.out.print("\n");




		}
		
		if ((user.equals("그만")))                     //사용자가 그만을 입력할 경우 종료 메시지 출력
			System.out.println("게임을 종료합니다...");

		scan.close();

	}

}
