package lab8;


/*1613665 ������а� �ڼ���
 * 21-07-02
 * BorderLayout�� ����Ͽ� ������Ʈ ������ ������ �����ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import javax.swing.*;

public class BorderLayoutPractice extends JFrame
{
	BorderLayoutPractice()
	{
		setTitle("BorderLayoutPractice");                                        //���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //x��ư���� ����
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,7));                                 //BorderLayout���� ���� �� ���� ����
		c.add(new JButton("Center"), BorderLayout.CENTER);  //��ư �߰�
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("East"), BorderLayout.EAST);
		
		setSize(400, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new BorderLayoutPractice();

	}

}
