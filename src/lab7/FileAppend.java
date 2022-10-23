package lab7;


/*1613665 ������а� �ڼ���
 * 21-06-30
 * �� ���� ������ ���� ���ο� ������ �����ϴ� ���α׷��Դϴ�.
 */

import java.util.Scanner;
import java.io.*;

public class FileAppend 
{

	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		int c;
		
		//���� �̸� �Է¹޾� ���ϸ����� ���϶����� ��ü�� ����
		System.out.println("��ü ��ΰ� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String name1 = scan.next();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		String name2 = scan.next();
		System.out.print("��ġ�� ���� �̸��� �Է��ϼ���>>");
		String combined = scan.next();

		FileReader fr1 = new FileReader(name1);
		FileReader fr2 = new FileReader(name2);
		FileWriter fw = new FileWriter(combined);
		
		while((c = fr1.read()) != -1)   //eof�� �ƴ� ���� fr1���� �� ���ھ� �о���� �ݺ�
		{
			fw.write((char)c);  //int�� �о�� c�� char�� Ÿ��ĳ���� �� ���
		}
		
		while((c = fr2.read()) != -1)   //eof�� �ƴ� ���� fr2���� �� ���ھ� �о���� �ݺ�
		{
			fw.write((char)c);  //int�� �о�� c�� char�� Ÿ��ĳ���� �� ���
		}

		fr1.close();
		fr2.close();
		fw.close();
		scan.close();
	}

}
