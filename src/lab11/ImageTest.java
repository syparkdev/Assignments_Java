package lab11;


/*������а� 1613665 �ڼ���
 * 21-07-06
 * �̹����� �߶� ������ �ΰ� ����ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageTest  extends JFrame
{
	
	public ImageTest()
	{
		setTitle("�׷��� �̹��� ����");                                        //�����Ӱ� �г� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new MyPanel();
		p.setBackground(Color.decode("#F0EDCC"));
		setContentPane(p);
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			ImageIcon icon = new ImageIcon("back.jpg");
			Image img = icon.getImage();
			
			g.drawImage(img, 0, 0, getWidth() / 2 - 5, getHeight() / 2 - 5,         //�»�� �׸�
					0, 0, img.getWidth(this) / 2, img.getHeight(this) / 2, this);
			
			g.drawImage(img, getWidth() / 2 + 5, 0, getWidth(), getHeight() / 2 - 5,         //���� �׸�
					img.getWidth(this) / 2, 0, img.getWidth(this), img.getHeight(this) / 2, this);
			
			g.drawImage(img, 0, getHeight() / 2 + 5, getWidth() / 2 - 5, getHeight(),         //���ϴ� �׸�
					0, img.getHeight(this) / 2, img.getWidth(this) / 2, img.getHeight(this), this);
			
			g.drawImage(img, getWidth() / 2 + 5, getHeight() / 2 + 5, getWidth(), getHeight(),         //���ϴ� �׸�
					img.getWidth(this) / 2, img.getHeight(this) / 2, img.getWidth(this), img.getHeight(this), this);
		
		}
	}

	public static void main(String[] args) 
	{
		new ImageTest();
	}
}