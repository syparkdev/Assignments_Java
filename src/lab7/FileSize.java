package lab7;


/*1613665 ������а� �ڼ���
 * 21-06-30
 * c:���� ���� ū ������ �̸��� ũ�⸦ ����ϴ� ���α׷��Դϴ�.
 */

import java.io.File;

public class FileSize 
{

	public static void main(String[] args) 
	{
		File f = new File("c:\\");                               //���� ��ü ���� �� ��� ����
		File[] subfiles = f.listFiles();                            //��� �� ���� ���� ����Ʈ �迭 ����
		File big = subfiles[0];                                      //���� ū ������ ������ ���� ��ü ���� �� �ʱ�ȭ
		
		for(int i = 1;i < subfiles.length;i++)             //���� ū ������ ã�� �ݺ���
		{
			if (big.length() < subfiles[i].length())
			{
				big = subfiles[i];
			}
		}
		
		System.out.print("���� ū ������ " + big.getPath() + "  " + big.length() + "����Ʈ");  //��� ���

	}

}
