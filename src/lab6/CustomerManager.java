package lab6;


/*박세연 1613665 영어영문학과
 * 21-06-29
 * 해시맵을 활용하여 고객 포인트 점수를 관리하는 프로그램입니다.
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class CustomerManager 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);                //스캐너, 해시맵 객체 생성
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.print("**  포인트 관리 프로그램입니다  **");
		while(true)
		{
			System.out.print("\n이름과 포인트 입력>>\t");
			String client = scan.nextLine();
			
			if(client.equals("그만"))
				break;
			
			String clientSplit[] = client.split(" ");     //받아온 고객 정보 문자열을 자르는 실행문
			Integer point = Integer.valueOf(clientSplit[1]);
			//자른 고객 정보 중 포인트를 숫자로 바꾸는 실행문
			
			if (hm.containsKey(clientSplit[0]))
				//입력받은 고객 이름이 이미 해시맵에 있을 경우 포인트 합산
			{
				int newPoint = hm.get(clientSplit[0]) + point;
				hm.put(clientSplit[0], newPoint);
			}
			else     //입력받은 고객 이름이 아직 해시맵에 없을 경우 새롭게 고객 정보를 입력
				hm.put(clientSplit[0], point);

			
			Set<String> keys = hm.keySet();
			Iterator<String> it = keys.iterator();
			
			for (int i = 0;i < hm.size();i++)                        //고객과 포인트 정보를 모두 출력
			{
				String name = it.next();
				int pnt = hm.get(name);
				System.out.print("(" + name + "," + pnt + ")");
			}
			
			scan.close();
		}
	}

}
