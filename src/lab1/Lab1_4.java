package lab1;

/*�ڼ��� ������а� 1613665 
 * 21-06-22
 *3���� ������ �Է¹޾� �߰����� ����ϱ�*/

import java.util.Scanner;

public class Lab1_4 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int mid = 0;
		
		System.out.print("���� 3�� �Է�>>");
		//������ �Է��϶�� �޽���
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
	
		if(num1 >= num2)
			if(num2 >= num3)
				mid = num2;
			else if(num1 <= num3)
				mid = num1;
			else
				mid = num3;
		else if(num1 > num3)
			mid = num1;
		else if(num2 > num3)
			mid = num3;
		else
			mid = num2;
		//�߰����� mid�� �����ϴ� ���ǹ�	
		
		System.out.println("�߰� ���� " + mid);
		//��� ���
		
		scan.close();
	}

}
