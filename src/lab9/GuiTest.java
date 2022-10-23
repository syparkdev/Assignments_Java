package lab9;


/*������а� �ڼ��� 1613665
 * 21-07-05
 * ��ư�� ���� �׼� �̺�Ʈ�� ó���ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiTest extends JFrame
{
	JTextField tf1 = new JTextField("");          //�ؽ�Ʈ�ʵ� ��ü ���� �� �ʱ�ȭ
	JTextField tf2 = new JTextField("");
	JTextField tf3 = new JTextField("");
	JTextField tf4 = new JTextField("");
	
	public GuiTest() 
	{
		setTitle("GUI TEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(20, 5));
		
		JButton b1 = new JButton("Ȯ��");                                 //��ư ��ü ����
		b1.addActionListener(new MyActionListener());        //��ư�� ������ �ޱ�
		JButton b2 = new JButton("���");
		b2.addActionListener(new MyActionListener());
		
		JPanel p1 = new JPanel();                                               //�������� ���� ������ �� �г� �ޱ�
		p1.setLayout(new GridLayout(4, 0, 0, 5));
		p1.add(new JLabel("�̸�"));
		p1.add(new JLabel("�й�"));
		p1.add(new JLabel("����"));
		p1.add(new JLabel("����ó"));
		c.add(p1, BorderLayout.WEST);
		
		JPanel p2 = new JPanel();                                               //������ �߾� ������ �ؽ�Ʈ�ʵ� �г� �ޱ�
		p2.setLayout(new GridLayout(4, 0, 0, 5));
		p2.add(tf1);
		p2.add(tf2);
		p2.add(tf3);
		p2.add(tf4);
		c.add(p2, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel();                                              //������ ���� ������ ��ư �г� �ޱ�
		p3.setLayout(new FlowLayout());
		p3.add(b1);
		p3.add(b2);
		c.add(p3, BorderLayout.SOUTH);
		
		setSize(300,200);
		setVisible(true);
	}
	
	private class MyActionListener implements ActionListener                //������ Ŭ���� �����ϱ�
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			JButton btn = (JButton)e.getSource();                      //�̺�Ʈ�� �߻��� �ҽ��� �޾ƿ� btn�� ����
			
			if (btn.getText().equals("Ȯ��"))                                   //���� ��ư�� Ȯ���� �� �ؽ�Ʈ�ʵ� ���� ���
				System.out.print(tf1.getText() + "\t" + tf2.getText() + "\t" + tf3.getText() + "\t" + tf4.getText());
			
			else if (btn.getText().equals("���"))                           //����� �� �ؽ�Ʈ�ʵ� �ʱ�ȭ
			{
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
			}
			
		}
		
	}

	public static void main(String[] args) 
	{
		new GuiTest();
	}
}