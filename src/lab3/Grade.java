package lab3;


/*1613665 �ڼ��� ������а�
 * 21-06-24
 * Grade Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�.*/

import java.util.Scanner;

public class Grade               //Grade Ŭ���� ����
{
	
	int math;                            //�� ������ ������ ��Ÿ���� �ʵ��
	int science;
	int english;
	
	public Grade(int math, int science, int english)   //������ �ۼ�
	{
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average()                                                   //����� ���ϴ� �޼ҵ�
	{
		return ((math + science + english) / 3);
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		//�� ������ ������ ���ʷ� �Է¹���
		
		Grade me = new Grade(math, science, english);    //Grade ��ü�� �ν��Ͻ��� me ����
		System.out.println("����� " + me.average());         //average �޼ҵ带 ȣ���Ͽ� ��հ� ���
		
		scan.close();

	}

}
