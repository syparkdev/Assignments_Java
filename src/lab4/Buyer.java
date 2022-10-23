package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * 슈퍼클래스와 서브클래스를 작성하고 테스트하는 프로그램입니다. */

public class Buyer 
{
	int money;                                            //필드 선언

	public Buyer(int money)                   //생성자 메소드
	{
		super();
		this.money = money;
	}
	
	public void buy(Item t, int n)            //구매를 수행하는 메소드
	{
		System.out.println(t + "=>" + n + "개 구매");
		
		if( this.money > (t.price * n) )       //잔액과 상품 가격을 비교해서 결과를 출력하는 조건문
		{
			this.money -= (t.price * n);
			System.out.println("구매 완료 후 잔액 : " + this.money);
		}
		else
			System.out.println("잔액 부족 : " + this.money);
	}
}