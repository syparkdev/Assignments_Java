package lab6;


/*�ڼ��� 1613665 ������а�
 * 21-06-29
 * �ؽø��� Ȱ���ϰ� �׽�Ʈ�ϴ� ���α׷��Դϴ�.
 */

import java.util.Scanner;
import java.util.HashMap;

public class LocationManager 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);                //��ĳ��, �ؽø� ��ü ����
		HashMap<String, Location> hm = new HashMap<>();
		Location cities[] = new Location[4];                          //�����̼� ��ü ���۷��� �迭 ����
		
		System.out.println("����,����,�浵�� �Է��ϼ���.");
		for (int i = 0; i < 4; i++)
		{
			System.out.print(">>\t");
			String cityInfo = scan.nextLine();                 //���� ������ �Է¹޴� ���๮
			String cityInfoSplit[] = cityInfo.split(",");     //�޾ƿ� ���� ���� ���ڿ��� �ڸ��� ���๮
			Float f1 = Float.valueOf(cityInfoSplit[1]);   //�ڸ� ���� ���� �� �浵�� ���ڷ� �ٲٴ� ���๮
			Float f2 = Float.valueOf(cityInfoSplit[2]);   //�ڸ� ���� ���� �� ������ ���ڷ� �ٲٴ� ���๮
			cities[i] = new Location(cityInfoSplit[0], f1, f2);
			//������ ���� ������ �Ű� ������ �����̼� ��ü ����
			hm.put(cityInfoSplit[0], cities[i]);                 //������ �����̼� ��ü�� �ؽøʿ� ���
		}
		
		System.out.println("--------------------------");
		for (int i = 0; i < 4; i++)          //���� ������ ���� ���
		{
			System.out.println(cities[i].getName() + "\t" 
		                                    + cities[i].getVertical() + "\t" 
					                        +cities[i].getHorizontal());
		}
		System.out.println("--------------------------");
		
		String key = "";
		while(true)
		{
			System.out.print("���� �̸� >> ");              //�˻��� Ű���� �Է¹���
			key = scan.nextLine();
			if(key.equals("�׸�"))                                     //Ű�� �׸��̸� break
				break;
			else if (!hm.containsKey(key))                    //Ű�� �ؽøʿ� ������ ���ٴ� �޽����� ���
			{
				System.out.println(key + "�� �����ϴ�.");
			}
			else                                      //Ű�� ������ ��ȯ���� �����̼� ��ü�� ������ ���
			{
				Location where = hm.get(key);
				System.out.println(where.getName() +  "\t" 
						                      + where.getVertical() +  "\t" 
						                      + where.getHorizontal() +  "\t" );
			}
		}
				
		scan.close();

	}

}