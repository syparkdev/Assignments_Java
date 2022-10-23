package lab2;


/*박세연 1613665 영어영문학과
21-06-23
과목 이름을 입력받아 과목에 맞는 점수를 출력하는 프로그램입니다.*/

import java.util.Scanner;

public class ScoreArray 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};   //과목 배열 생성
		int score[] = { 95, 88, 76, 62, 55 };    //점수 배열 생성
		int exist = 0;                                           //없는 과목인지 확인하기 위한 변수
		String name = "";                                   //입력받을 과목명 변수를 초기화

		while (!(name.equals("그만")))             //그만을 입력받을 때까지 반복
		{
			System.out.print("과목 이름>>");
			name = scan.next();
			
			for (int i = 0;i < 5;i++)                     
				//과목 배열과 입력받은 과목명이 같은지 확인 후 점수를 출력하는 반복문
			{
				if (course[i].equals(name))
				{
					System.out.println(course[i] + "의 점수는 " + score[i]);
					exist = 1;
				}				
			}
			if (exist == 0)               //입력한 과목명이 과목 배열에 없는 경우
				System.out.print("없는 과목입니다.\n");
		}
		scan.close();
	}
}