package lab11;


/*영어영문학과 1613665 박세연
 * 21-07-06
 * 다양한 폰트로 지정 문장을 출력하는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorFontTest  extends JFrame
{
	JPanel p = new MyPanel();
	
	public ColorFontTest()
	{
		setTitle("Color, Font 사용 예제");                                        //프레임과 패널 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setBackground(Color.decode("#F0EDCC"));
		setContentPane(p);
		setSize(1500, 700);
		setVisible(true);
	}
	
	class MyPanel extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			g.setColor(Color.decode("#02343F"));                       //첫번째 문장 색과 폰트 설정
			g.setFont(new Font("Algerian", Font.PLAIN, 80));
			g.drawString("A Very Merry Unbirthday", 150, 150);
			
			g.setColor(Color.decode("#000000"));                       //두번째 문장 색과 폰트 설정
			g.setFont(new Font("Ink Free", Font.BOLD, 40));
			g.drawString("Blackbird singing in the dead of night", 250, 250);
			
			g.setColor(Color.decode("#990011"));                       //세번째 문장 색과 폰트 설정
			g.setFont(new Font("Chiller", Font.ITALIC, 70));
			g.drawString("Friends On The Other Side", 250, 500);
			
			g.setColor(Color.decode("#ADEFD1"));                       //네번째 문장 색과 폰트 설정
			g.setFont(new Font("Pristina", Font.BOLD + Font.ITALIC, 50));
			g.drawString("Snowflakes that stay on my nose and eyelashes", 550, 350);
			
		}
		
	}

	public static void main(String[] args) 
	{
		new ColorFontTest();
	}
}