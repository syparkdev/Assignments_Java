package lab2;


/*�ڼ��� 1613665 ������а�
21-06-23
������ ������ ������ �Է¹޾� ���� �迭�� ������ �����ϰ� �����ϰ� ����ϴ� ���α׷��Դϴ�.*/

public class twoDArray 
{

	public static void main(String[] args) 
	{
		int intArray[][] = { {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0} };
		//4x4 �迭 �����ϰ� 0���� �ʱ�ȭ


		for (int i = 0;i < 10;i++)
		{

			int num = (int)(Math.random() * 10 + 1);   //���� ����
			int row = (int)(Math.random() * 3);             //�� �ε��� ����
			int col = (int)(Math.random() * 3);              //�� �ε��� ����
			
			if (intArray[row][col] != 0)                                       //�迭 ���Ұ� 0�� �ƴϸ� �ǳʶ�
				i--;
			else                          //0�̸� ���� ���� ����
				intArray[row][col] = num;	
		}
	
		for (int i = 0;i < 4;i++)         //2���� �迭 ����ϴ� �ݺ���
			{
				for (int j = 0;j < 4;j++)
					System.out.print(intArray[i][j] + "\t");
				System.out.print("\n");
			}
	}
}
