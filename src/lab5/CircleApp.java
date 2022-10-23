package lab5;


/*박세연 1613665 영어영문학과
 * 21-06-28
 * Circle 클래스를 작성하고 테스트하는 프로그램입니다.
 */

public class CircleApp 
{
	public static void main(String[] args)
	{
		Circle a = new Circle(2,3,5);                     //객체 a, b 생성
		Circle b  = new Circle(2,3,30);
		System.out.println("원 a : " + a);             //객체 a, b의 정보 출력
		System.out.println("원 b : " + b);
		if (a.equals(b))                                            //객체 a와 b의 중점 일치 여부에 따른 메시지 출력
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}