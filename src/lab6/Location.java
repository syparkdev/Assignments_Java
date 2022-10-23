package lab6;


/*박세연 1613665 영어영문학과
 * 21-06-29
 * 해시맵을 활용하고 테스트하는 프로그램입니다.
 */

public class Location 
{
	private String name;                                           //객체의 정보를 표현하는 필드
	private float vertical, horizontal;
	
	public Location(String name, float vertical, float horizontal)   //생성자
	{
		super();
		this.name = name;
		this.vertical = vertical;
		this.horizontal = horizontal;
	}

	public String getName()                               //접근자와 설정자
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getVertical() 
	{
		return vertical;
	}

	public void setVertical(float vertical) 
	{
		this.vertical = vertical;
	}

	public double getHorizontal() 
	{
		return horizontal;
	}

	public void setHorizontal(float horizontal) 
	{
		this.horizontal = horizontal;
	}

}