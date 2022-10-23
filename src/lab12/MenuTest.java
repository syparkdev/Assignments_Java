package lab12;


/*������а� 1613665 �ڼ���
 * 21-07-06
 * �޴��� ���� ���� ����� �����ϴ� ���α׷��Դϴ�.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuTest extends JFrame
{
	JLabel text = new JLabel("Text");                              //�ؽ�Ʈ�� ǥ���� ��

	public MenuTest() 
	{
		setTitle("Menu ����� ����");                                        //�����̳ʿ� ��� �г� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setBackground(Color.decode("#F0EDCC"));
		createMenu();                                                                //�޴��ٸ� ����� �޼ҵ� ȣ��
		p.add(text);
		text.setToolTipText("������ ���� ����� �����Դϴ�");
		c.add(p);
		setSize(500, 300);
		setVisible(true);
	}
	
	private void createMenu()
	{
		JMenuBar mb = new JMenuBar();
		MenuActionListener listener = new MenuActionListener();
		
		JMenu file = new JMenu("����");                                      //���� �޴��� ������ �ۼ� �� ������ �ޱ�
		
		JMenuItem open = new JMenuItem("����");
		open.addActionListener(listener);
		
		JMenuItem save = new JMenuItem("����");
		save.addActionListener(listener);
		
		JMenuItem exit = new JMenuItem("����");
		exit.addActionListener(listener);
		
		file.add(open);                                                                   //���� �޴��� ������ �ޱ�
		file.add(save);
		file.addSeparator();
		file.add(exit);
		
		JMenu edit = new JMenu("����");                                 //���� �޴��� ������ �ۼ� �� ������ �ޱ�
		JMenuItem color = new JMenuItem("�� ����");
		color.addActionListener(listener);

		JMenuItem font = new JMenuItem("��Ʈ");
		font.addActionListener(listener);

		JMenuItem textchange = new JMenuItem("�ؽ�Ʈ ����");
		textchange.addActionListener(listener);

		edit.add(color);                                                                  //���� �޴��� ������ �ޱ�
		edit.add(font);
		edit.add(textchange);

		
		JMenu help = new JMenu("����");                               //���� �޴��� ������ �ۼ� �� ������ �ޱ�
		JMenuItem version = new JMenuItem("���� ����");
		version.addActionListener(listener);

		help.add(version);                                                              //���� �޴��� ������ �ޱ�
		
		mb.add(file);                                                                       //�޴� �ٿ� �޴� �ް� �����̳ʿ� �޴� �� �ޱ�
		mb.add(edit);
		mb.add(help);
		setJMenuBar(mb);

	}
	
	class MenuActionListener implements ActionListener
	//�׼��� �߻��� Ŀ�ǵ带 �޾ƿͼ� ����ġ������ �ش� �������� ��� ������ �ֱ�
	{
		private JFileChooser chooser;
		public MenuActionListener()
		{
			chooser = new JFileChooser();
		}
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String cmd = e.getActionCommand();
			String filePath;
			int ret;
			
			switch(cmd) 
			{
				case "����" :
					ret = chooser.showOpenDialog(null);
					if(ret != JFileChooser.APPROVE_OPTION)
					{
						JOptionPane.showMessageDialog(null, "������ �������� �ʾҽ��ϴ�", "���", JOptionPane.WARNING_MESSAGE);
						return;
					}
					filePath = chooser.getSelectedFile().getPath();
					text.setText(filePath + " ������ ���õǾ����ϴ�");
					break;
					
				case "����" :
					ret = chooser.showSaveDialog(null);
					if(ret != JFileChooser.APPROVE_OPTION)
					{
						JOptionPane.showMessageDialog(null, "������ �������� �ʾҽ��ϴ�", "���", JOptionPane.WARNING_MESSAGE);
						return;
					}
					filePath = chooser.getSelectedFile().getPath();
					text.setText(filePath + " ���Ͽ� ����Ǿ����ϴ�");
					break;
					
				case "����" :
					ret = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "���� Ȯ��", JOptionPane.YES_NO_OPTION);
					if (ret == JOptionPane.YES_OPTION)
						System.exit(0);
					break;
					
				case "�� ����" :
					Color selectedColor = JColorChooser.showDialog(null, "���� ����", Color.cyan);
					if(selectedColor != null)
						text.setForeground(selectedColor);
					break;
					
				case "�ؽ�Ʈ ����" :
					String newText = JOptionPane.showInputDialog("������ �ؽ�Ʈ�� �Է��ϼ���");
					text.setText(newText);
					break;
					
				case "���� ����" :
					JOptionPane.showMessageDialog(null, "�׽�Ʈ v1.0", "���� ����", JOptionPane.INFORMATION_MESSAGE);
					break;
			}		
		}
	}

	public static void main(String[] args) 
	{
		new MenuTest();
	}
}