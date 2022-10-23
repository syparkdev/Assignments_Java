package lab6;


/*�ڼ��� 1613665 ������а�
 * 21-06-29
 * �÷����� Ȱ���Ͽ� ��ȭ ������ �����ϴ� ���α׷��Դϴ�.
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class MovieTest 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		HashMap<String, Movie> hm = new HashMap<>();
		int route = 0;
		
		while (route != 6)
		{
			System.out.println("=========��ȭ ���� ����=========");
			System.out.println("1. �Է�/2. ���/3. �˻�/4. ����/5. ����/6. ����");
			System.out.print("�޴��Է�>>  ");
			route = scan.nextInt();
			scan.nextLine();
			
			switch(route)
			{
			case 1:                                     //���ο� ��ȭ �Է�
				System.out.print("����:");
				String title = scan.nextLine();
				System.out.print("����:");
				String director = scan.nextLine();
				System.out.print("�帣:");
				String genre = scan.nextLine();
				System.out.print("�⵵:");
				String year = scan.nextLine();
				
				Movie m = new Movie(title, director, genre, year);
				hm.put(title, m);
				
				break;
				
			case 2:                                 //��ȭ ������ ��� ���
				Set<String> keys = hm.keySet();
				Iterator<String> it = keys.iterator();
				
				while(it.hasNext())                        
				{
					String name = it.next();
					Movie pm = hm.get(name);
					System.out.println("[����:" + name + ", ����:" + pm.director 
							+ ", �帣:" + pm.genre + ", �����⵵:" + pm.year + "]");
				}

				break;
				
			case 3:                                          //��ȭ�� �ִ��� Ȯ���ϰ� �˻�
				System.out.print("�˻��� ���� �Է�:  ");
				String search = scan.nextLine();
				if(hm.containsKey(search))
				{
					Movie fm = hm.get(search);
					System.out.println("[����:" + search + ", ����:" + fm.director 
							+ ", �帣:" + fm.genre + ", �����⵵:" + fm.year + "]");
				}
				else
					System.out.println("��ϵ��� ���� ��ȭ�Դϴ�.");


				break;
				
			case 4:                                     //��ȭ�� �ִ��� Ȯ���ϰ� ����
				System.out.print("������ ���� �Է�:  ");
				String update = scan.nextLine();
				if(hm.containsKey(update))
				{
					Movie um = hm.get(update);
					System.out.println("[����:" + um.title + ", ����:" + um.director 
							+ ", �帣:" + um.genre + ", �����⵵:" + um.year + "]");
					hm.remove(update);
					
					System.out.print("����:");
					String uTitle = scan.nextLine();
					System.out.print("����:");
					String uDirector = scan.nextLine();
					System.out.print("�帣:");
					String uGenre = scan.nextLine();
					System.out.print("�⵵:");
					String uYear = scan.nextLine();
					
					Movie nm = new Movie(uTitle, uDirector, uGenre, uYear);
					hm.put(uTitle, nm);
				}
				else
					System.out.println("��ϵ��� ���� ��ȭ�Դϴ�.");
					

				break;
				
			case 5:                                     //��ȭ�� �ִ��� Ȯ���ϰ� ����
				System.out.print("������ ���� �Է�:  ");
				String del = scan.nextLine();
				if(hm.containsKey(del))
				{
					hm.remove(del);
					System.out.println(del + "�� �����߽��ϴ�.");
				}
				else
					System.out.println("��ϵ��� ���� ��ȭ�Դϴ�.");
				

				break;
				
			case 6:

				break;
				
				default:
					System.out.println("1~6 ������ �޴��� �Է��ϼ���.");

			}
			
			
		}

		scan.close();
	}

}