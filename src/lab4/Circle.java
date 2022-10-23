package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * �������̽��� ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

public class Circle implements Shape
{
	double radius;                                       //�������� ���� ������ �����ϴ� �ʵ�
	
	public Circle(double radius)               //������ �޼ҵ�
	{
		super();
		this.radius = radius;
	}

	public void draw()                                //������ �׸��� �޼ҵ�
	{
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}
	
	public double getArea()                      //������ ������ ��ȯ�ϴ� �޼ҵ�
	{
		return (radius * radius * PI);
	}
}