package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * Book1 Ŭ������ �� Ŭ������ ����� Magazine Ŭ�����Դϴ�. */

public class Book1 
{
	private String title;                  //�Ӽ� ������ ǥ���ϴ� �ʵ� 
	private int page;
	private String author;
	private static int count;
	
	public String getTitle()            //�����ڿ� ������ �޼ҵ�
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
	
	public Book1()                               //������ �޼ҵ�
	{
		super();
		this.title = "�Ҹ�";
		this.page = -1;
		this.author = "�Ҹ�";
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
