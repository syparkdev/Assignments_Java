package lab7;


/*1613665 영어영문학과 박세연
 * 21-06-30
 * 두 개의 파일을 합쳐 새로운 파일을 생성하는 프로그램입니다.
 */

import java.util.Scanner;
import java.io.*;

public class FileAppend 
{

	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		int c;
		
		//파일 이름 입력받아 파일리더와 파일라이터 객체에 저장
		System.out.println("전체 경로가 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String name1 = scan.next();
		System.out.print("두번째 파일 이름을 입력하세요>>");
		String name2 = scan.next();
		System.out.print("합치는 파일 이름을 입력하세요>>");
		String combined = scan.next();

		FileReader fr1 = new FileReader(name1);
		FileReader fr2 = new FileReader(name2);
		FileWriter fw = new FileWriter(combined);
		
		while((c = fr1.read()) != -1)   //eof가 아닐 동안 fr1에서 한 글자씩 읽어오기 반복
		{
			fw.write((char)c);  //int로 읽어온 c를 char로 타입캐스팅 후 출력
		}
		
		while((c = fr2.read()) != -1)   //eof가 아닐 동안 fr2에서 한 글자씩 읽어오기 반복
		{
			fw.write((char)c);  //int로 읽어온 c를 char로 타입캐스팅 후 출력
		}

		fr1.close();
		fr2.close();
		fw.close();
		scan.close();
	}

}
