package lab11;


/*영어영문학과 1613665 박세연
 * 21-07-06
 * 이미지를 잘라서 간격을 두고 출력하는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageTest  extends JFrame
{
	
	public ImageTest()
	{
		setTitle("그래픽 이미지 연습");                                        //프레임과 패널 설정
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
			
			g.drawImage(img, 0, 0, getWidth() / 2 - 5, getHeight() / 2 - 5,         //좌상단 그림
					0, 0, img.getWidth(this) / 2, img.getHeight(this) / 2, this);
			
			g.drawImage(img, getWidth() / 2 + 5, 0, getWidth(), getHeight() / 2 - 5,         //우상단 그림
					img.getWidth(this) / 2, 0, img.getWidth(this), img.getHeight(this) / 2, this);
			
			g.drawImage(img, 0, getHeight() / 2 + 5, getWidth() / 2 - 5, getHeight(),         //좌하단 그림
					0, img.getHeight(this) / 2, img.getWidth(this) / 2, img.getHeight(this), this);
			
			g.drawImage(img, getWidth() / 2 + 5, getHeight() / 2 + 5, getWidth(), getHeight(),         //우하단 그림
					img.getWidth(this) / 2, img.getHeight(this) / 2, img.getWidth(this), img.getHeight(this), this);
		
		}
	}

	public static void main(String[] args) 
	{
		new ImageTest();
	}
}