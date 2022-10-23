package lab3;


/*1613665 박세연 영어영문학과
 * 21-06-24
 * Phone 클래스와 PhoneBook 클래스를 작성하고 테스트하는 프로그램입니다.*/

import java.util.Scanner;

class Phone                           //폰 클래스 작성
{
	String name;
	String tel;
	
	public Phone(String name, String tel)    //폰 클래스 생성자 작성
	{
		this.name = name;
		this.tel = tel;
	}
	
	public void show()                                     //폰 클래스의 필드 정보를 출력하는 메소드
	{
		System.out.println(this.name + "의 번호는 " + this.tel + " 입니다.");
	}
}

public class PhoneBook 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("인원수>>");                       //저장할 이름과 번호의 갯수를 입력하라는 메시지
		int person = scan.nextInt();
		String tofind = "";                                            //찾을 이름을 저장할 필드
		
		Phone celly[] = new Phone[person];           //폰 객체의 레퍼런스 배열 생성
		
		for (int i = 0;i < celly.length;i++)                   //폰 객체의 필드 정보를 입력받아 객체 생성
		{
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			String name = scan.next();
			String tel = scan.next();
			celly[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		
		while (!(tofind.equals("그만")))                       //그만이라고 입력할 때까지 계속하는 반복문
		{
			System.out.print("검색할 이름>>");
			tofind = scan.next();
			
			for (int i = 0;i < celly.length;i++)
				//검색어와 일치하는 이름이 있는지 체크하고 있으면 번호를 출력하는 반복문
			{
				if (tofind.equals(celly[i].name))
					celly[i].show();
			}
		}
		
		scan.close();
	}
}