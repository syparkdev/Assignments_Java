package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * 인터페이스와 서브클래스를 작성하고 테스트하는 프로그램입니다. */

public class Circle implements Shape
{
	double radius;                                       //반지름의 길이 정보를 저장하는 필드
	
	public Circle(double radius)               //생성자 메소드
	{
		super();
		this.radius = radius;
	}

	public void draw()                                //도형을 그리는 메소드
	{
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	
	public double getArea()                      //도형의 면적을 반환하는 메소드
	{
		return (radius * radius * PI);
	}
}