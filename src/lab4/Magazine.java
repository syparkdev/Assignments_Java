package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * Book1 클래스와 그 클래스를 상속한 Magazine 클래스입니다. */


public class Magazine extends Book1
{
	private String date;                                             //속성 정보를 표현하는 필드

	public String getDate()                         //접근자와 설정자 메소드
	{
		return date;
	}

	public void setDate(String date) 
	{
		this.date = date;
	}

	public Magazine()                                //생성자 메소드
	{
		super();
		this.date = "불명";
	}

	public Magazine(String title, int page, String author, String date) 
	{
		super(title, page, author);
		this.date = date;
	}
}
