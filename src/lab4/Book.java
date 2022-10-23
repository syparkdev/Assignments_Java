package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * 슈퍼클래스와 서브클래스를 작성하고 테스트하는 프로그램입니다. */

public class Book extends Item
{
	String author;                               //필드 선언

	public Book(int price, String name, String author)       //생성자 메소드
	{
		super(price, name);
		this.author = author;
	}

	@Override
	public String toString()                                                      //필드 정보를 문자열로 바꾸는 메소드
	{
		return "[Book]" + this.name + ", 저자:" + author;
	}
}
