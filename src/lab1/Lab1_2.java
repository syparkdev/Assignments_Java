package lab1;

/*�ڼ��� ������а� 1613665 
 * 21-06-22
 *2�ڸ� ������ �Է¹޾� ���� �ڸ��� ���� �ڸ��� ������ �Ǻ��ϱ�*/

import java.util.Scanner;

public class Lab1_2 
{
	public static void main(String[] args) 
	{
		
		int ten = 0, one = 0;
		
		Scanner scan = new Scanner(System.in);
		//��ĳ�� ��ü ����
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		//2�ڸ��� ������ �Է��϶�� �޽���
		int num = scan.nextInt();
		//������ �Է¹޴� ���
		
		ten = num / 10;
		one = num % 10;
		//�Է¹��� ������ ���� �ڸ��� ���� �ڸ��� ������ ����
		
		if(ten == one)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�");
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�");
		//������ �� �� �ش� �޽��� ���
		
		scan.close();
		
	}
}
