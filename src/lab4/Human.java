package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * Human Ŭ������ �� Ŭ������ ����� Student Ŭ������ �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

public class Human 
{
	private String name;                        //�Ӽ� ������ ǥ���� �ʵ�
	private int age;
	
	public String getName()                  //�����ڿ� ������ �޼ҵ�
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
	
	public Human()                                           //������ �޼ҵ�
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
	public String toString()                             //�ʵ� ������ ���ڿ��� �����ϴ� �޼ҵ�
	{
		return "�̸�: " + name + ", ����: " + age + "\n";
	}
}
