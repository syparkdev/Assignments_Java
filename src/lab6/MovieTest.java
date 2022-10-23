package lab6;


/*박세연 1613665 영어영문학과
 * 21-06-29
 * 컬렉션을 활용하여 영화 정보를 관리하는 프로그램입니다.
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class MovieTest 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		HashMap<String, Movie> hm = new HashMap<>();
		int route = 0;
		
		while (route != 6)
		{
			System.out.println("=========영화 정보 관리=========");
			System.out.println("1. 입력/2. 출력/3. 검색/4. 수정/5. 삭제/6. 종료");
			System.out.print("메뉴입력>>  ");
			route = scan.nextInt();
			scan.nextLine();
			
			switch(route)
			{
			case 1:                                     //새로운 영화 입력
				System.out.print("제목:");
				String title = scan.nextLine();
				System.out.print("감독:");
				String director = scan.nextLine();
				System.out.print("장르:");
				String genre = scan.nextLine();
				System.out.print("년도:");
				String year = scan.nextLine();
				
				Movie m = new Movie(title, director, genre, year);
				hm.put(title, m);
				
				break;
				
			case 2:                                 //영화 정보를 모두 출력
				Set<String> keys = hm.keySet();
				Iterator<String> it = keys.iterator();
				
				while(it.hasNext())                        
				{
					String name = it.next();
					Movie pm = hm.get(name);
					System.out.println("[제목:" + name + ", 감독:" + pm.director 
							+ ", 장르:" + pm.genre + ", 개봉년도:" + pm.year + "]");
				}

				break;
				
			case 3:                                          //영화가 있는지 확인하고 검색
				System.out.print("검색할 제목 입력:  ");
				String search = scan.nextLine();
				if(hm.containsKey(search))
				{
					Movie fm = hm.get(search);
					System.out.println("[제목:" + search + ", 감독:" + fm.director 
							+ ", 장르:" + fm.genre + ", 개봉년도:" + fm.year + "]");
				}
				else
					System.out.println("등록되지 않은 영화입니다.");


				break;
				
			case 4:                                     //영화가 있는지 확인하고 수정
				System.out.print("수정할 제목 입력:  ");
				String update = scan.nextLine();
				if(hm.containsKey(update))
				{
					Movie um = hm.get(update);
					System.out.println("[제목:" + um.title + ", 감독:" + um.director 
							+ ", 장르:" + um.genre + ", 개봉년도:" + um.year + "]");
					hm.remove(update);
					
					System.out.print("제목:");
					String uTitle = scan.nextLine();
					System.out.print("감독:");
					String uDirector = scan.nextLine();
					System.out.print("장르:");
					String uGenre = scan.nextLine();
					System.out.print("년도:");
					String uYear = scan.nextLine();
					
					Movie nm = new Movie(uTitle, uDirector, uGenre, uYear);
					hm.put(uTitle, nm);
				}
				else
					System.out.println("등록되지 않은 영화입니다.");
					

				break;
				
			case 5:                                     //영화가 있는지 확인하고 삭제
				System.out.print("삭제할 제목 입력:  ");
				String del = scan.nextLine();
				if(hm.containsKey(del))
				{
					hm.remove(del);
					System.out.println(del + "를 삭제했습니다.");
				}
				else
					System.out.println("등록되지 않은 영화입니다.");
				

				break;
				
			case 6:

				break;
				
				default:
					System.out.println("1~6 사이의 메뉴를 입력하세요.");

			}
			
			
		}

		scan.close();
	}

}