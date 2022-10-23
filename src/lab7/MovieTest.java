package lab7;


/*박세연 1613665 영어영문학과
 * 21-06-30
 * Lab 6_5에 파일 저장과 파일 열기 기능을 추가한 프로그램입니다.
 */

import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.HashMap;
import java.util.Iterator;
import java.io.*;

class Movie implements Serializable
{
	String title, director, genre, year;              //영화 정보 필드

	
	public Movie() 
	{
		super();
	}


	public Movie(String title, String director, String genre, String year) //생성자
	{
		super();
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	
}

public class MovieTest 
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		HashMap<String, Movie> hm = new HashMap<>();
		Vector<Movie> vm = new Vector<>();

		int route = 0;
		
		while (route != 6)
		{
			System.out.println("1. 영화 입력/2. 영화 출력/3. 영화 검색/4. 파일 저장/5. 파일 열기/6. 종료");
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
				vm.add(m);
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
				
			case 3:                                          //영화 정보를 검색

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
				
			case 4:                                     //영화 파일을 저장
				
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movie.dat"));
				//oos객체 생성
				

				oos.writeObject(vm);     //영화 객체를 저장한 벡터를 파일에 저장
				
				System.out.println("movie.dat에 저장되었습니다.");
				oos.close();
				
				break;
				
			case 5:                                     //영화 파일을 열기
				
				ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("D:\\dev\\eclipse-workspace\\Lab 7\\movie.dat"));
				//ois객체 생성
				
				Vector<Movie> vmTemp = (Vector<Movie>)ois.readObject();    //읽어온 벡터를 알맞게 형변환해서 대입
				vm = vmTemp;
				
				ois.close();

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