package lab6;


/*�ڼ��� 1613665 ������а�
 * 21-06-29
 * ���͸� Ȱ���ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�.
 */

import java.util.Scanner;
import java.util.Vector;

public class VectorTest 
{
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		int num = 0, bigIndex = 0, littleIndex = 0;
		
		System.out.print("���� (-1�� �Էµ� ������)>>");
		
		while (true)                //������ �Է¹޾� -1�� �ƴϸ� ���Ϳ� �߰��ϰ� ������ break
		{
			num = scan.nextInt();
			if (num != -1)
				v.add(num);
			else
				break;
		}
		
		System.out.print("���� ��:");            //���� ���� ���͸� ���
		System.out.print("[");
		for (int i = 0; i < v.size(); i++)
		{
			System.out.print(v.get(i));
			if (i == (v.size() - 1))
				System.out.print("]\n");
			else
				System.out.print(", ");
		}
		
		for (int i = 1; i < v.size(); i++)         //���� ū ���� �ε����� ���ϴ� �ݺ���
		{
			if(v.get(i) > v.get(bigIndex))
				bigIndex = i;
		}
		
		System.out.print("���� ū �� " + v.get(bigIndex) + " ����\n");
		v.remove(bigIndex);                //���� ū ���� �����ϰ� �ٽ� ���͸� ���
		System.out.print("[");
		for (int i = 0; i < v.size(); i++)
		{
			System.out.print(v.get(i));
			if (i == (v.size() - 1))
				System.out.print("]\n");
			else
				System.out.print(", ");
		}
		
		for (int i = 1; i < v.size(); i++)         //���� ���� ���� �ε����� ���ϴ� �ݺ���
		{
			if(v.get(i) < v.get(littleIndex))
				littleIndex = i;
		}
		
		System.out.print("���� ���� �� " + v.get(littleIndex) + " ����\n");
		v.remove(littleIndex);                //���� ���� ���� �����ϰ� �ٽ� ���͸� ���
		System.out.print("[");
		for (int i = 0; i < v.size(); i++)
		{
			System.out.print(v.get(i));
			if (i == (v.size() - 1))
				System.out.print("]\n");
			else
				System.out.print(", ");
		}
		
		scan.close();

	}
}