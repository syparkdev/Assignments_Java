package lab3;


/*1613665 박세연 영어영문학과
 * 21-06-24
 * Circle 클래스를 작성하고 테스트하는 프로그램입니다.*/

import java.util.Scanner;

class Circle                                     //원 클래스 작성
{
	private double x, y;                  //원 클래스의 필드들 선언
	private int radius;
	
	public Circle(double x, double y, int radius)       //생성자 작성
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show()                                                   //원의 필드 정보를 출력하는 메소드
	{
		System.out.println("(" + x + "," + y + ")" + radius);
	}
	
	public double getArea()                                         //원의 면적을 출력하는 메소드
	{
		return (radius * radius * Math.PI);
	}
}

public class CircleManager 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Circle c[] = new Circle[3];                       //원의 레퍼런스 배열 생성
		
		for (int i = 0;i < c.length;i++)               //원의 필드 정보를 입력받아 원 객체를 생성하는 반복문
		{
			System.out.print("x, y, radius>>");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int radius = scan.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		
		for (int i = 0;i < c.length;i++)          //원의 필드 정보를 출력하는 반복문
			c[i].show();
		
		int biggestIndex = 0;                     //가장 면적이 넓은 원의 인덱스를 0으로 초기화
		
		for (int i = 1;i < c.length;i++)       //가장 면적이 넓은 원의 인덱스를 찾는 반복문
		{
			if (c[biggestIndex].getArea() < c[i].getArea())
				biggestIndex = i;
		}
		
		System.out.print("가장 면적이 큰 원은 ");    //가장 면적이 큰 원의 필드 정보를 출력
		c[biggestIndex].show();
		
		scan.close();
	}
}