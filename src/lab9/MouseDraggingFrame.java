package lab9;


/*영어영문학과 박세연 1613665
 * 21-07-05
 * 마우스를 드래깅하는 동안 컨텐트팬의 색을 노란색으로 유지하는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDraggingFrame extends JFrame
{
	
	public MouseDraggingFrame() 
	{
		setTitle("드래깅동안 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.green);
		
		c.addMouseListener(new MouseAdapter()           //익명 마우스 리스너 작성하고 라벨에 달기
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				c.setBackground(Color.green);
				super.mouseReleased(e);
			}
		});
		
		c.addMouseMotionListener(new MouseAdapter()  //익명 마우스 모션 리스너 작성하고 라벨에 달기
		{
			@Override
			public void mouseDragged(MouseEvent e) 
			{
				c.setBackground(Color.yellow);
				super.mouseDragged(e);
			}
		});
		
		setSize(300,180);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MouseDraggingFrame();
	}
}