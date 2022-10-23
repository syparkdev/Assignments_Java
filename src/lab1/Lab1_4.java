package lab1;

/*박세연 영어영문학과 1613665 
 * 21-06-22
 *3개의 정수를 입력받아 중간값을 출력하기*/

import java.util.Scanner;

public class Lab1_4 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int mid = 0;
		
		System.out.print("정수 3개 입력>>");
		//정수를 입력하라는 메시지
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
	
		if(num1 >= num2)
			if(num2 >= num3)
				mid = num2;
			else if(num1 <= num3)
				mid = num1;
			else
				mid = num3;
		else if(num1 > num3)
			mid = num1;
		else if(num2 > num3)
			mid = num3;
		else
			mid = num2;
		//중간값을 mid에 저장하는 조건문	
		
		System.out.println("중간 값은 " + mid);
		//결과 출력
		
		scan.close();
	}

}
