package lab1;

/*�ڼ��� ������а� 1613665 
 * 21-06-22
 *��ǥ�� �Է¹޾� Ư�� ���簢���� �浹�ϴ��� �Ǻ��ϱ�*/

import java.util.Scanner;

public class Lab1_8 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//��ĳ�� ��ü ����
		
		System.out.print("x1, y1 �Է�>>");         //��ǥ�� �Է��϶�� �޽���
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		
		System.out.print("x2, y2 �Է�>>");         //��ǥ�� �Է��϶�� �޽���
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		if ((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200))   //�浹 �߻��� Ȯ���ϴ� ���ǹ�
			System.out.println("�浹 �߻�");
		else if ((x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200))
			System.out.println("�浹 �߻�");
		else
			System.out.println("�浹 ����");
		
		scan.close();

	}

}
