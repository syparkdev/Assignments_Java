package lab8;


/*1613665 영어영문학과 박세연
 * 21-07-02
 * GridLayout을 사용하여 동일한 크기의 버튼 10개를 배치하는 프로그램입니다.
 */

import java.awt.*;
import javax.swing.*;

public class GridLayoutTest extends JFrame
{
	GridLayoutTest()
	{
		setTitle("Ten Buttons Frame");                                            //제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //x버튼으로 종료
		
		Container c = getContentPane();                                         //컨테이너 생성 후 그리드 레이아웃 설정
		c.setLayout(new GridLayout(0,10));
		
		for (int i = 0; i <10 ; i++)                                                        //버튼 만들어주는 반복문
		{
			c.add(new JButton("" + i));
			
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new GridLayoutTest();

	}
}