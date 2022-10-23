package lab2;


/*박세연 1613665 영어영문학과
21-06-23
저장할 정수의 개수를 입력받아 정수 배열에 정수를 랜덤하게 삽입하고 출력하는 프로그램입니다.*/

public class twoDArray 
{

	public static void main(String[] args) 
	{
		int intArray[][] = { {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0} };
		//4x4 배열 생성하고 0으로 초기화


		for (int i = 0;i < 10;i++)
		{

			int num = (int)(Math.random() * 10 + 1);   //난수 생성
			int row = (int)(Math.random() * 3);             //행 인덱스 생성
			int col = (int)(Math.random() * 3);              //열 인덱스 생성
			
			if (intArray[row][col] != 0)                                       //배열 원소가 0이 아니면 건너뜀
				i--;
			else                          //0이면 랜덤 숫자 저장
				intArray[row][col] = num;	
		}
	
		for (int i = 0;i < 4;i++)         //2차원 배열 출력하는 반복문
			{
				for (int j = 0;j < 4;j++)
					System.out.print(intArray[i][j] + "\t");
				System.out.print("\n");
			}
	}
}
