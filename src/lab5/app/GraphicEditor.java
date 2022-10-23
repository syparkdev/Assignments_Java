
/*박세연 1613665 영어영문학과
 * 21-06-28
 * 클래스별로 패키지를 분리하는 연습입니다.
 */

package lab5.app;                                               //GraphicEditor 클래스가 위치할 패키지 지정

import lab5.base.Shape;
import lab5.derived.Circle2;

public class GraphicEditor 
{
	public static void main(String[] args)  //Circle2객체를 생성하고 draw메소드를 호출함
	{
		Shape shape = new Circle2();
		shape.draw();
	}
}