package lab7;


/*1613665 ������а� �ڼ���
 * 21-06-30
 * ����ó�� �Է¹޾� ���Ͽ� �����ϰ� ����ϴ� ���α׷��Դϴ�.
 */

import java.util.Scanner;
import java.io.*;

public class PhoneSave 
{
	public static void main(String[] args) throws IOException   //���� ó��
	{
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter("c:\\temp\\phone.txt");  //���϶����� ��ü ���� �� ��� ����
		String input;
				
		while (true)
		{
			
			System.out.print("�̸� ��ȭ��ȣ >> ");
			input = scan.nextLine();                             //���ڿ��� �Է¹޴� ���๮
			if (input.equals("�׸�"))
				break;
			else
			{
				fw.write(input, 0, input.length());             //���� ���ڿ��� ���Ͽ� ����
				fw.write("\r\n", 0, 2);
			}
			
		} 
			
		
		fw.close();
		scan.close();
		
			
	}	
}
