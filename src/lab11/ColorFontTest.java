package lab11;


/*������а� 1613665 �ڼ���
 * 21-07-06
 * �پ��� ��Ʈ�� ���� ������ ����ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorFontTest  extends JFrame
{
	JPanel p = new MyPanel();
	
	public ColorFontTest()
	{
		setTitle("Color, Font ��� ����");                                        //�����Ӱ� �г� ����
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
			g.setColor(Color.decode("#02343F"));                       //ù��° ���� ���� ��Ʈ ����
			g.setFont(new Font("Algerian", Font.PLAIN, 80));
			g.drawString("A Very Merry Unbirthday", 150, 150);
			
			g.setColor(Color.decode("#000000"));                       //�ι�° ���� ���� ��Ʈ ����
			g.setFont(new Font("Ink Free", Font.BOLD, 40));
			g.drawString("Blackbird singing in the dead of night", 250, 250);
			
			g.setColor(Color.decode("#990011"));                       //����° ���� ���� ��Ʈ ����
			g.setFont(new Font("Chiller", Font.ITALIC, 70));
			g.drawString("Friends On The Other Side", 250, 500);
			
			g.setColor(Color.decode("#ADEFD1"));                       //�׹�° ���� ���� ��Ʈ ����
			g.setFont(new Font("Pristina", Font.BOLD + Font.ITALIC, 50));
			g.drawString("Snowflakes that stay on my nose and eyelashes", 550, 350);
			
		}
		
	}

	public static void main(String[] args) 
	{
		new ColorFontTest();
	}
}