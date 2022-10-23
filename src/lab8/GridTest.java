package lab8;


/*1613665 ������а� �ڼ���
 * 21-07-02
 * ��ġ�������� ȥ�� ����� �����ϴ� ���α׷��Դϴ�.
 */


import java.awt.*;
import javax.swing.*;

public class GridTest extends JFrame
{
	GridTest()
	{
		setTitle("Grid TEST");                                                                        //���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            //x��ư���� ����
		
		Container c = getContentPane();                                                 //��ġ �����ڸ� �������̾ƿ����� ����
		c.setLayout(new BorderLayout(5,7));
		
		JPanel p1 = new JPanel();                                        //�׸��� ���̾ƿ����� ���� ��ġ�� ���� ����
		p1.setLayout(new FlowLayout());
		p1.add(new JLabel("�л� ���� �Է�"));
		c.add(p1, BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();                                        //�׸��� ���̾ƿ����� �ؽ�Ʈ�ʵ带 ��ġ�� �߾� ����
		p2.setLayout(new GridLayout(5, 4, 1, 1));
		p2.add(new JLabel("�̸�"));
		p2.add(new JLabel("�й�"));
		p2.add(new JLabel("����"));
		p2.add(new JLabel("����ó"));
		
		for (int i = 0; i < 16;i++)
			p2.add(new JTextField(""));
		
		c.add(p2, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel();                                       //�÷ο� ���̾ƿ����� ��ư�� ��ġ�� ���� ����
		p3.setLayout(new FlowLayout());
		p3.add(new JButton("�߰�"));
		p3.add(new JButton("���"));
		c.add(p3, BorderLayout.SOUTH);

		
		setSize(450, 250);
		setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new GridTest();

	}

}
