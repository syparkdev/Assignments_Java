package lab9;


/*영어영문학과 박세연 1613665
 * 21-07-05
 * 라벨에 대한 키 이벤트를 처리하는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveStringFrame extends JFrame
{
	
	public MoveStringFrame() 
	{
		setTitle("Left 키로 문자열 회전");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");                             //라벨 생성 및 초기화
		c.addKeyListener(new KeyAdapter()                 //익명 이벤트 리스너 작성하고 라벨에 달기
		{

			@Override
			public void keyPressed(KeyEvent e) 
			{
				if (e.getKeyCode() == KeyEvent.VK_LEFT)       //누른 키코드가 왼쪽 방향키일 때
				{
					la.setText(la.getText().substring(1).concat(la.getText().substring(0,1)));
					//라벨 la의 텍스트를 바꾼다 : 인덱스 1부터 끝까지의 서브스트링 + 0에서 1까지의 서브스트링으로 
				}
					
				super.keyTyped(e);
			}
			
			
		});
		
		
		c.add(la);
		
		setSize(300,100);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) 
	{
		new MoveStringFrame();

	}
}