package lab12;


/*������а� 1613665 �ڼ���
 * 21-07-06
 * ���ٰ� �ִ� �����̳ʿ��� ������ �׸��� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawGraphic extends JFrame
{
	Container c = getContentPane();
	Color color = Color.cyan;
	
	public DrawGraphic() 
	{
		setTitle("�׷��� �׸���");                                        //�����̳ʿ� ��� �г� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createTb();                                                                //�޴��ٸ� ����� �޼ҵ� ȣ��
		JPanel p = new MyPanel();
		c.add(p, BorderLayout.CENTER);
		setSize(600, 500);
		setVisible(true);
	}
	
	private void createTb()
	{
		JToolBar tb = new JToolBar("���� ����");
		tb.setBackground(Color.LIGHT_GRAY);
		
		JLabel shape = new JLabel("����");
		JLabel chooseColor = new JLabel("�� ����");
		
		JButton line = new JButton("��");
		JButton square = new JButton("�簢��");
		JButton circle = new JButton("��");
		JButton tri = new JButton("�ﰢ��");
		JButton colorBtn = new JButton("Color");
		colorBtn.addActionListener(new ActionListener()        //�÷� ��ư�� Ŭ���ϸ� ���� ���� â�� �ߵ��� �ϴ� ������
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Color selectedColor = JColorChooser.showDialog(null, "���� ����", Color.cyan);
				if(selectedColor != null)
					color = selectedColor;
			}
		});
		
		tb.add(shape);
		tb.add(line);
		tb.add(square);
		tb.add(circle);
		tb.add(tri);
		
		tb.add(chooseColor);
		tb.add(colorBtn);
		
		c.add(tb, BorderLayout.NORTH);
	}
	
	class MyPanel extends JPanel                        //������ �׸� �г�
	{
		@Override
		protected void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			g.setColor(color);                                        //������ ������ �׸� �÷� ����
			
			
		}
		
	}


	public static void main(String[] args) 
	{
		new DrawGraphic();
	}
}