package lab1;

/*�ڼ��� ������а� 1613665 
 * 21-06-22
 *������ ��ǥ�� �Է¹޾� �� ���� �浹�ϴ��� �Ǻ��ϱ�*/

import java.util.Scanner;

public class Lab1_10 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//��ĳ�� ��ü ����
		
		System.out.print("x1, y1, ������ radius1 �Է�>>");  //������ ��ǥ�� �������� �Է��϶�� �޽���
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int rad1 = scan.nextInt();
		
		System.out.print("x2, y2, ������ radius2 �Է�>>");  //������ ��ǥ�� �������� �Է��϶�� �޽���
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int rad2 = scan.nextInt();
		
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		//���� ������ �Ÿ��� ���ϴ� ����
		
		if(distance <= (rad1 + rad2))                                 
			//���� ������ �Ÿ��� �� ���� �������� �� ������ ���
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
			
		scan.close();

	}

}
