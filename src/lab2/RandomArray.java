package lab2;


/*박세연 1613665 영어영문학과
21-06-23
저장할 정수의 개수를 입력받아 정수 배열에 정수를 랜덤하게 삽입하고 출력하는 프로그램입니다.*/

import java.util.Scanner;

public class RandomArray 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);      //스캐너 객체 생성
		System.out.print("정수 몇개? ");                         //사용자로부터 입력을 받기 위한 출력문
		int count = scan.nextInt();                                 //스캐너를 통한 입력값 저장	
		int intArray[] = new int [count];                       //입력값 크기의 배열 생성
		
		for (int i = 0;i < count;i++)
		{
			int num = (int)(Math.random() * 100 + 1); //난수 생성

			int same = 0;                  //배열에 난수와 같은 값이 있나 체크하기 위한 변수
			
			for (int j = 0;j < i;j++)
			{
				if (intArray[j] == num) //배열에 난수와 같은 값이 있을 경우 same에 1을 대입
					same = 1;
			}
			
			if (same == 0)                   //배열에 난수와 같은 값이 없으면 i번째에 난수를 삽입
				intArray[i] = num;
			else                                    //같은 값이 있으면 i에서 1을 빼서 재시도
				i--;
		}
		
		for (int k = 0;k < count;k++)
			System.out.print(intArray[k]+ "\t");
		
		scan.close();

	}
}