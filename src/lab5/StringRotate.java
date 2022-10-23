package lab5;


/*박세연 1613665 영어영문학과
 * 21-06-28
 * 문자열을 한 글자씩 회전시켜 출력하는 프로그램입니다.
 */

import java.util.Scanner;

public class StringRotate 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
		String s = scan.nextLine();
		//문자열을 입력하라는 메시지를 주고 입력을 받음


			for(int i = 1;i <= s.length();i++)        //하나씩 줄어드는 앞부분 문자열을 출력하는 반복문
			{
				System.out.print(s.substring(i));
				for (int  j = 0;j < i;j++)                     //하나씩 나타나는 뒷부분 문자열을 출력하는 반복문
				{
					System.out.print(s.charAt(j));
				}
				System.out.print("\n");
			}
		scan.close();
	}
}