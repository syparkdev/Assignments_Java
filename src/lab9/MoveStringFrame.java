package lab9;


/*������а� �ڼ��� 1613665
 * 21-07-05
 * �󺧿� ���� Ű �̺�Ʈ�� ó���ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveStringFrame extends JFrame
{
	
	public MoveStringFrame() 
	{
		setTitle("Left Ű�� ���ڿ� ȸ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");                             //�� ���� �� �ʱ�ȭ
		c.addKeyListener(new KeyAdapter()                 //�͸� �̺�Ʈ ������ �ۼ��ϰ� �󺧿� �ޱ�
		{

			@Override
			public void keyPressed(KeyEvent e) 
			{
				if (e.getKeyCode() == KeyEvent.VK_LEFT)       //���� Ű�ڵ尡 ���� ����Ű�� ��
				{
					la.setText(la.getText().substring(1).concat(la.getText().substring(0,1)));
					//�� la�� �ؽ�Ʈ�� �ٲ۴� : �ε��� 1���� �������� ���꽺Ʈ�� + 0���� 1������ ���꽺Ʈ������ 
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