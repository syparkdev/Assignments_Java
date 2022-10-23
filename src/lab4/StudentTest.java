package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * Human 클래스와 그 클래스를 상속한 Student 클래스를 테스트하는 프로그램입니다. */

import java.util.Scanner;

public class StudentTest 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		Human people[] = new Human[3];                               //객체 레퍼런스 배열 생성
		Student student[] = new Student[3];
		
		for (int i = 0; i < people.length;i++)                              //인간 배열 정보 입력받아 객체 생성
		{
			System.out.print("[" + (i + 1) + "]  Human 입력:");
			
			String name = scan.next();
			int age = scan.nextInt();
			
			people[i] = new Human(name, age);
		}

		for (int i = 0; i < student.length;i++)                            //학생 배열 정보 입력받아 객체 생성
		{
			System.out.print("[" + (i + 1) + "]  Student 입력:");
			
			String name = scan.next();
			int age = scan.nextInt();
			String major = scan.next();
			String studentID = scan.next();
			
			student[i] = new Student(name, age, major, studentID);
			
		}
		
		for (int i = 0; i < people.length;i++)                             //인간 배열 정보 출력
		{
			System.out.print(people[i]);
		}
		
		for (int i = 0; i < student.length;i++)                          //학생 배열 정보 출력
		{
			System.out.print(student[i]);
		}
		
		scan.close();
	}
}
