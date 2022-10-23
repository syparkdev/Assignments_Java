package lab6;


/*박세연 1613665 영어영문학과
 * 21-06-29
 * 해시맵을 활용하고 테스트하는 프로그램입니다.
 */

import java.util.Scanner;
import java.util.HashMap;

public class LocationManager 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);                //스캐너, 해시맵 객체 생성
		HashMap<String, Location> hm = new HashMap<>();
		Location cities[] = new Location[4];                          //로케이션 객체 레퍼런스 배열 생성
		
		System.out.println("도시,위도,경도를 입력하세요.");
		for (int i = 0; i < 4; i++)
		{
			System.out.print(">>\t");
			String cityInfo = scan.nextLine();                 //도시 정보를 입력받는 실행문
			String cityInfoSplit[] = cityInfo.split(",");     //받아온 도시 정보 문자열을 자르는 실행문
			Float f1 = Float.valueOf(cityInfoSplit[1]);   //자른 도시 정보 중 경도를 숫자로 바꾸는 실행문
			Float f2 = Float.valueOf(cityInfoSplit[2]);   //자른 도시 정보 중 위도를 숫자로 바꾸는 실행문
			cities[i] = new Location(cityInfoSplit[0], f1, f2);
			//가공한 도시 정보를 매개 변수로 로케이션 객체 생성
			hm.put(cityInfoSplit[0], cities[i]);                 //생성한 로케이션 객체를 해시맵에 등록
		}
		
		System.out.println("--------------------------");
		for (int i = 0; i < 4; i++)          //도시 정보를 전부 출력
		{
			System.out.println(cities[i].getName() + "\t" 
		                                    + cities[i].getVertical() + "\t" 
					                        +cities[i].getHorizontal());
		}
		System.out.println("--------------------------");
		
		String key = "";
		while(true)
		{
			System.out.print("도시 이름 >> ");              //검색할 키값을 입력받음
			key = scan.nextLine();
			if(key.equals("그만"))                                     //키가 그만이면 break
				break;
			else if (!hm.containsKey(key))                    //키가 해시맵에 없으면 없다는 메시지를 출력
			{
				System.out.println(key + "는 없습니다.");
			}
			else                                      //키가 있으면 반환받은 로케이션 객체의 정보를 출력
			{
				Location where = hm.get(key);
				System.out.println(where.getName() +  "\t" 
						                      + where.getVertical() +  "\t" 
						                      + where.getHorizontal() +  "\t" );
			}
		}
				
		scan.close();

	}

}