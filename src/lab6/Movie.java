package lab6;


/*박세연 1613665 영어영문학과
 * 21-06-29
 * 컬렉션을 활용하여 영화 정보를 관리하는 프로그램입니다.
 */

public class Movie 
{
	String title, director, genre, year;              //영화 정보 필드

	public Movie(String title, String director, String genre, String year) //생성자
	{
		super();
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	
}