package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * ����Ŭ������ ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

public class Book extends Item
{
	String author;                               //�ʵ� ����

	public Book(int price, String name, String author)       //������ �޼ҵ�
	{
		super(price, name);
		this.author = author;
	}

	@Override
	public String toString()                                                      //�ʵ� ������ ���ڿ��� �ٲٴ� �޼ҵ�
	{
		return "[Book]" + this.name + ", ����:" + author;
	}
}
