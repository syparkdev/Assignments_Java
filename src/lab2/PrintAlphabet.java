package lab2;


//�ڼ��� 1613665 ������а�
//21-06-23
//�ҹ��� ���ĺ� �ϳ��� �Է¹޾� a���� ���ʷ� ����ϸ鼭 
//���� �ٲ� ������ ���ڸ� �ϳ��� ���̴� ���α׷��Դϴ�.

import java.util.Scanner;

public class PrintAlphabet 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String s = scan.next();
		//���ڿ� ������ �Է¹޴� ���๮
		
		for (char c = s.charAt(0);c >= 'a';c--)
		//���ڿ��� ���� s�� char�� ����� �� �ְ� ó���ϴ� ���๮
		//�Է¹��� c���� �ٸ��� --�ϴ� �ݺ���
			{
			for (char from = 'a';from <= c;from++)
			//�� �ٿ� a���� c������ ���
				System.out.print(from);
			System.out.print("\n");
			}
			
		scan.close();

	}

}
