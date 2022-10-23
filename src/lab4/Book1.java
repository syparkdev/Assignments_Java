package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * Book1 클래스와 그 클래스를 상속한 Magazine 클래스입니다. */

public class Book1 
{
	private String title;                  //속성 정보를 표현하는 필드 
	private int page;
	private String author;
	private static int count;
	
	public String getTitle()            //접근자와 설정자 메소드
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public int getPage() 
	{
		return page;
	}
	public void setPage(int page) 
	{
		this.page = page;
	}
	public String getAuthor() 
	{
		return author;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) 
	{
		Book1.count = count;
	}
	
	public Book1()                               //생성자 메소드
	{
		super();
		this.title = "불명";
		this.page = -1;
		this.author = "불명";
		count += 1;
	}	
	
	public Book1(String title, int page, String author) 
	{
		super();
		this.title = title;
		this.page = page;
		this.author = author;
		count += 1;
	}
}
