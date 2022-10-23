package lab6;


/*박세연 1613665 영어영문학과
 * 21-06-29
 * 벡터를 활용하고 테스트하는 프로그램입니다.
 */

import java.util.Scanner;
import java.util.Vector;

public class VectorTest 
{
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		int num = 0, bigIndex = 0, littleIndex = 0;
		
		System.out.print("정수 (-1이 입력될 때까지)>>");
		
		while (true)                //정수를 입력받아 -1이 아니면 벡터에 추가하고 맞으면 break
		{
			num = scan.nextInt();
			if (num != -1)
				v.add(num);
			else
				break;
		}
		
		System.out.print("삭제 전:");            //삭제 전의 벡터를 출력
		System.out.print("[");
		for (int i = 0; i < v.size(); i++)
		{
			System.out.print(v.get(i));
			if (i == (v.size() - 1))
				System.out.print("]\n");
			else
				System.out.print(", ");
		}
		
		for (int i = 1; i < v.size(); i++)         //가장 큰 수의 인덱스를 구하는 반복문
		{
			if(v.get(i) > v.get(bigIndex))
				bigIndex = i;
		}
		
		System.out.print("가장 큰 수 " + v.get(bigIndex) + " 삭제\n");
		v.remove(bigIndex);                //가장 큰 수를 삭제하고 다시 벡터를 출력
		System.out.print("[");
		for (int i = 0; i < v.size(); i++)
		{
			System.out.print(v.get(i));
			if (i == (v.size() - 1))
				System.out.print("]\n");
			else
				System.out.print(", ");
		}
		
		for (int i = 1; i < v.size(); i++)         //가장 작은 수의 인덱스를 구하는 반복문
		{
			if(v.get(i) < v.get(littleIndex))
				littleIndex = i;
		}
		
		System.out.print("가장 작은 수 " + v.get(littleIndex) + " 삭제\n");
		v.remove(littleIndex);                //가장 작은 수를 삭제하고 다시 벡터를 출력
		System.out.print("[");
		for (int i = 0; i < v.size(); i++)
		{
			System.out.print(v.get(i));
			if (i == (v.size() - 1))
				System.out.print("]\n");
			else
				System.out.print(", ");
		}
		
		scan.close();

	}
}