package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * ����Ŭ������ ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

public class Movie extends Item
{
	String director;                                          //�ʵ� ����

	public Movie(int price, String name, String director)    //������ �޼ҵ�
	{
		super(price, name);
		this.director = director;
	}

	@Override
	public String toString()                                     //�ʵ� ������ ���ڿ��� �ٲ��ִ� �޼ҵ�
	{
		return "[Movie]" + this.name + ", ����:" + director;
	}
}
