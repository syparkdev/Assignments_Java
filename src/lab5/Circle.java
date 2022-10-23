package lab5;


/*�ڼ��� 1613665 ������а�
 * 21-06-28
 * Circle Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�.
 */

public class Circle
{
	int x, y, radius;                                         //���� ������ ������ �ʵ� ����

	public Circle(int x, int y, int radius)     //��Ŭ Ŭ������ ������
	{
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public String toString()                         //toString �޼ҵ� ������
	{
		return "Circle (" + x + "," + y + ") ������" + radius;
	}

	@Override
	public boolean equals(Object obj)       //equals �޼ҵ� ������
	{
		Circle c = (Circle)obj;
		if (x == c.x && y == c.y)
			return true;
		else
			return false;
	}
}