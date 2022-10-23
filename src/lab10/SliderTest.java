package lab10;


/*������а� 1613665 �ڼ���
 * 21-07-06
 * ���� ���� ���� �����̴��� �̵��ϴ� ���α׷��Դϴ�.
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
		
		JTextArea ta = new JTextArea(20, 5);                             //�ؽ�Ʈ ����� ����
		p.add(ta, BorderLayout.CENTER);
		
		JSlider s = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);    //�����̴� ���� �� ����
		s.setPaintLabels(true);
		s.setPaintTicks(true);
		s.setMajorTickSpacing(20);
		s.setMinorTickSpacing(5);
		s.setPaintTrack(true);
		p.add(s, BorderLayout.SOUTH);
		
		ta.addKeyListener(new KeyAdapter()                  //���� ���� ���� �����̴��� �����̴� ������
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
		
		s.addChangeListener(new ChangeListener()   //�����̴� ���� ���� ���� ���� �����ϴ� ������
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
