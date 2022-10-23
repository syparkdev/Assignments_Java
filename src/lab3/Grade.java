package lab3;


/*1613665 박세연 영어영문학과
 * 21-06-24
 * Grade 클래스를 작성하고 테스트하는 프로그램입니다.*/

import java.util.Scanner;

public class Grade               //Grade 클래스 정의
{
	
	int math;                            //세 과목의 점수를 나타내는 필드들
	int science;
	int english;
	
	public Grade(int math, int science, int english)   //생성자 작성
	{
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average()                                                   //평균을 구하는 메소드
	{
		return ((math + science + english) / 3);
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		//세 과목의 점수를 차례로 입력받음
		
		Grade me = new Grade(math, science, english);    //Grade 객체의 인스턴스로 me 생성
		System.out.println("평균은 " + me.average());         //average 메소드를 호출하여 평균값 출력
		
		scan.close();

	}

}
