package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * Person Ŭ������ �� Ŭ������ ����� Customer Ŭ�����Դϴ�. */

public class Customer extends Person
{
	private String clientNum;                //�Ӽ� ������ ǥ���ϴ� �ʵ�
	private int milage;
	
	public String getClientNum()           //�����ڿ� ������ �޼ҵ�
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
	
	public Customer()                           //������ �޼ҵ�
	{
		super();
		this.clientNum = "�Ҹ�";
		this.milage = 0;
	}
	
	public Customer(String name, String home, String tel, String clientNum, int milage) 
	//�Ű������� �ִ� ���� Ŭ������ �����ڸ� ȣ���ϴ� ������ �޼ҵ�
	{
		super(name, home, tel);
		this.clientNum = clientNum;
		this.milage = milage;
	}
}
