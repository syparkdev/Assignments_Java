package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * �������̽��� ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

public class Oval implements Shape
{
	double width;                           //Ÿ���� �����ϴ� �簢���� �ʺ�� ���̸� ǥ���ϴ� �ʵ�
	double height;
	
	public Oval(double width, double height)               //������ �޼ҵ�
	{
		super();
		this.width = width;
		this.height = height;
	}

	public void draw()                                //������ �׸��� �޼ҵ�
	{
		System.out.println("�ʺ�: " + width + ", ����:" + height + "�� �����ϴ� Ÿ���Դϴ�.");
	}
	
	public double getArea()                      //������ ������ ��ȯ�ϴ� �޼ҵ�
	{	
		return (((width * height) / 4) * PI);
	}
}