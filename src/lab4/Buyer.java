package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * ����Ŭ������ ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

public class Buyer 
{
	int money;                                            //�ʵ� ����

	public Buyer(int money)                   //������ �޼ҵ�
	{
		super();
		this.money = money;
	}
	
	public void buy(Item t, int n)            //���Ÿ� �����ϴ� �޼ҵ�
	{
		System.out.println(t + "=>" + n + "�� ����");
		
		if( this.money > (t.price * n) )       //�ܾװ� ��ǰ ������ ���ؼ� ����� ����ϴ� ���ǹ�
		{
			this.money -= (t.price * n);
			System.out.println("���� �Ϸ� �� �ܾ� : " + this.money);
		}
		else
			System.out.println("�ܾ� ���� : " + this.money);
	}
}