package lab8;


/*1613665 ������а� �ڼ���
 * 21-07-02
 * GridLayout�� ����Ͽ� ������ ũ���� ��ư 10���� ��ġ�ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import javax.swing.*;

public class GridLayoutTest extends JFrame
{
	GridLayoutTest()
	{
		setTitle("Ten Buttons Frame");                                            //���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //x��ư���� ����
		
		Container c = getContentPane();                                         //�����̳� ���� �� �׸��� ���̾ƿ� ����
		c.setLayout(new GridLayout(0,10));
		
		for (int i = 0; i <10 ; i++)                                                        //��ư ������ִ� �ݺ���
		{
			c.add(new JButton("" + i));
			
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new GridLayoutTest();

	}
}