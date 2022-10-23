package lab9;


/*영어영문학과 박세연 1613665
 * 21-07-05
 * 라벨 "c"를 클릭에 따라 랜덤 좌표로 이동시키는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickPracticeFrame extends JFrame
{
	
	public ClickPracticeFrame() 
	{
		setTitle("클릭 연습용 응용 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		
		JLabel la = new JLabel("C");                                        //라벨 생성 및 초기화
		la.setSize(20, 20);
		la.setLocation(100, 100);
		
		la.addMouseListener(new MouseAdapter()           //익명 이벤트 리스너 작성하고 라벨에 달기
		{
			@Override
			public void mouseClicked(MouseEvent e)        //라벨 클릭 시 라벨이 랜덤한 좌표로 이동
			{
				int pw = c.getWidth();
				int ph = c.getHeight();
				int x = (int)(Math.random() * (pw - 20));
				int y = (int)(Math.random() * (ph - 20));
				la.setLocation(x, y);
				super.mouseClicked(e);
			}
			
		});
		
		
		c.add(la);
		
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new ClickPracticeFrame();
	}
}