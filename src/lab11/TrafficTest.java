package lab11;


/*������а� 1613665 �ڼ���
 * 21-07-06
 * ��ư�� Ŭ���ϸ� ��ȣ�� ���� �ٲ�� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficTest  extends JFrame
{
	int mod = 0;                                                //��ȣ���� ��ġ�� ����Ű�� �ε���
	
	public TrafficTest()
	{
		setTitle("");                                        //�����Ӱ� �г� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new MyPanel();
		p.setLayout(new BorderLayout());
		p.setBackground(Color.decode("#F0EDCC"));
		
		JButton b = new JButton("traffic light turn on");            //��ȣ���� ���� ���� �Ѵ� ��ư
		b.addActionListener(new ActionListener()                       //��� ���� ������Ű�� 3 �̳��� �ӹ��� �ϴ� ������
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				mod++;
				mod %= 3;
				repaint();
			}
			
		});
		p.add(b, BorderLayout.SOUTH);
		
		setContentPane(p);
		setSize(300, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			g.drawOval(110, 100, 70, 70);                             //��ȣ�� Ʋ �׸���
			g.drawOval(110, 170, 70, 70);
			g.drawOval(110, 240, 70, 70);
			
			if (mod == 0)                                                            //��尪�� ���� ��ȣ�� �� ä���
			{
				g.setColor(Color.red);
				g.fillOval(110, 100, 70, 70);
			}
			else if (mod == 1)
			{
				g.setColor(Color.green);
				g.fillOval(110, 170, 70, 70);
			}
			else if (mod == 2)
			{
				g.setColor(Color.yellow);
				g.fillOval(110, 240, 70, 70);
			}
		}
	}

	public static void main(String[] args) 
	{
		new TrafficTest();
	}
}