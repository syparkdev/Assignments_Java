package lab1;

/*박세연 영어영문학과 1613665 
 * 21-06-22
 *중점의 좌표를 입력받아 두 원이 충돌하는지 판별하기*/

import java.util.Scanner;

public class Lab1_10 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//스캐너 객체 생성
		
		System.out.print("x1, y1, 반지름 radius1 입력>>");  //중점의 좌표와 반지름을 입력하라는 메시지
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int rad1 = scan.nextInt();
		
		System.out.print("x2, y2, 반지름 radius2 입력>>");  //중점의 좌표와 반지름을 입력하라는 메시지
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int rad2 = scan.nextInt();
		
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		//중점 사이의 거리를 구하는 공식
		
		if(distance <= (rad1 + rad2))                                 
			//중점 사이의 거리가 두 원의 반지름의 합 이하인 경우
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
			
		scan.close();

	}

}
