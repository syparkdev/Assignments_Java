package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * ����Ŭ������ ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

public class Food extends Item
{
	public Food(int price, String name)              //������ �޼ҵ�
	{
		super(price, name);
	}

	@Override
	public String toString()                                  //�ʵ� ������ ���ڿ��� �ٲٴ� �޼ҵ�
	{
		return "[Food]" + name;
	}
}
