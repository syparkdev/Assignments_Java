package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * �������̽��� ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

public class Shapes 
{

	public static void main(String[] args) 
	{
		Shape list[] = new Shape[3];                  //Shape Ŭ���� ��ü�� ���۷��� �迭
		
		list[0] = new Circle(10);                           //�������� 10�� �� ��ü
		list[1] = new Oval(20, 30);                      //20x30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rect(10, 40);                     //10x40 ũ���� �簢��
		
		for (int i = 0;i < list.length;i++)
			list[i].redraw();
		for (int i = 0;i < list.length;i++)
			System.out.println("������ " + list[i].getArea());
	}
}
