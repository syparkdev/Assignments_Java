package lab8;


/*1613665 ������а� �ڼ���
 * 21-07-02
 * ��ġ������ ���� ������Ʈ�� ��ġ�ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import javax.swing.*;

public class StoryTest extends JFrame
{
	StoryTest()
	{
		setTitle("SM Story");                                                                //���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //x��ư���� ����
		
		
		Container c = getContentPane();                                 //�����̳� �����ϰ� ��ġ������ ���ֱ�
		c.setLayout(null);
		
		JLabel la1 = new JLabel("SM Story");                       //������Ʈ ����
		JLabel la2 = new JLabel("������");
		JLabel la3 = new JLabel("�̴�");
		JTextField tf = new JTextField();

		c.add(la1);                                                                   //�� ������Ʈ ������ ������ ��ġ
		la1.setLocation(20, 20);
		la1.setSize(60, 20);

		c.add(la2);
		la2.setLocation(100, 50);
		la2.setSize(60, 20);

		c.add(tf);
		tf.setLocation(180, 80);
		tf.setSize(80, 20);

		c.add(la3);
		la3.setLocation(300, 110);
		la3.setSize(60, 20);
		
		setSize(450, 250);
		setVisible(true);
		
	}
		
	public static void main(String[] args) 
	{
		new StoryTest();

	}
}
