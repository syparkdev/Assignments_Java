package lab2;

/*�ڼ��� 1613665 ������а�
21-06-23
��ǻ�Ϳ� ���������� ������ �ϴ� ���α׷��Դϴ�.*/

import java.util.Scanner;

public class GBBWithComputer 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"};                  //��ǻ���� ������ �迭
		String user = "";                                                 //������� �Է��� ������ ���� �ʱ�ȭ
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");   //���� ���� �ȳ��� ���
		
		while (!(user.equals("�׸�")))                 //����ڰ� �׸��� �Է����� ������ �ݺ�
		{
			System.out.print("���� ���� ��!>>");  //������� ������ �Է��϶�� �޽���
			user = scan.next();
			int com = (int)(Math.random() * 3);  //��ǻ���� ������ ������ �����ؼ� �ε����� ���
			
			System.out.print("����� = " + user + ", ��ǻ�� = " + str[com] + ", ");
			//����ڿ� ��ǻ���� ������ ���
			System.out.print("\n");




		}
		
		if ((user.equals("�׸�")))                     //����ڰ� �׸��� �Է��� ��� ���� �޽��� ���
			System.out.println("������ �����մϴ�...");

		scan.close();

	}

}
