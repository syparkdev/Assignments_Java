package lab3;


/*1613665 �ڼ��� ������а�
 * 21-06-24
 *Dice Ŭ������ �ۼ��ϰ� �ֻ����� ���� ��ǥ�� ������ �������� ���� Ƚ���� ���� ���α׷��Դϴ�.*/

class Dice                      //�ֻ��� Ŭ���� �ۼ�
{
	private int value;
	
	public Dice()            //������ �ۼ�
	{
		value = 0;
	}
	
	void roll()                 //�ֻ����� ������ ������ �����ϴ� �޼ҵ�
	{
		this.value = (int)(Math.random() * 6 + 1);
	}
	
	int getValue()         //private �ʵ��� value�� ���� ������ �޼ҵ�
	{
		return value;
	}
}

public class DiceTest 
{
	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();                  //�ֻ��� ��ü 2�� ����
		Dice dice2 = new Dice();
		
		int count = 0;                                    //Ƚ���� ����� �ʵ�
		
		do
		{
			dice1.roll();                                    //�ֻ��� 2���� ���� ���� ����
			dice2.roll();
			
			System.out.println("�ֻ���1= " + dice1.getValue() + " �ֻ���2= " + dice2.getValue());
			//������ ���� �� ���	
			count++;       //���� Ƚ�� ����
		} while((dice1.getValue() + dice2.getValue()) != 2);     //�� �ֻ��� ���� ���� ���ؼ� 2�϶� ����
		
		System.out.println("(1,1)�� �����µ� �ɸ� Ƚ�� = " + count);
		//���� ���ǿ� �����ϱ���� �õ��� Ƚ�� ���
	}
}