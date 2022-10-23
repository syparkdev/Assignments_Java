package lab3;


/*1613665 �ڼ��� ������а�
 * 21-06-24
 * Phone Ŭ������ PhoneBook Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�.*/

import java.util.Scanner;

class Phone                           //�� Ŭ���� �ۼ�
{
	String name;
	String tel;
	
	public Phone(String name, String tel)    //�� Ŭ���� ������ �ۼ�
	{
		this.name = name;
		this.tel = tel;
	}
	
	public void show()                                     //�� Ŭ������ �ʵ� ������ ����ϴ� �޼ҵ�
	{
		System.out.println(this.name + "�� ��ȣ�� " + this.tel + " �Դϴ�.");
	}
}

public class PhoneBook 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�ο���>>");                       //������ �̸��� ��ȣ�� ������ �Է��϶�� �޽���
		int person = scan.nextInt();
		String tofind = "";                                            //ã�� �̸��� ������ �ʵ�
		
		Phone celly[] = new Phone[person];           //�� ��ü�� ���۷��� �迭 ����
		
		for (int i = 0;i < celly.length;i++)                   //�� ��ü�� �ʵ� ������ �Է¹޾� ��ü ����
		{
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�)>>");
			String name = scan.next();
			String tel = scan.next();
			celly[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		while (!(tofind.equals("�׸�")))                       //�׸��̶�� �Է��� ������ ����ϴ� �ݺ���
		{
			System.out.print("�˻��� �̸�>>");
			tofind = scan.next();
			
			for (int i = 0;i < celly.length;i++)
				//�˻���� ��ġ�ϴ� �̸��� �ִ��� üũ�ϰ� ������ ��ȣ�� ����ϴ� �ݺ���
			{
				if (tofind.equals(celly[i].name))
					celly[i].show();
			}
		}
		
		scan.close();
	}
}