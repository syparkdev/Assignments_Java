package lab7;


/*1613665 영어영문학과 박세연
 * 21-06-30
 * 연락처를 입력받아 파일에 저장하고 출력하는 프로그램입니다.
 */

import java.util.Scanner;
import java.io.*;

public class PhoneSave 
{
	public static void main(String[] args) throws IOException   //예외 처리
	{
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter("c:\\temp\\phone.txt");  //파일라이터 객체 생성 및 경로 지정
		String input;
				
		while (true)
		{
			
			System.out.print("이름 전화번호 >> ");
			input = scan.nextLine();                             //문자열을 입력받는 실행문
			if (input.equals("그만"))
				break;
			else
			{
				fw.write(input, 0, input.length());             //받은 문자열을 파일에 쓰기
				fw.write("\r\n", 0, 2);
			}
			
		} 
			
		
		fw.close();
		scan.close();
		
			
	}	
}
