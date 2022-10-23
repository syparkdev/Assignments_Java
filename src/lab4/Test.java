package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * 슈퍼클래스와 서브클래스를 작성하고 테스트하는 프로그램입니다. */

public class Test 
{

	public static void main(String[] args)
	{
		Buyer m = new Buyer(40000);
		m.buy((new Food(5000, "비빔밥")), 3);                   //구매 메소드를 테스트하는 실행문
		m.buy((new Food(3000, "라면")), 2);
		m.buy((new Book(7000, "Java Programming", "자바")), 1);
		m.buy((new Movie(8000, "부산행", "연상호")), 1);
		m.buy((new Food(2000, "김밥")), 3);
	}
}