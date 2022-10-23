package lab3;


/*1613665 �ڼ��� ������а�
 * 21-06-24
 * Circle Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�.*/

import java.util.Scanner;

class Circle                                     //�� Ŭ���� �ۼ�
{
	private double x, y;                  //�� Ŭ������ �ʵ�� ����
	private int radius;
	
	public Circle(double x, double y, int radius)       //������ �ۼ�
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show()                                                   //���� �ʵ� ������ ����ϴ� �޼ҵ�
	{
		System.out.println("(" + x + "," + y + ")" + radius);
	}
	
	public double getArea()                                         //���� ������ ����ϴ� �޼ҵ�
	{
		return (radius * radius * Math.PI);
	}
}

public class CircleManager 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Circle c[] = new Circle[3];                       //���� ���۷��� �迭 ����
		
		for (int i = 0;i < c.length;i++)               //���� �ʵ� ������ �Է¹޾� �� ��ü�� �����ϴ� �ݺ���
		{
			System.out.print("x, y, radius>>");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int radius = scan.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		
		for (int i = 0;i < c.length;i++)          //���� �ʵ� ������ ����ϴ� �ݺ���
			c[i].show();
		
		int biggestIndex = 0;                     //���� ������ ���� ���� �ε����� 0���� �ʱ�ȭ
		
		for (int i = 1;i < c.length;i++)       //���� ������ ���� ���� �ε����� ã�� �ݺ���
		{
			if (c[biggestIndex].getArea() < c[i].getArea())
				biggestIndex = i;
		}
		
		System.out.print("���� ������ ū ���� ");    //���� ������ ū ���� �ʵ� ������ ���
		c[biggestIndex].show();
		
		scan.close();
	}
}