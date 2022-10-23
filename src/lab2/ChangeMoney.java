package lab2;

/*박세연 1613665 영어영문학과
21-06-23
정수로 돈의 액수를 입력 받아 지폐와 동전의 갯수를 출력하는 프로그램입니다.*/

import java.util.Scanner;

public class ChangeMoney 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};   //거스름돈 종류 배열
		
		System.out.print("금액을 입력하시오>>");
		int moneyIn = scan.nextInt();                            //금액을 입력받는 실행문
		int change = moneyIn / unit[0]; 
		//반복에 넣을 수 없는 50000원 짜리 개수로 거스름돈 변수 초기화
		int i = 0;                                                                 //반복제어변수
		
		for (i = 0;i < 7;i++)                    //배열 인덱스를 활용할 수 있는 경우만 포함한 반복문
		{
			if (change != 0)
				System.out.println(unit[i] + "원 짜리 : " + change + "개");
			
			change = (moneyIn % unit[i]) / unit[i + 1];

		}		
		
		if (moneyIn % unit[6] != 0)      //반복에 넣을 수 없는 1원 짜리를 처리하는 조건문
			System.out.println(unit[7] + "원 짜리 : " + (moneyIn % unit[6]) + "개");
		
		scan.close();
	}
}