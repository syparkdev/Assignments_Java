package lab9;


/*������а� �ڼ��� 1613665
 * 21-07-05
 * �� "c"�� Ŭ���� ���� ���� ��ǥ�� �̵���Ű�� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickPracticeFrame extends JFrame
{
	
	public ClickPracticeFrame() 
	{
		setTitle("Ŭ�� ������ ���� ���α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		
		JLabel la = new JLabel("C");                                        //�� ���� �� �ʱ�ȭ
		la.setSize(20, 20);
		la.setLocation(100, 100);
		
		la.addMouseListener(new MouseAdapter()           //�͸� �̺�Ʈ ������ �ۼ��ϰ� �󺧿� �ޱ�
		{
			@Override
			public void mouseClicked(MouseEvent e)        //�� Ŭ�� �� ���� ������ ��ǥ�� �̵�
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