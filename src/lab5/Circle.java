package lab5;


/*박세연 1613665 영어영문학과
 * 21-06-28
 * Circle 클래스를 작성하고 테스트하는 프로그램입니다.
 */

public class Circle
{
	int x, y, radius;                                         //원의 정보를 저장할 필드 선언

	public Circle(int x, int y, int radius)     //서클 클래스의 생성자
	{
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public String toString()                         //toString 메소드 재정의
	{
		return "Circle (" + x + "," + y + ") 반지름" + radius;
	}

	@Override
	public boolean equals(Object obj)       //equals 메소드 재정의
	{
		Circle c = (Circle)obj;
		if (x == c.x && y == c.y)
			return true;
		else
			return false;
	}
}