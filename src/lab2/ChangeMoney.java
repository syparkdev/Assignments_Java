package lab2;

/*�ڼ��� 1613665 ������а�
21-06-23
������ ���� �׼��� �Է� �޾� ����� ������ ������ ����ϴ� ���α׷��Դϴ�.*/

import java.util.Scanner;

public class ChangeMoney 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};   //�Ž����� ���� �迭
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int moneyIn = scan.nextInt();                            //�ݾ��� �Է¹޴� ���๮
		int change = moneyIn / unit[0]; 
		//�ݺ��� ���� �� ���� 50000�� ¥�� ������ �Ž����� ���� �ʱ�ȭ
		int i = 0;                                                                 //�ݺ������
		
		for (i = 0;i < 7;i++)                    //�迭 �ε����� Ȱ���� �� �ִ� ��츸 ������ �ݺ���
		{
			if (change != 0)
				System.out.println(unit[i] + "�� ¥�� : " + change + "��");
			
			change = (moneyIn % unit[i]) / unit[i + 1];

		}		
		
		if (moneyIn % unit[6] != 0)      //�ݺ��� ���� �� ���� 1�� ¥���� ó���ϴ� ���ǹ�
			System.out.println(unit[7] + "�� ¥�� : " + (moneyIn % unit[6]) + "��");
		
		scan.close();
	}
}