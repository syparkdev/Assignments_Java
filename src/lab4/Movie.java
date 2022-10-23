package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * 슈퍼클래스와 서브클래스를 작성하고 테스트하는 프로그램입니다. */

public class Movie extends Item
{
	String director;                                          //필드 선언

	public Movie(int price, String name, String director)    //생성자 메소드
	{
		super(price, name);
		this.director = director;
	}

	@Override
	public String toString()                                     //필드 정보를 문자열로 바꿔주는 메소드
	{
		return "[Movie]" + this.name + ", 감독:" + director;
	}
}
