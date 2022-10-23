package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * 인터페이스와 서브클래스를 작성하고 테스트하는 프로그램입니다. */

public interface Shape 
{
	final double PI = 3.14;
	void draw();                          //도형을 그리는 추상 메소드
	double getArea();                //도형의 면적을 반환하는 추상 메소드
	default public void redraw()            //도형을 다시 그린다는 메시지를 출력하는 추상 메소드
	{
		System.out.print("---다시 그립니다.");
		draw();
	}
}