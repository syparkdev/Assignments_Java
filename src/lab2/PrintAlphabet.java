package lab2;


//박세연 1613665 영어영문학과
//21-06-23
//소문자 알파벳 하나를 입력받아 a부터 차례로 출력하면서 
//줄이 바뀔 때마다 글자를 하나씩 줄이는 프로그램입니다.

import java.util.Scanner;

public class PrintAlphabet 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scan.next();
		//문자열 단위로 입력받는 실행문
		
		for (char c = s.charAt(0);c >= 'a';c--)
		//문자열로 받은 s를 char로 사용할 수 있게 처리하는 실행문
		//입력받은 c값을 줄마다 --하는 반복문
			{
			for (char from = 'a';from <= c;from++)
			//한 줄에 a부터 c까지를 출력
				System.out.print(from);
			System.out.print("\n");
			}
			
		scan.close();

	}

}
