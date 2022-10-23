
/*박세연 1613665 영어영문학과
 * 21-06-28
 * 클래스별로 패키지를 분리하는 연습입니다.
 */

package lab5.derived;                                               //Circle 클래스가 위치할 패키지 지정

import lab5.base.Shape;

public class Circle2 extends Shape
{
	public void draw()
	{
		System.out.println("Circle");                   //문자열을 출력하는 메소드
	}
}