package lab11;


/*영어영문학과 1613665 박세연
 * 21-07-06
 * 색을 채운 도형을 출력하는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawFillTest extends JFrame
{
	
	public DrawFillTest() 
	{
		setTitle("Draw Fill 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(0, 3));
		c.add(new GraphPanel());
		c.add(new PiePanel());
		c.add(new StarPanel());
		setSize(1000, 360);
		setVisible(true);
	}
	
	class GraphPanel extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			this.setBackground(Color.decode("#1e0521"));        //배경과 테두리 색 설정
			this.setOpaque(true);
			g.setColor(Color.decode("#fecc50"));
			g.drawRoundRect(10, 10, 300, 300, 30, 30);
			
			g.setColor(Color.decode("#0be7fb"));                          //첫번째 기둥
			g.fillRect(55, 70, 30, 200);
			
			g.setColor(Color.decode("#ff6d69"));                          //두번째 기둥
			g.fillRect(115, 100, 30, 170);
			
			g.setColor(Color.decode("#010b8b"));                          //세번째 기둥
			g.fillRect(175, 220, 30, 50);
			
			g.setColor(Color.decode("#ef0195"));                         //네번째 기둥
			g.fillRect(235, 150, 30, 120);

		}
	}
	
	class PiePanel extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			this.setBackground(Color.decode("#1e0521"));
			this.setOpaque(true);
			g.setColor(Color.decode("#fecc50"));
			g.drawRoundRect(10, 10, 300, 300, 30, 30);
			
			g.setColor(Color.decode("#0be7fb"));                          //첫번째 파이
			g.fillArc(60, 70, 200, 200, 0, 70);
			
			g.setColor(Color.decode("#ff6d69"));                          //두번째 파이
			g.fillArc(60, 70, 200, 200, 70, 110);
			
			g.setColor(Color.decode("#010b8b"));                          //세번째 파이
			g.fillArc(60, 70, 200, 200, 180, 30);
			
			g.setColor(Color.decode("#ef0195"));                          //네번째 파이
			g.fillArc(60, 70, 200, 200, 210, 150);

		}
	}
	
	class StarPanel extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			this.setBackground(Color.decode("#1e0521"));
			this.setOpaque(true);
			g.setColor(Color.decode("#fecc50"));
			g.drawRoundRect(10, 10, 300, 300, 30, 30);
			
			g.setColor(Color.decode("#fecc50"));                          //별모양 다각형
			int x[] = {40, 125, 155, 180, 265, 200, 230, 155, 80, 110};
			int y[] = {150, 150, 70, 150, 150, 200, 280, 220, 280, 200};
			g.fillPolygon(x, y, x.length);

		}
	}

	public static void main(String[] args) 
	{
		new DrawFillTest();

	}
}