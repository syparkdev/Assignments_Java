package lab7;


/*1613665 ������а� �ڼ���
 * 21-06-30
 * ���� ���뿡 ���� ��ȣ�� �ٿ� ����ϴ� ���α׷��Դϴ�.
 */

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import java.io.*;

public class FileLineNumber 
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("c:\\temp\\phone.txt");     //���ϸ��� ��ü ���� �� ��� ����
		Scanner scan = new Scanner(fr);                                      //���ϸ��� ��ü�� �Ű� ������ �ϴ� ��ĳ�� ��ü ����
		Vector<String> line = new Vector<String>();                 //������ line�� ������ ���ڿ� ���� ����
		Iterator<String> it = line.iterator();                                                 //���Ϳ� ���� Iterator ��ü ����
		
		int i = 0;

		System.out.println("c:\\temp\\phone.txt ������ �о� ����մϴ�.");
		
		 do
		{
			if (scan.hasNextLine())                                                            //���� ������ �ִٸ�
			{
				line.add(scan.nextLine());                                                   //������ �о� ���Ϳ� ����
			}
			if ( i < line.size())                                                                       //���Ϳ� ����� ������ ������ŭ�� �ݺ��ϱ� ���� ����
			{
				System.out.printf("%4d:\t", i + 1);                            //���� �ѹ� ǥ��
				System.out.print(line.get(i) + "\n");                                //i��° ���� ���
				i++;
			}
		} while (it.hasNext());                                                              //���� ������ ���� ���� �ݺ�
		
		fr.close();
		scan.close();

	}

}
