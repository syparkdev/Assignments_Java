package lab5;


/*�ڼ��� 1613665 ������а�
 * 21-06-28
 * n���� �÷��̾ �Է¹޾� ���� ������ �����ϴ� ���α׷��Դϴ�.
 */

import java.util.Scanner;

public class GamblingGame2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int win = 0;
		
		System.out.print("���� ���ӿ� ������ ���� ����>>");
		int memberCount = scan.nextInt();
		scan.nextLine();
		
		Person players[] = new Person[memberCount];
		String names[] = new String[memberCount];
		
		for (int i = 0; i < memberCount; i++)
		{
			System.out.print((i+1) + "��° ���� �̸�>>");     //���� �̸��� �Է¹޾� Person ��ü ����		
			names[i] = scan.nextLine();
			players[i] = new Person(names[i]);
		}
		
		int i = 0;                                                       //������ ���ʸ� ����Ű�� �ʵ�

		while (true)
		{
			players[i].turn();                                        //������ ������ �˷��ִ� �޼ҵ� ȣ��
			String enter = scan.nextLine();              //����Ű�� �Է¹޴� ���๮
			if (enter != null && enter.equals(""))     //����Ű�� �Է¹����� ������ �����ϴ� ���ǹ�
				win = players[i].roll();
			if (win == 1)                                               //���� �߻��� ���� ����
				break;
			i++;
			if (i == memberCount) //������ �÷��̾� ���� �ٽ� ù��° �÷��̾��� ���ʷ� �����ִ� ���๮
				i = 0;
		}
		
		scan.close();
	}
}