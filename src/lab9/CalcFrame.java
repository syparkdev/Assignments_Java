package lab9;


/*������а� �ڼ��� 1613665
 * 21-07-05
 * =��ư�� ���� ���� ����� ����ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcFrame extends JFrame
{
	JTextField num1 = new JTextField(6);          //�ؽ�Ʈ�ʵ� ��ü ���� �� �ʱ�ȭ
	JTextField num2 = new JTextField(6);
	JTextField result = new JTextField(12);
	
	public CalcFrame() 
	{
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("=");                                 //��ư ��ü ����
		b1.addActionListener(new MyActionListener());    //��ư�� ������ �ޱ�
		
		JLabel la = new JLabel("X");                                        //�� ��ü ����
		
		c.add(num1);                                                                 //������Ʈ�� �����ӿ� �߰��ϱ�
		c.add(la);
		c.add(num2);
		c.add(b1);
		c.add(result);
		
		setSize(400,100);
		setVisible(true);
	}
	
	private class MyActionListener implements ActionListener                //������ Ŭ���� �����ϱ�
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			JButton btn = (JButton)e.getSource();                      //�̺�Ʈ�� �߻��� �ҽ��� �޾ƿ� btn�� ����
			
			if (btn.getText().equals("="))                                       // =��ư�� Ŭ������ �� ���� ���� ���� �� ���
			{
				Integer answer = Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText());
				result.setText(answer.toString());
			}
		}
	}

	public static void main(String[] args) 
	{
		new CalcFrame();
	}
}