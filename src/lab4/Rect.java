package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * �������̽��� ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

public class Rect implements Shape
{
	double width;                           //�簢���� �ʺ�� ���̸� ǥ���ϴ� �ʵ�
	double height;
	
	public Rect(double width, double height)               //������ �޼ҵ�
	{
		super();
		this.width = width;
		this.height = height;
	}

	public void draw()                                //������ �׸��� �޼ҵ�
	{
		System.out.println("�ʺ�: " + width + ", ����:" + height + "�� �簢���Դϴ�.");
	}
	
	public double getArea()                      //������ ������ ��ȯ�ϴ� �޼ҵ�
	{
		return (width * height);
	}
}