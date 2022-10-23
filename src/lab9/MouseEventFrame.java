package lab9;


/*������а� �ڼ��� 1613665
 * 21-07-05
 * �󺧿� ���� ���콺 �̺�Ʈ�� ó���ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventFrame extends JFrame
{
	
	public MouseEventFrame() 
	{
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("default");                             //�� ���� �� �ʱ�ȭ
		la.addMouseListener(new MouseAdapter()           //�͸� �̺�Ʈ ������ �ۼ��ϰ� �󺧿� �ޱ�
		{
			@Override
			public void mouseEntered(MouseEvent e)        //���콺 ���� �� "Love Java"�� �ؽ�Ʈ ����
			{
				JLabel lbl = (JLabel)e.getSource();
				lbl.setText("Love Java");
				super.mouseEntered(e);
			}

			@Override
			public void mouseExited(MouseEvent e)         //���콺 ���� �� "�����"�� �ؽ�Ʈ ����
			{
				JLabel lbl = (JLabel)e.getSource();
				lbl.setText("�����");
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