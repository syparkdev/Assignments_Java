package lab10;


/*영어영문학과 1613665 박세연
 * 21-07-06
 * 글자 수에 따라 슬라이더가 이동하는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderTest extends JFrame
{
	public SliderTest() 
	{
		setTitle("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout(0, 20));
		
		JTextArea ta = new JTextArea(20, 5);                             //텍스트 에어리어 생성
		p.add(ta, BorderLayout.CENTER);
		
		JSlider s = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);    //슬라이더 생성 및 설정
		s.setPaintLabels(true);
		s.setPaintTicks(true);
		s.setMajorTickSpacing(20);
		s.setMinorTickSpacing(5);
		s.setPaintTrack(true);
		p.add(s, BorderLayout.SOUTH);
		
		ta.addKeyListener(new KeyAdapter()                  //글자 수에 따라 슬라이더를 움직이는 리스너
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(ta.getText().length() > 99)
					ta.setEnabled(false);
				s.setValue(ta.getText().length());
				super.keyTyped(e);
			}
		});
		
		s.addChangeListener(new ChangeListener()   //슬라이더 값에 따라서 글자 수를 조정하는 리스너
		{
			@Override
			public void stateChanged(ChangeEvent e) 
			{
				if (ta.getText().length() <= 99)
					ta.setEnabled(true);
				int sNum = s.getValue();
				ta.setText(ta.getText().substring(0, sNum));
			}
		});
			
		c.add(p);
		setSize(700, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new SliderTest();
	}

}
