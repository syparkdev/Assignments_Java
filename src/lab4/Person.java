package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * Person Ŭ������ �� Ŭ������ ����� Customer Ŭ�����Դϴ�. */

public class Person 
{
	private String name;                  //�Ӽ� ������ ǥ���ϴ� �ʵ�
	private String home;
	private String tel;
	
	public String getName()             //�����ڿ� ������ �޼ҵ�
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
	
	public Person()                                            //������ �޼ҵ�
	{
		super();
		this.name = "�Ҹ�";
		this.home = "�Ҹ�";
		this.tel = "�Ҹ�";
	}
	
	public Person(String name, String home, String tel) 
	{
		super();
		this.name = name;
		this.home = home;
		this.tel = tel;
	}
}
