package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * 인터페이스와 서브클래스를 작성하고 테스트하는 프로그램입니다. */

public class Shapes 
{

	public static void main(String[] args) 
	{
		Shape list[] = new Shape[3];                  //Shape 클래스 객체의 레퍼런스 배열
		
		list[0] = new Circle(10);                           //반지름이 10인 원 객체
		list[1] = new Oval(20, 30);                      //20x30 사각형에 내접하는 타원
		list[2] = new Rect(10, 40);                     //10x40 크기의 사각형
		
		for (int i = 0;i < list.length;i++)
			list[i].redraw();
		for (int i = 0;i < list.length;i++)
			System.out.println("면적은 " + list[i].getArea());
	}
}
