package lab8;


/*1613665 ������а� �ڼ���
 * 21-07-02
 * ��ġ�������� ȥ�� ����� �����ϴ� ���α׷��Դϴ�.
 */


import java.awt.*;
import javax.swing.*;

public class GuiTest extends JFrame
{
	GuiTest()
	{
		setTitle("GUI TEST");                                                                        //���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            //x��ư���� ����
		
		Container c = getContentPane();                                                 //��ġ �����ڸ� �������̾ƿ����� ����
		c.setLayout(new BorderLayout(5,7));
		
		JPanel p1 = new JPanel();                                        //�׸��� ���̾ƿ����� ���� ��ġ�� ���� ����
		p1.setLayout(new GridLayout(4, 0));
		p1.add(new JLabel("�̸�"));
		p1.add(new JLabel("�й�"));
		p1.add(new JLabel("����"));
		p1.add(new JLabel("����ó"));
		c.add(p1, BorderLayout.WEST);
		
		JPanel p2 = new JPanel();                                        //�׸��� ���̾ƿ����� �ؽ�Ʈ�ʵ带 ��ġ�� �߾� ����
		p2.setLayout(new GridLayout(4, 0, 5, 5));
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		c.add(p2, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel();                                       //�÷ο� ���̾ƿ����� ��ư�� ��ġ�� ���� ����
		p3.setLayout(new FlowLayout());
		p3.add(new JButton("Ȯ��"));
		p3.add(new JButton("���"));
		c.add(p3, BorderLayout.SOUTH);
		
		JPanel p4 = new JPanel();                                       //�ؽ�Ʈ�ʵ�� ���� ���̿� ƴ�� �ֱ� ���� �г�
		c.add(p4, BorderLayout.NORTH);

		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new GuiTest();

	}

}
