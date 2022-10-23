package lab1;

/*박세연 영어영문학과 1613665 
 * 21-06-22
 *좌표를 입력받아 특정 직사각형과 충돌하는지 판별하기*/

import java.util.Scanner;

public class Lab1_8 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//스캐너 객체 생성
		
		System.out.print("x1, y1 입력>>");         //좌표를 입력하라는 메시지
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		
		System.out.print("x2, y2 입력>>");         //좌표를 입력하라는 메시지
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		if ((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200))   //충돌 발생을 확인하는 조건문
			System.out.println("충돌 발생");
		else if ((x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200))
			System.out.println("충돌 발생");
		else
			System.out.println("충돌 없음");
		
		scan.close();

	}

}
