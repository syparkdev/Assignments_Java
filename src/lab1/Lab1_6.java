package lab1;

/*박세연 영어영문학과 1613665 
 * 21-06-22
 *369게임 작성하기*/

import java.util.Scanner;

public class Lab1_6 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//스캐너 객체 생성
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		//정수를 입력하라는 메시지
		int num = scan.nextInt();
		//정수를 입력받는 실행문
		
		int ten = num / 10;
		//십의 자리 저장
		int one = num % 10;
		//일의 자리 저장
		
		if((ten == 3 || ten == 6 || ten == 9)  && (one == 3 || one == 6 || one == 9))            //십의 자리와 일의 자리 둘 다 3의 배수일 때
			System.out.println("박수짝짝");
		else if((ten == 3 || ten == 6 || ten == 9)  || (one == 3 || one == 6 || one == 9))      //둘 중 하나만 3의 배수일 때
			System.out.println("박수짝");
		else                                                               //둘 다 아닐 때
			System.out.println("박수없음");

		scan.close();
	}

}
