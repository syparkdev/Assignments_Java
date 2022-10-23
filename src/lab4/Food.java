package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * 슈퍼클래스와 서브클래스를 작성하고 테스트하는 프로그램입니다. */

public class Food extends Item
{
	public Food(int price, String name)              //생성자 메소드
	{
		super(price, name);
	}

	@Override
	public String toString()                                  //필드 정보를 문자열로 바꾸는 메소드
	{
		return "[Food]" + name;
	}
}
