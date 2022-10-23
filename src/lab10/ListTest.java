package lab10;


/*������а� 1613665 �ڼ���
 * 21-07-06
 * ����Ʈ�� �߰��ϰ� �����ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Vector;

public class ListTest extends JFrame
{
	public ListTest() 
	{
		setTitle("����Ʈ �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		
		JTextField tfInput = new JTextField();                       //����Ʈ�� ���ο� ��Ҹ� �߰��ϴ� �ؽ�Ʈ�ʵ�
		
		Vector<String> v = new Vector<>();                         //����Ʈ�� ������ ����
		JList<String> scrollList = new JList<String>(v);     //���ͷ� ������ ����Ʈ
		JScrollPane sp = new JScrollPane(scrollList);		 //��ũ���ҿ� ����Ʈ �ޱ�
		
		JPanel under = new JPanel();                                     //���� �ؽ�Ʈ�ʵ�� ������ư, ������ư
		under.setLayout(new FlowLayout());
		JTextField tfUpdate = new JTextField(12);
		JButton btnUpdate = new JButton("����");
		JButton btnDelete = new JButton("����");
		under.add(tfUpdate);
		under.add(btnUpdate);
		under.add(btnDelete);
		
		tfInput.addActionListener(new ActionListener()    //�Է��� ó���ϴ� ������
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JTextField tf1 = (JTextField)e.getSource();
				v.add(tf1.getText());
				scrollList.setListData(v);
				tfInput.setText("");
			}
			
		});
		
		scrollList.addListSelectionListener(new ListSelectionListener()
				//����Ʈ���� ������ �׸��� ���� �ؽ�Ʈ�ʵ忡 �����ִ� ������
		{
			@Override
			public void valueChanged(ListSelectionEvent e) 
			{
				String name = (String) scrollList.getSelectedValue();
				int idx = scrollList.getSelectedIndex();
				tfUpdate.setText(name);
			}
		});
		
		btnUpdate.addActionListener(new ActionListener()             //������ ó���ϴ� ������
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				int idx = scrollList.getSelectedIndex();
				v.remove(idx);
				v.add(idx, tfUpdate.getText());
				scrollList.setListData(v);
			}		
		});
		
		btnDelete.addActionListener(new ActionListener()            //������ ó���ϴ� ������
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				int idx = scrollList.getSelectedIndex();
				v.remove(idx);
				scrollList.setListData(v);
				
			}		
		});
		
		p.add(tfInput, BorderLayout.NORTH);
		p.add(sp, BorderLayout.CENTER);
		p.add(under, BorderLayout.SOUTH);		
		c.add(p);
		setSize(300, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new ListTest();
	}

}
