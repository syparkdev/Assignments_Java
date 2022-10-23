package lab11;


/*영어영문학과 1613665 박세연
 * 21-07-06
 * 백분율을 입력하여 파이 차트를 그리는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PieChartFrame  extends JFrame
{
		
	JTextField tf1 = new JTextField(6);
	JTextField tf2 = new JTextField(6);
	JTextField tf3 = new JTextField(6);
	JTextField tf4 = new JTextField(6);
	
	int applePie = 0;
	int cherryPie = 0;
	int sbPie = 0;
	int prunePie = 0;
	
	int aChart = 0;
	int cChart = 0;
	int sChart = 0;
	int pChart = 0;

	public PieChartFrame()
	{
		setTitle("파이 차트 그리기");                                        //프레임과 패널 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel p1 = new JPanel();
		Listener listener = new Listener();
		
		p1.setLayout(new FlowLayout());                         //라벨과 텍스트필드가 들어가는 북쪽 패널
		p1.setOpaque(true);
		p1.setBackground(Color.lightGray);
		
		p1.add(new JLabel("apple"));
		tf1.addActionListener(listener);
		p1.add(tf1);
		
		p1.add(new JLabel("cherry"));
		tf2.addActionListener(listener);
		p1.add(tf2);
		
		p1.add(new JLabel("strawberry"));
		tf3.addActionListener(listener);
		p1.add(tf3);
		
		p1.add(new JLabel("prune"));
		tf4.addActionListener(listener);
		p1.add(tf4);
		
		JPanel p2 = new MyPanel();                          //차트가 들어가는 중앙 패널
		
		c.add(p1, BorderLayout.NORTH);
		c.add(p2, BorderLayout.CENTER);
		setSize(600, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g) 
		{
			g.setColor(Color.red);
			g.drawString("apple " + applePie + "%", 80, 20);                   //텍스트필드에 입력한 내용을 스트링으로 그림
			g.fillArc(180, 80, 230, 230, 0, aChart);                      //차트를 그림
			
			g.setColor(Color.blue);
			g.drawString("cherry " + cherryPie + "%", 200, 20);
			g.fillArc(180, 80, 230, 230, aChart, cChart);
			
			g.setColor(Color.magenta);
			g.drawString("strawberry " + sbPie + "%", 310, 20);
			g.fillArc(180, 80, 230, 230, aChart + cChart, sChart);
			
			g.setColor(Color.orange);
			g.drawString("prune " + prunePie + "%", 440, 20);
			g.fillArc(180, 80, 230, 230, aChart  + cChart+ sChart, pChart);
	
		}
	}
	
	class Listener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			applePie = Integer.parseInt(tf1.getText());
			cherryPie = Integer.parseInt(tf2.getText());
			sbPie = Integer.parseInt(tf3.getText());
			prunePie = Integer.parseInt(tf4.getText());
			
			int sum = applePie + cherryPie + sbPie + prunePie;
			
			aChart = (applePie * 360) / sum;
			cChart = (cherryPie * 360) / sum;
			sChart = (sbPie * 360) / sum;
			pChart = (prunePie * 360) / sum;
			
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			
			repaint();
		}	
	}

	public static void main(String[] args) 
	{
		new PieChartFrame();
	}
}