package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * Human Ŭ������ �� Ŭ������ ����� Student Ŭ������ �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

import java.util.Scanner;

public class StudentTest 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		Human people[] = new Human[3];                               //��ü ���۷��� �迭 ����
		Student student[] = new Student[3];
		
		for (int i = 0; i < people.length;i++)                              //�ΰ� �迭 ���� �Է¹޾� ��ü ����
		{
			System.out.print("[" + (i + 1) + "]  Human �Է�:");
			
			String name = scan.next();
			int age = scan.nextInt();
			
			people[i] = new Human(name, age);
		}

		for (int i = 0; i < student.length;i++)                            //�л� �迭 ���� �Է¹޾� ��ü ����
		{
			System.out.print("[" + (i + 1) + "]  Student �Է�:");
			
			String name = scan.next();
			int age = scan.nextInt();
			String major = scan.next();
			String studentID = scan.next();
			
			student[i] = new Student(name, age, major, studentID);
			
		}
		
		for (int i = 0; i < people.length;i++)                             //�ΰ� �迭 ���� ���
		{
			System.out.print(people[i]);
		}
		
		for (int i = 0; i < student.length;i++)                          //�л� �迭 ���� ���
		{
			System.out.print(student[i]);
		}
		
		scan.close();
	}
}
