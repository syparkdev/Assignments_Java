package lab1;

/*�ڼ��� ������а� 1613665 
 * 21-06-22
 *369���� �ۼ��ϱ�*/

import java.util.Scanner;

public class Lab1_6 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//��ĳ�� ��ü ����
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		//������ �Է��϶�� �޽���
		int num = scan.nextInt();
		//������ �Է¹޴� ���๮
		
		int ten = num / 10;
		//���� �ڸ� ����
		int one = num % 10;
		//���� �ڸ� ����
		
		if((ten == 3 || ten == 6 || ten == 9)  && (one == 3 || one == 6 || one == 9))            //���� �ڸ��� ���� �ڸ� �� �� 3�� ����� ��
			System.out.println("�ڼ�¦¦");
		else if((ten == 3 || ten == 6 || ten == 9)  || (one == 3 || one == 6 || one == 9))      //�� �� �ϳ��� 3�� ����� ��
			System.out.println("�ڼ�¦");
		else                                                               //�� �� �ƴ� ��
			System.out.println("�ڼ�����");

		scan.close();
	}

}
