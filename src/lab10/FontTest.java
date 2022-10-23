package lab10;


/*������а� 1613665 �ڼ���
 * 21-07-06
 * ��Ʈ�� ������ ���� �ٲپ� ����� Ȯ���ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class FontTest extends JFrame
{
	JLabel resultLbl = new JLabel("Default");
	int fontSize = 20;
	String fontName = "����";
	int fontStyle = Font.PLAIN;
	Font font = new Font(fontName, fontStyle, fontSize);
	JCheckBox cbx1 = new JCheckBox("BOLD");
	JCheckBox cbx2 = new JCheckBox("ITALIC");
	JRadioButton gulim = new JRadioButton("����", true);
	JRadioButton dotum = new JRadioButton("����");
	JRadioButton gungsu = new JRadioButton("�ü�");

	public FontTest() 
	{
		setTitle("Font ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout(10, 10));
		
		JPanel categories = new JPanel();                                         //�����̳� ������ ī�װ� �� �г�
		categories.setLayout(new GridLayout(4, 0, 10, 10));
		JLabel la1 = new JLabel("Font ����", SwingConstants.CENTER);
		JLabel la2 = new JLabel("Style ����", SwingConstants.CENTER);
		JLabel la3 = new JLabel("Size ����", SwingConstants.CENTER);
		JLabel la4 = new JLabel("Text ����", SwingConstants.CENTER);
		categories.add(la1);
		categories.add(la2);
		categories.add(la3);
		categories.add(la4);
		p.add(categories, BorderLayout.WEST);
		
		JPanel buttons = new JPanel();                                            //�����̳� �߾��� ��ư �г�
		buttons.setLayout(new GridLayout(4, 0, 10, 10));
		
		radiobtnListener listener1 = new radiobtnListener();     //������ư�� ���� ������ �ޱ�
		gulim.addItemListener(listener1);
		dotum.addItemListener(listener1);
		gungsu.addItemListener(listener1);
		
		JPanel radiobtns = new JPanel();                                        //������ư �гΰ� �׷쿡 ��ư �ޱ�
		ButtonGroup g = new ButtonGroup();
		
		g.add(gulim);
		g.add(dotum);
		g.add(gungsu);
		radiobtns.add(gulim);
		radiobtns.add(dotum);
		radiobtns.add(gungsu);
		
		JPanel checkbxs = new JPanel();                                     //üũ�ڽ��� ������ �ް� üũ�ڽ� �гο� üũ�ڽ� �ޱ�
		cbxListener listener2 = new cbxListener();
		cbx1.addItemListener(listener2);
		checkbxs.add(cbx1);
		cbx2.addItemListener(listener2);
		checkbxs.add(cbx2);
	
		JTextField size = new JTextField("20");                         //��Ʈ ������ �ؽ�Ʈ�ʵ� �⺻���� �Բ� ����
		size.addActionListener(new ActionListener()             //�ؽ�Ʈ�ʵ� ������ �͸����� ����
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JTextField size = (JTextField)e.getSource();
				fontSize = Integer.parseInt(size.getText());
				Font newFont = new Font(fontName, fontStyle, fontSize);
				resultLbl.setFont(newFont);
			}
		});
		
		JTextField content = new JTextField();                         //��Ʈ �׽�Ʈ �� ���� �ؽ�Ʈ�ʵ� ����
		content.addActionListener(new ActionListener()     //�ؽ�Ʈ�ʵ� ������ �͸����� ����
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JTextField content = (JTextField)e.getSource();
				resultLbl.setText(content.getText());			
			}
		});

		buttons.add(radiobtns);                                              //��ư �гο� ��ư �������� ���� ���� �г� �ޱ�
		buttons.add(checkbxs);
		buttons.add(size);
		buttons.add(content);		
		p.add(buttons, BorderLayout.CENTER);
		
		JPanel resultPanel = new JPanel();	                         //��� ���� ��ġ�� �г�
		Border resultBorder = BorderFactory.createTitledBorder("Font ���� ���");
		resultPanel.setBorder(resultBorder);
		resultLbl.setFont(font);
		resultPanel.add(resultLbl);
		p.add(resultPanel, BorderLayout.SOUTH);
		
		c.add(p);
		setSize(300, 300);
		setVisible(true);
	}
	
	class cbxListener implements ItemListener                    //üũ�ڽ� ������
	{
		@Override
		public void itemStateChanged(ItemEvent e) 
		{
			if(e.getStateChange() == ItemEvent.SELECTED)
			{
				if(e.getItem() == cbx1)
				{
					fontStyle += Font.BOLD;
				}
				else if(e.getItem() == cbx2)
					fontStyle += Font.ITALIC;
			}
			else
			{
				if(e.getItem() == cbx1)
					fontStyle -= Font.BOLD;
				else if(e.getItem() == cbx2)
					fontStyle -= Font.ITALIC;
			}
			Font newFont = new Font(fontName, fontStyle, fontSize);
			resultLbl.setFont(newFont);
		}
	}
	
	class radiobtnListener implements ItemListener                  //������ư ������
	{

		@Override
		public void itemStateChanged(ItemEvent e) 
		{
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if(e.getStateChange() == ItemEvent.SELECTED)
			{
				if(gulim.isSelected())
					fontName = "����";
				else if(dotum.isSelected())
					fontName = "����";
				else if(gungsu.isSelected())
					fontName = "�ü�";
			}
			Font newFont = new Font(fontName, fontStyle, fontSize);
			resultLbl.setFont(newFont);
		}
	}
	

	public static void main(String[] args) 
	{
		new FontTest();
	}
}