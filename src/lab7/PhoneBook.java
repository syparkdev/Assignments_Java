package lab7;


/*1613665 ������а� �ڼ���
 * 21-06-30
 * ������ �о� �ؽøʿ� �����ϰ� �̸��� �Է¹޾� ���� ����ϴ� ���α׷��Դϴ�.
 */

import java.util.Scanner;
import java.util.Vector;
import java.util.HashMap;
import java.io.*;

public class PhoneBook 
{
	public static void main(String[] args) throws IOException
	{
		Vector<String> v = new Vector<String>();                                    //���Ͽ��� ���� ������ ������ ����
		HashMap<String, String> h = new HashMap<>();                       //�˻��� ���� �ؽø�
		FileReader fr = new FileReader("c:\\Temp\\phone.txt");   //�о�� ���ϸ��� ��ü
		Scanner scanFile = new Scanner(fr);                            //������ ���� ��ĳ��
		Scanner scanInput = new Scanner(System.in);          //�Է��� ���� ��ĳ��
		int i = 0;
		String key = "";
		
		while (scanFile.hasNextLine())
		{
			v.add(scanFile.nextLine());                                                   //������ �о� ���Ϳ� ����
		}
		
		while ( i < v.size())                                                          //���Ϳ� ����� ������ ������ŭ�� �ݺ��ϱ� ���� ����
		{
			String[] infoCut = (v.get(i)).split(" ");                      //���Ϳ� ����� ������ Ű�� ������ �ڸ�
			h.put(infoCut[0], infoCut[1]);                                 //�ڸ� Ű�� ���� �ؽøʿ� ���
			i++;
		}
		
		System.out.println("�� " + v.size() + "���� ��ȭ��ȣ�� �о����ϴ�.");   //�о�� ������ ���� ��� �޽���
		
		while (true)
		{
			System.out.print("�̸�>>\t");
			key = scanInput.nextLine();                //Ű�� �޾ƿ��� ���๮
			if (key.equals("�׸�"))                            //�׸� �Է� �� ����
				break;
			else                                                         //Ű�� �Է� �� �� ���
				System.out.println(h.get(key));
		}
		
		fr.close();
		scanFile.close();
		scanInput.close();

	}
}