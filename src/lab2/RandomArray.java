package lab2;


/*�ڼ��� 1613665 ������а�
21-06-23
������ ������ ������ �Է¹޾� ���� �迭�� ������ �����ϰ� �����ϰ� ����ϴ� ���α׷��Դϴ�.*/

import java.util.Scanner;

public class RandomArray 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);      //��ĳ�� ��ü ����
		System.out.print("���� �? ");                         //����ڷκ��� �Է��� �ޱ� ���� ��¹�
		int count = scan.nextInt();                                 //��ĳ�ʸ� ���� �Է°� ����	
		int intArray[] = new int [count];                       //�Է°� ũ���� �迭 ����
		
		for (int i = 0;i < count;i++)
		{
			int num = (int)(Math.random() * 100 + 1); //���� ����

			int same = 0;                  //�迭�� ������ ���� ���� �ֳ� üũ�ϱ� ���� ����
			
			for (int j = 0;j < i;j++)
			{
				if (intArray[j] == num) //�迭�� ������ ���� ���� ���� ��� same�� 1�� ����
					same = 1;
			}
			
			if (same == 0)                   //�迭�� ������ ���� ���� ������ i��°�� ������ ����
				intArray[i] = num;
			else                                    //���� ���� ������ i���� 1�� ���� ��õ�
				i--;
		}
		
		for (int k = 0;k < count;k++)
			System.out.print(intArray[k]+ "\t");
		
		scan.close();

	}
}