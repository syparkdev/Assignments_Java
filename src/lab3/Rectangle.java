package lab3;


/*1613665 박세연 영어영문학과
 * 21-06-24
 * Rectangle 클래스를 작성하고 테스트하는 프로그램입니다.*/

public class Rectangle            //Rectangle 클래스 작성
{
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height)   //Rectangle 생성자 작성
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square()                                                                     //직사각형의 넓이를 반환하는 메소드
	{
		return (width * height);
	}
	
	void show()                                                                     //직사각형의 필드 정보를 출력하는 메소드
	{
		System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
	}
	
	boolean contains(Rectangle r)
	//현재 직사각형이 파라미터 직사각형을 포함하는지 체크하는 메소드
	{
		if (this.x < r.x && r.x < (this.x + this.width) &&
				this.y < r.y && r.y < (this.y + this.height) &&
				r.width < (this.width - (r.x - this.x)) && r.height < (this.height - (r.y - this.y)))
			return true;
		else
			return false;
	}

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(2, 2, 8, 7);               //세 개의 직사각형 인스턴스 생성
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();                                                                       //직사각형 r의 필드 정보를 출력
		System.out.println("s의 면적은 " + s.square());      //직사각형 s의 넓이를 출력
		
		if(t.contains(r))                 //직사각형 r과 s가 t에 포함되는지 확인 후 결과를 출력
			System.out.println("t는 r을 포함합니다.");
		
		if(t.contains(s))
				System.out.println("t는 s을 포함합니다.");
	}
}
