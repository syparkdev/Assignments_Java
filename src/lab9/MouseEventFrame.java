package lab9;


/*영어영문학과 박세연 1613665
 * 21-07-05
 * 라벨에 대한 마우스 이벤트를 처리하는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventFrame extends JFrame
{
	
	public MouseEventFrame() 
	{
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("default");                             //라벨 생성 및 초기화
		la.addMouseListener(new MouseAdapter()           //익명 이벤트 리스너 작성하고 라벨에 달기
		{
			@Override
			public void mouseEntered(MouseEvent e)        //마우스 진입 시 "Love Java"로 텍스트 변경
			{
				JLabel lbl = (JLabel)e.getSource();
				lbl.setText("Love Java");
				super.mouseEntered(e);
			}

			@Override
			public void mouseExited(MouseEvent e)         //마우스 퇴장 시 "사랑해"로 텍스트 변경
			{
				JLabel lbl = (JLabel)e.getSource();
				lbl.setText("사랑해");
				super.mouseExited(e);
			}
			
		});
		
		
		c.add(la);
		
		setSize(400,100);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MouseEventFrame();
	}
}