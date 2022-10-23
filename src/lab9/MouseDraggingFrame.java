package lab9;


/*������а� �ڼ��� 1613665
 * 21-07-05
 * ���콺�� �巡���ϴ� ���� ����Ʈ���� ���� ��������� �����ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDraggingFrame extends JFrame
{
	
	public MouseDraggingFrame() 
	{
		setTitle("�巡�뵿�� YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.green);
		
		c.addMouseListener(new MouseAdapter()           //�͸� ���콺 ������ �ۼ��ϰ� �󺧿� �ޱ�
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				c.setBackground(Color.green);
				super.mouseReleased(e);
			}
		});
		
		c.addMouseMotionListener(new MouseAdapter()  //�͸� ���콺 ��� ������ �ۼ��ϰ� �󺧿� �ޱ�
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