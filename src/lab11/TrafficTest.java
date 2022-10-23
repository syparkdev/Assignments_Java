package lab11;


/*영어영문학과 1613665 박세연
 * 21-07-06
 * 버튼을 클릭하면 신호등 색이 바뀌는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficTest  extends JFrame
{
	int mod = 0;                                                //신호등의 위치를 가리키는 인덱스
	
	public TrafficTest()
	{
		setTitle("");                                        //프레임과 패널 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new MyPanel();
		p.setLayout(new BorderLayout());
		p.setBackground(Color.decode("#F0EDCC"));
		
		JButton b = new JButton("traffic light turn on");            //신호등의 다음 등을 켜는 버튼
		b.addActionListener(new ActionListener()                       //모드 값을 증가시키고 3 이내에 머물게 하는 리스너
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
			g.drawOval(110, 100, 70, 70);                             //신호등 틀 그리기
			g.drawOval(110, 170, 70, 70);
			g.drawOval(110, 240, 70, 70);
			
			if (mod == 0)                                                            //모드값에 따라 신호등 색 채우기
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