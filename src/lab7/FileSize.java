package lab7;


/*1613665 영어영문학과 박세연
 * 21-06-30
 * c:에서 가장 큰 파일의 이름과 크기를 출력하는 프로그램입니다.
 */

import java.io.File;

public class FileSize 
{

	public static void main(String[] args) 
	{
		File f = new File("c:\\");                               //파일 객체 생성 및 경로 지정
		File[] subfiles = f.listFiles();                            //경로 내 하위 폴더 리스트 배열 생성
		File big = subfiles[0];                                      //가장 큰 파일을 보관할 파일 객체 생성 및 초기화
		
		for(int i = 1;i < subfiles.length;i++)             //가장 큰 파일을 찾는 반복문
		{
			if (big.length() < subfiles[i].length())
			{
				big = subfiles[i];
			}
		}
		
		System.out.print("가장 큰 파일은 " + big.getPath() + "  " + big.length() + "바이트");  //결과 출력

	}

}
