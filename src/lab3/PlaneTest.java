package lab3;


/*1613665 �ڼ��� ������а�
 * 21-06-24
 *Plane Ŭ������ �ۼ��ϰ� �����ڿ� ������ �޼ҵ� ����� �����ϴ� ���α׷��Դϴ�.*/

class Plane                                       //����� Ŭ���� �ۼ�
{
	private String model;                //����� �ʵ� ����
	private int seats;
	private static int planes;         //����� ����� ������ ���� ���� ����
	
	Plane()                                          //this()�� �ٸ� �����ڸ� ȣ���ϴ� �����ڵ� �ۼ�
	{
		this("", -1);
	}
	
	Plane(String model)
	{
		this(model, -1);
	}
	
	Plane(int seats)
	{
		this("�𵨸� �Ҹ�", seats);
	}
	
	Plane(String model, int seats)  //ȣ��� ������ �ۼ�
	{
		this.model = model;
		this.seats = seats;
		planes += 1;
	}
	
	public String getModel()          //private �ʵ忡 ���� �����ڿ� ������ �޼ҵ�
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public int getSeats()
	{
		return seats;
	}
	public void setSeats(int seats)
	{
		this.seats = seats;
	}
	
	public static int getPlanes()
	{
		return planes;
	}
	
	public String toString()                          //�ʵ� ������ ���ڿ��� �ٲٴ� �޼ҵ�
	{
		String s = "Plane [model=" + this.model + ", seats=" + this.seats + "]";
		return s;
	}	
}

public class PlaneTest 
{
	public static void main(String[] args) 
	{
		Plane airplane[] = new Plane[3];         //����� ��ü ���۷��� �迭 ����
		
		airplane[0] = new Plane();                    //������ �޼ҵ带 ����Ͽ� �ʵ� ���� ����
		airplane[0].setModel("���� 777");
		airplane[0].setSeats(200);
		
		airplane[1] = new Plane();
		airplane[1].setModel("������� - A380");
		airplane[1].setSeats(500);
		
		airplane[2] = new Plane();
		airplane[2].setModel("���� 737");
		airplane[2].setSeats(120);
		
		System.out.println("��ü ���� ����� �� = " + Plane.getPlanes());
		//���� �޼ҵ带 ȣ���Ͽ� ����� ��� ���
		System.out.println("�� ����� ���� ���");
		
		for (int i = 0;i < airplane.length;i++)
			//�ʵ� ������ ���ڿ��� �ٲٴ� �޼ҵ带 ȣ���Ͽ� �ʵ� ���� ���
		{
			System.out.println(airplane[i].toString());
		}
	}
}