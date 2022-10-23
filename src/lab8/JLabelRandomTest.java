package lab8;


/*1613665 ������а� �ڼ���
 * 21-07-02
 * JLabel ������Ʈ�� ������ ��ġ�� ����ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import javax.swing.*;

public class JLabelRandomTest extends JFrame
{
	JLabelRandomTest()
	{
		setTitle("Random Labels");                                                    //���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //x��ư���� ����
		
		Container c = getContentPane();                                 //�����̳� �����ϰ� ��ġ������ ���ֱ�
		c.setLayout(null);
		
		for (int i = 0; i <20 ; i++)                                                //������ ��ġ�� �Ķ� ���� �߰��ϴ� �ݺ���
		{
			JLabel la = new JLabel();
			c.add(la);
			int x  = (int)(Math.random() * 200 +50);
			int y  = (int)(Math.random() * 200 +50);
			la.setLocation(x, y);
			la.setSize(10, 10);
			la.setBackground(Color.BLUE);
			la.setOpaque(true);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new JLabelRandomTest();

	}
}