package lab2;


/*�ڼ��� 1613665 ������а�
21-06-23
���� �̸��� �Է¹޾� ���� �´� ������ ����ϴ� ���α׷��Դϴ�.*/

import java.util.Scanner;

public class ScoreArray 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};   //���� �迭 ����
		int score[] = { 95, 88, 76, 62, 55 };    //���� �迭 ����
		int exist = 0;                                           //���� �������� Ȯ���ϱ� ���� ����
		String name = "";                                   //�Է¹��� ����� ������ �ʱ�ȭ

		while (!(name.equals("�׸�")))             //�׸��� �Է¹��� ������ �ݺ�
		{
			System.out.print("���� �̸�>>");
			name = scan.next();
			
			for (int i = 0;i < 5;i++)                     
				//���� �迭�� �Է¹��� ������� ������ Ȯ�� �� ������ ����ϴ� �ݺ���
			{
				if (course[i].equals(name))
				{
					System.out.println(course[i] + "�� ������ " + score[i]);
					exist = 1;
				}				
			}
			if (exist == 0)               //�Է��� ������� ���� �迭�� ���� ���
				System.out.print("���� �����Դϴ�.\n");
		}
		scan.close();
	}
}