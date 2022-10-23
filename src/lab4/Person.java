package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * Person 클래스와 그 클래스를 상속한 Customer 클래스입니다. */

public class Person 
{
	private String name;                  //속성 정보를 표현하는 필드
	private String home;
	private String tel;
	
	public String getName()             //접근자와 설정자 메소드
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getHome() 
	{
		return home;
	}
	public void setHome(String home) 
	{
		this.home = home;
	}
	public String getTel() 
	{
		return tel;
	}
	public void setTel(String tel) 
	{
		this.tel = tel;
	}
	
	public Person()                                            //생성자 메소드
	{
		super();
		this.name = "불명";
		this.home = "불명";
		this.tel = "불명";
	}
	
	public Person(String name, String home, String tel) 
	{
		super();
		this.name = name;
		this.home = home;
		this.tel = tel;
	}
}
