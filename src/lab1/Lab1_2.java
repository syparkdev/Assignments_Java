package lab1;

/*박세연 영어영문학과 1613665 
 * 21-06-22
 *2자리 정수를 입력받아 십의 자리와 일의 자리가 같은지 판별하기*/

import java.util.Scanner;

public class Lab1_2 
{
	public static void main(String[] args) 
	{
		
		int ten = 0, one = 0;
		
		Scanner scan = new Scanner(System.in);
		//스캐너 객체 생성
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		//2자리수 정수를 입력하라는 메시지
		int num = scan.nextInt();
		//정수를 입력받는 기능
		
		ten = num / 10;
		one = num % 10;
		//입력받은 정수를 십의 자리와 일의 자리로 나눠서 저장
		
		if(ten == one)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다");
		//같은지 비교 후 해당 메시지 출력
		
		scan.close();
		
	}
}
