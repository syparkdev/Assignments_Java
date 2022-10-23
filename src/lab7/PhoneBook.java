package lab7;


/*1613665 영어영문학과 박세연
 * 21-06-30
 * 파일을 읽어 해시맵에 저장하고 이름을 입력받아 값을 출력하는 프로그램입니다.
 */

import java.util.Scanner;
import java.util.Vector;
import java.util.HashMap;
import java.io.*;

public class PhoneBook 
{
	public static void main(String[] args) throws IOException
	{
		Vector<String> v = new Vector<String>();                                    //파일에서 읽은 라인을 저장할 벡터
		HashMap<String, String> h = new HashMap<>();                       //검색을 위한 해시맵
		FileReader fr = new FileReader("c:\\Temp\\phone.txt");   //읽어올 파일리더 객체
		Scanner scanFile = new Scanner(fr);                            //파일을 읽을 스캐너
		Scanner scanInput = new Scanner(System.in);          //입력을 받을 스캐너
		int i = 0;
		String key = "";
		
		while (scanFile.hasNextLine())
		{
			v.add(scanFile.nextLine());                                                   //라인을 읽어 벡터에 저장
		}
		
		while ( i < v.size())                                                          //벡터에 저장된 라인의 개수만큼만 반복하기 위한 조건
		{
			String[] infoCut = (v.get(i)).split(" ");                      //벡터에 저장된 라인을 키와 값으로 자름
			h.put(infoCut[0], infoCut[1]);                                 //자른 키와 값을 해시맵에 등록
			i++;
		}
		
		System.out.println("총 " + v.size() + "개의 전화번호를 읽었습니다.");   //읽어온 라인의 개수 출력 메시지
		
		while (true)
		{
			System.out.print("이름>>\t");
			key = scanInput.nextLine();                //키를 받아오는 실행문
			if (key.equals("그만"))                            //그만 입력 시 종료
				break;
			else                                                         //키를 입력 시 값 출력
				System.out.println(h.get(key));
		}
		
		fr.close();
		scanFile.close();
		scanInput.close();

	}
}