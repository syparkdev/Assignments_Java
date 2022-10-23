package lab8;


/*1613665 영어영문학과 박세연
 * 21-07-02
 * JLabel 컴포넌트를 랜덤한 위치에 출력하는 프로그램입니다.
 */

import java.awt.*;
import javax.swing.*;

public class JLabelRandomTest extends JFrame
{
	JLabelRandomTest()
	{
		setTitle("Random Labels");                                                    //제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //x버튼으로 종료
		
		Container c = getContentPane();                                 //컨테이너 생성하고 배치관리자 없애기
		c.setLayout(null);
		
		for (int i = 0; i <20 ; i++)                                                //랜덤한 위치에 파란 라벨을 추가하는 반복문
		{
			JLabel la = new JLabel();
			c.add(la);
			int x  = (int)(Math.random() * 200 +50);
			int y  = (int)(Math.random() * 200 +50);
			la.setLocation(x, y);
			la.setSize(10, 10);
			la.setBackground(Color.BLUE);
			la.setOpaque(true);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new JLabelRandomTest();

	}
}