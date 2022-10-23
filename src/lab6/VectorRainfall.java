package lab6;


/*박세연 1613665 영어영문학과
 * 21-06-29
 * 벡터를 활용하고 테스트하는 프로그램입니다.
 */

import java.util.Scanner;
import java.util.Vector;

public class VectorRainfall 
{

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		int rain;
		
		 while (true)
		{
			 int sum = 0;                                             //벡터의 값을 합산할 필드를  0으로 초기화
			System.out.print("강수량 입력 (0 입력시 종료)>>");
			rain = scan.nextInt();                              //강수량을 입력받는 실행문
			if (rain == 0)                                             //0이 입력되면 break
				break;
			else                                                           //0이 아닐 경우 벡터에 추가
				v.add(rain);
			for (int i = 0; i < v.size(); i++)               //벡터의 내용 출력
				System.out.print(v.get(i) + " ");
			System.out.print("\n현재 평균 ");
			for (int i = 0; i < v.size(); i++)               //벡터의 값 합산
				sum += v.get(i);
			System.out.print(sum / v.size() + "\n");  //개수로 나누어 평균값 출력
				
		}
		
		 scan.close();
		 
	}
}