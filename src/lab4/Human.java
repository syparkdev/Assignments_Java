package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * Human 클래스와 그 클래스를 상속한 Student 클래스를 테스트하는 프로그램입니다. */

public class Human 
{
	private String name;                        //속성 정보를 표현한 필드
	private int age;
	
	public String getName()                  //접근자와 설정자 메소드
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public Human()                                           //생성자 메소드
	{
		super();
	}
	
	public Human(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString()                             //필드 정보를 문자열로 서술하는 메소드
	{
		return "이름: " + name + ", 나이: " + age + "\n";
	}
}
