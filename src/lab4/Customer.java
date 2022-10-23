package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * Person 클래스와 그 클래스를 상속한 Customer 클래스입니다. */

public class Customer extends Person
{
	private String clientNum;                //속성 정보를 표현하는 필드
	private int milage;
	
	public String getClientNum()           //접근자와 설정자 메소드
	{
		return clientNum;
	}
	public void setClientNum(String clientNum) 
	{
		this.clientNum = clientNum;
	}
	public int getMilage() 
	{
		return milage;
	}
	public void setMilage(int milage) 
	{
		this.milage = milage;
	}
	
	public Customer()                           //생성자 메소드
	{
		super();
		this.clientNum = "불명";
		this.milage = 0;
	}
	
	public Customer(String name, String home, String tel, String clientNum, int milage) 
	//매개변수가 있는 상위 클래스의 생성자를 호출하는 생성자 메소드
	{
		super(name, home, tel);
		this.clientNum = clientNum;
		this.milage = milage;
	}
}
