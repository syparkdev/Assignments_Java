package lab5;


/*�ڼ��� 1613665 ������а�
 * 21-06-28
 * ���ڿ��� �� ���ھ� ȸ������ ����ϴ� ���α׷��Դϴ�.
 */

import java.util.Scanner;

public class StringRotate 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String s = scan.nextLine();
		//���ڿ��� �Է��϶�� �޽����� �ְ� �Է��� ����


			for(int i = 1;i <= s.length();i++)        //�ϳ��� �پ��� �պκ� ���ڿ��� ����ϴ� �ݺ���
			{
				System.out.print(s.substring(i));
				for (int  j = 0;j < i;j++)                     //�ϳ��� ��Ÿ���� �޺κ� ���ڿ��� ����ϴ� �ݺ���
				{
					System.out.print(s.charAt(j));
				}
				System.out.print("\n");
			}
		scan.close();
	}
}