package lab7;


/*�ڼ��� 1613665 ������а�
 * 21-06-30
 * Lab 6_5�� ���� ����� ���� ���� ����� �߰��� ���α׷��Դϴ�.
 */

import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.HashMap;
import java.util.Iterator;
import java.io.*;

class Movie implements Serializable
{
	String title, director, genre, year;              //��ȭ ���� �ʵ�

	
	public Movie() 
	{
		super();
	}


	public Movie(String title, String director, String genre, String year) //������
	{
		super();
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	
}

public class MovieTest 
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		HashMap<String, Movie> hm = new HashMap<>();
		Vector<Movie> vm = new Vector<>();

		int route = 0;
		
		while (route != 6)
		{
			System.out.println("1. ��ȭ �Է�/2. ��ȭ ���/3. ��ȭ �˻�/4. ���� ����/5. ���� ����/6. ����");
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
				vm.add(m);
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
				
			case 3:                                          //��ȭ ������ �˻�

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
				
			case 4:                                     //��ȭ ������ ����
				
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movie.dat"));
				//oos��ü ����
				

				oos.writeObject(vm);     //��ȭ ��ü�� ������ ���͸� ���Ͽ� ����
				
				System.out.println("movie.dat�� ����Ǿ����ϴ�.");
				oos.close();
				
				break;
				
			case 5:                                     //��ȭ ������ ����
				
				ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("D:\\dev\\eclipse-workspace\\Lab 7\\movie.dat"));
				//ois��ü ����
				
				Vector<Movie> vmTemp = (Vector<Movie>)ois.readObject();    //�о�� ���͸� �˸°� ����ȯ�ؼ� ����
				vm = vmTemp;
				
				ois.close();

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