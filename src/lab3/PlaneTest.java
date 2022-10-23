package lab3;


/*1613665 박세연 영어영문학과
 * 21-06-24
 *Plane 클래스를 작성하고 접근자와 설정자 메소드 사용을 연습하는 프로그램입니다.*/

class Plane                                       //비행기 클래스 작성
{
	private String model;                //비행기 필드 선언
	private int seats;
	private static int planes;         //비행기 대수를 저장할 정적 변수 선언
	
	Plane()                                          //this()로 다른 생성자를 호출하는 생성자들 작성
	{
		this("", -1);
	}
	
	Plane(String model)
	{
		this(model, -1);
	}
	
	Plane(int seats)
	{
		this("모델명 불명", seats);
	}
	
	Plane(String model, int seats)  //호출될 생성자 작성
	{
		this.model = model;
		this.seats = seats;
		planes += 1;
	}
	
	public String getModel()          //private 필드에 대한 접근자와 설정자 메소드
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public int getSeats()
	{
		return seats;
	}
	public void setSeats(int seats)
	{
		this.seats = seats;
	}
	
	public static int getPlanes()
	{
		return planes;
	}
	
	public String toString()                          //필드 정보를 문자열로 바꾸는 메소드
	{
		String s = "Plane [model=" + this.model + ", seats=" + this.seats + "]";
		return s;
	}	
}

public class PlaneTest 
{
	public static void main(String[] args) 
	{
		Plane airplane[] = new Plane[3];         //비행기 객체 레퍼런스 배열 생성
		
		airplane[0] = new Plane();                    //설정자 메소드를 사용하여 필드 정보 대입
		airplane[0].setModel("보잉 777");
		airplane[0].setSeats(200);
		
		airplane[1] = new Plane();
		airplane[1].setModel("에어버스 - A380");
		airplane[1].setSeats(500);
		
		airplane[2] = new Plane();
		airplane[2].setModel("보잉 737");
		airplane[2].setSeats(120);
		
		System.out.println("전체 보유 비행기 수 = " + Plane.getPlanes());
		//정적 메소드를 호출하여 비행기 대수 출력
		System.out.println("각 비행기 정보 출력");
		
		for (int i = 0;i < airplane.length;i++)
			//필드 정보를 문자열로 바꾸는 메소드를 호출하여 필드 정보 출력
		{
			System.out.println(airplane[i].toString());
		}
	}
}