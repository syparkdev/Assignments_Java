package lab5;


/*�ڼ��� 1613665 ������а�
 * 21-06-28
 * Circle Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�.
 */

public class CircleApp 
{
	public static void main(String[] args)
	{
		Circle a = new Circle(2,3,5);                     //��ü a, b ����
		Circle b  = new Circle(2,3,30);
		System.out.println("�� a : " + a);             //��ü a, b�� ���� ���
		System.out.println("�� b : " + b);
		if (a.equals(b))                                            //��ü a�� b�� ���� ��ġ ���ο� ���� �޽��� ���
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}
}