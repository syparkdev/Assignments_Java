package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * 슈퍼클래스와 서브클래스를 작성하고 테스트하는 프로그램입니다. */

public class Item 
{
	int price;                                                    //필드 선언
	String name;
	
	public Item(int price, String name)     //생성자 메소드
	{
		super();
		this.price = price;
		this.name = name;
	}
}
