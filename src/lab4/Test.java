package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * ����Ŭ������ ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

public class Test 
{

	public static void main(String[] args)
	{
		Buyer m = new Buyer(40000);
		m.buy((new Food(5000, "�����")), 3);                   //���� �޼ҵ带 �׽�Ʈ�ϴ� ���๮
		m.buy((new Food(3000, "���")), 2);
		m.buy((new Book(7000, "Java Programming", "�ڹ�")), 1);
		m.buy((new Movie(8000, "�λ���", "����ȣ")), 1);
		m.buy((new Food(2000, "���")), 3);
	}
}