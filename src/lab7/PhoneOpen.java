package lab7;


/*1613665 ������а� �ڼ���
 * 21-06-30
 * ����ó�� �Է¹޾� ���Ͽ� �����ϰ� ����ϴ� ���α׷��Դϴ�.
 */

import java.io.*;

public class PhoneOpen 
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("c:\\temp\\phone.txt");  //���ϸ��� ��ü ���� �� ��� ����
		int c;
		
		while((c = fr.read()) != -1)   //eof�� �ƴ� ���� �ݺ�
		{
			System.out.print((char)c);  //int�� �о�� c�� char�� Ÿ��ĳ���� �� ���
		}
		
		fr.close();

	}

}
