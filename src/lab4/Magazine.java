package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * Book1 Ŭ������ �� Ŭ������ ����� Magazine Ŭ�����Դϴ�. */


public class Magazine extends Book1
{
	private String date;                                             //�Ӽ� ������ ǥ���ϴ� �ʵ�

	public String getDate()                         //�����ڿ� ������ �޼ҵ�
	{
		return date;
	}

	public void setDate(String date) 
	{
		this.date = date;
	}

	public Magazine()                                //������ �޼ҵ�
	{
		super();
		this.date = "�Ҹ�";
	}

	public Magazine(String title, int page, String author, String date) 
	{
		super(title, page, author);
		this.date = date;
	}
}
