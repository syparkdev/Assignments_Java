package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * �������̽��� ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

public interface Shape 
{
	final double PI = 3.14;
	void draw();                          //������ �׸��� �߻� �޼ҵ�
	double getArea();                //������ ������ ��ȯ�ϴ� �߻� �޼ҵ�
	default public void redraw()            //������ �ٽ� �׸��ٴ� �޽����� ����ϴ� �߻� �޼ҵ�
	{
		System.out.print("---�ٽ� �׸��ϴ�.");
		draw();
	}
}