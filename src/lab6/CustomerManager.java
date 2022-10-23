package lab6;


/*�ڼ��� 1613665 ������а�
 * 21-06-29
 * �ؽø��� Ȱ���Ͽ� �� ����Ʈ ������ �����ϴ� ���α׷��Դϴ�.
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class CustomerManager 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);                //��ĳ��, �ؽø� ��ü ����
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.print("**  ����Ʈ ���� ���α׷��Դϴ�  **");
		while(true)
		{
			System.out.print("\n�̸��� ����Ʈ �Է�>>\t");
			String client = scan.nextLine();
			
			if(client.equals("�׸�"))
				break;
			
			String clientSplit[] = client.split(" ");     //�޾ƿ� �� ���� ���ڿ��� �ڸ��� ���๮
			Integer point = Integer.valueOf(clientSplit[1]);
			//�ڸ� �� ���� �� ����Ʈ�� ���ڷ� �ٲٴ� ���๮
			
			if (hm.containsKey(clientSplit[0]))
				//�Է¹��� �� �̸��� �̹� �ؽøʿ� ���� ��� ����Ʈ �ջ�
			{
				int newPoint = hm.get(clientSplit[0]) + point;
				hm.put(clientSplit[0], newPoint);
			}
			else     //�Է¹��� �� �̸��� ���� �ؽøʿ� ���� ��� ���Ӱ� �� ������ �Է�
				hm.put(clientSplit[0], point);

			
			Set<String> keys = hm.keySet();
			Iterator<String> it = keys.iterator();
			
			for (int i = 0;i < hm.size();i++)                        //���� ����Ʈ ������ ��� ���
			{
				String name = it.next();
				int pnt = hm.get(name);
				System.out.print("(" + name + "," + pnt + ")");
			}
			
			scan.close();
		}
	}

}
