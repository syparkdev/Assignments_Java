package lab7;


/*1613665 영어영문학과 박세연
 * 21-06-30
 * 연락처를 입력받아 파일에 저장하고 출력하는 프로그램입니다.
 */

import java.io.*;

public class PhoneOpen 
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("c:\\temp\\phone.txt");  //파일리더 객체 생성 및 경로 지정
		int c;
		
		while((c = fr.read()) != -1)   //eof가 아닐 동안 반복
		{
			System.out.print((char)c);  //int로 읽어온 c를 char로 타입캐스팅 후 출력
		}
		
		fr.close();

	}

}
