package lab3;


/*1613665 �ڼ��� ������а�
 * 21-06-24
 * Rectangle Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�.*/

public class Rectangle            //Rectangle Ŭ���� �ۼ�
{
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height)   //Rectangle ������ �ۼ�
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square()                                                                     //���簢���� ���̸� ��ȯ�ϴ� �޼ҵ�
	{
		return (width * height);
	}
	
	void show()                                                                     //���簢���� �ʵ� ������ ����ϴ� �޼ҵ�
	{
		System.out.println("(" + x + "," + y + ")���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}
	
	boolean contains(Rectangle r)
	//���� ���簢���� �Ķ���� ���簢���� �����ϴ��� üũ�ϴ� �޼ҵ�
	{
		if (this.x < r.x && r.x < (this.x + this.width) &&
				this.y < r.y && r.y < (this.y + this.height) &&
				r.width < (this.width - (r.x - this.x)) && r.height < (this.height - (r.y - this.y)))
			return true;
		else
			return false;
	}

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(2, 2, 8, 7);               //�� ���� ���簢�� �ν��Ͻ� ����
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();                                                                       //���簢�� r�� �ʵ� ������ ���
		System.out.println("s�� ������ " + s.square());      //���簢�� s�� ���̸� ���
		
		if(t.contains(r))                 //���簢�� r�� s�� t�� ���ԵǴ��� Ȯ�� �� ����� ���
			System.out.println("t�� r�� �����մϴ�.");
		
		if(t.contains(s))
				System.out.println("t�� s�� �����մϴ�.");
	}
}
