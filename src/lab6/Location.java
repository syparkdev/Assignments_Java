package lab6;


/*�ڼ��� 1613665 ������а�
 * 21-06-29
 * �ؽø��� Ȱ���ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�.
 */

public class Location 
{
	private String name;                                           //��ü�� ������ ǥ���ϴ� �ʵ�
	private float vertical, horizontal;
	
	public Location(String name, float vertical, float horizontal)   //������
	{
		super();
		this.name = name;
		this.vertical = vertical;
		this.horizontal = horizontal;
	}

	public String getName()                               //�����ڿ� ������
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getVertical() 
	{
		return vertical;
	}

	public void setVertical(float vertical) 
	{
		this.vertical = vertical;
	}

	public double getHorizontal() 
	{
		return horizontal;
	}

	public void setHorizontal(float horizontal) 
	{
		this.horizontal = horizontal;
	}

}