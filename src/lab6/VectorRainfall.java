package lab6;


/*�ڼ��� 1613665 ������а�
 * 21-06-29
 * ���͸� Ȱ���ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�.
 */

import java.util.Scanner;
import java.util.Vector;

public class VectorRainfall 
{

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		int rain;
		
		 while (true)
		{
			 int sum = 0;                                             //������ ���� �ջ��� �ʵ带  0���� �ʱ�ȭ
			System.out.print("������ �Է� (0 �Է½� ����)>>");
			rain = scan.nextInt();                              //�������� �Է¹޴� ���๮
			if (rain == 0)                                             //0�� �ԷµǸ� break
				break;
			else                                                           //0�� �ƴ� ��� ���Ϳ� �߰�
				v.add(rain);
			for (int i = 0; i < v.size(); i++)               //������ ���� ���
				System.out.print(v.get(i) + " ");
			System.out.print("\n���� ��� ");
			for (int i = 0; i < v.size(); i++)               //������ �� �ջ�
				sum += v.get(i);
			System.out.print(sum / v.size() + "\n");  //������ ������ ��հ� ���
				
		}
		
		 scan.close();
		 
	}
}