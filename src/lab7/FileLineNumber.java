package lab7;


/*1613665 영어영문학과 박세연
 * 21-06-30
 * 파일 내용에 라인 번호를 붙여 출력하는 프로그램입니다.
 */

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import java.io.*;

public class FileLineNumber 
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("c:\\temp\\phone.txt");     //파일리더 객체 생성 및 경로 지정
		Scanner scan = new Scanner(fr);                                      //파일리더 객체를 매개 변수로 하는 스캐너 객체 생성
		Vector<String> line = new Vector<String>();                 //파일의 line을 저장할 문자열 벡터 생성
		Iterator<String> it = line.iterator();                                                 //벡터에 대한 Iterator 객체 생성
		
		int i = 0;

		System.out.println("c:\\temp\\phone.txt 파일을 읽어 출력합니다.");
		
		 do
		{
			if (scan.hasNextLine())                                                            //다음 라인이 있다면
			{
				line.add(scan.nextLine());                                                   //라인을 읽어 벡터에 저장
			}
			if ( i < line.size())                                                                       //벡터에 저장된 라인의 개수만큼만 반복하기 위한 조건
			{
				System.out.printf("%4d:\t", i + 1);                            //라인 넘버 표시
				System.out.print(line.get(i) + "\n");                                //i번째 라인 출력
				i++;
			}
		} while (it.hasNext());                                                              //다음 라인이 있을 동안 반복
		
		fr.close();
		scan.close();

	}

}
