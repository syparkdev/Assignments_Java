package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * 인터페이스와 서브클래스를 작성하고 테스트하는 프로그램입니다. */

public class Rect implements Shape
{
	double width;                           //사각형의 너비와 높이를 표현하는 필드
	double height;
	
	public Rect(double width, double height)               //생성자 메소드
	{
		super();
		this.width = width;
		this.height = height;
	}

	public void draw()                                //도형을 그리는 메소드
	{
		System.out.println("너비: " + width + ", 높이:" + height + "의 사각형입니다.");
	}
	
	public double getArea()                      //도형의 면적을 반환하는 메소드
	{
		return (width * height);
	}
}