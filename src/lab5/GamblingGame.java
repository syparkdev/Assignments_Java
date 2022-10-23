package lab5;


/*�ڼ��� 1613665 ������а�
 * 21-06-28
 * ���� ������ �����ϴ� ���α׷��Դϴ�.
 */

import java.util.Scanner;

class Person                                      //Person Ŭ���� �ۼ�
{
	String name;
	int num[] = new int[3];
	
	
	
	public Person(String name)       //Person Ŭ���� ������
	{
		super();
		this.name = name;
	}

	public void turn()                         //���ʸ� �˷��ִ� �޼ҵ�
	{
		System.out.println("[" + name + "]:<Enter>");
	}
	
	public int roll()                             //������ �����ϰ� �¸� ���θ� �����ϴ� �޼ҵ�
	{	
		System.out.print("\t\t\t\t");
		for (int i = 0; i < 3; i++)
		{
			num[i] = (int)(Math.random() * 3 + 1);	
			System.out.print(num[i]);
			System.out.print("\t\t");
		}
		
		if (num[0] == num[1] && num[0] == num[2])
		{
			System.out.println(name + "���� �̰���ϴ�!");
			return 1;
		}
		else
		{
			System.out.println("�ƽ�����!");
			return 0;
		}
	}
}

public class GamblingGame 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int win = 0;
		
		System.out.print("1��° ���� �̸�>>");     //���� �̸��� �Է¹޾� Person ��ü ����
		String name1 = scan.nextLine();
		Person p1 = new Person(name1);
		
		System.out.print("2��° ���� �̸�>>");
		String name2 = scan.nextLine();
		Person p2 = new Person(name2);

		while (true)
		{
			p1.turn();                        //p1�� ������ �˷��ִ� �޼ҵ� ȣ��
			String enter = scan.nextLine();              //����Ű�� �Է¹޴� ���๮
			if (enter != null && enter.equals(""))     //����Ű�� �Է¹����� ������ �����ϴ� ���ǹ�
				win = p1.roll();
			if (win == 1)                                               //���� �߻��� ���� ����
				break;
			
			p2.turn();                        //p1�� ������ �˷��ִ� �޼ҵ� ȣ��
			enter = scan.nextLine();                           //����Ű�� �Է¹޴� ���๮
			if (enter != null && enter.equals(""))     //����Ű�� �Է¹����� ������ �����ϴ� ���ǹ�
				win = p2.roll();
			if (win == 1)                                               //���� �߻��� ���� ����
				break;
		}

		
		scan.close();
	}
}