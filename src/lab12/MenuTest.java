package lab12;


/*영어영문학과 1613665 박세연
 * 21-07-06
 * 메뉴와 툴팁 등의 사용을 연습하는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuTest extends JFrame
{
	JLabel text = new JLabel("Text");                              //텍스트를 표시할 라벨

	public MenuTest() 
	{
		setTitle("Menu 만들기 예제");                                        //컨테이너와 배경 패널 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setBackground(Color.decode("#F0EDCC"));
		createMenu();                                                                //메뉴바를 만드는 메소드 호출
		p.add(text);
		text.setToolTipText("편집에 따라 변경될 영역입니다");
		c.add(p);
		setSize(500, 300);
		setVisible(true);
	}
	
	private void createMenu()
	{
		JMenuBar mb = new JMenuBar();
		MenuActionListener listener = new MenuActionListener();
		
		JMenu file = new JMenu("파일");                                      //파일 메뉴의 아이템 작성 후 리스너 달기
		
		JMenuItem open = new JMenuItem("열기");
		open.addActionListener(listener);
		
		JMenuItem save = new JMenuItem("저장");
		save.addActionListener(listener);
		
		JMenuItem exit = new JMenuItem("종료");
		exit.addActionListener(listener);
		
		file.add(open);                                                                   //파일 메뉴에 아이템 달기
		file.add(save);
		file.addSeparator();
		file.add(exit);
		
		JMenu edit = new JMenu("편집");                                 //편집 메뉴의 아이템 작성 후 리스너 달기
		JMenuItem color = new JMenuItem("색 선택");
		color.addActionListener(listener);

		JMenuItem font = new JMenuItem("폰트");
		font.addActionListener(listener);

		JMenuItem textchange = new JMenuItem("텍스트 변경");
		textchange.addActionListener(listener);

		edit.add(color);                                                                  //편집 메뉴에 아이템 달기
		edit.add(font);
		edit.add(textchange);

		
		JMenu help = new JMenu("도움말");                               //도움말 메뉴의 아이템 작성 후 리스너 달기
		JMenuItem version = new JMenuItem("버전 정보");
		version.addActionListener(listener);

		help.add(version);                                                              //도움말 메뉴에 아이템 달기
		
		mb.add(file);                                                                       //메뉴 바에 메뉴 달고 컨테이너에 메뉴 바 달기
		mb.add(edit);
		mb.add(help);
		setJMenuBar(mb);

	}
	
	class MenuActionListener implements ActionListener
	//액션이 발생한 커맨드를 받아와서 스위치문으로 해당 아이템의 기능 갈림길 주기
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
				case "열기" :
					ret = chooser.showOpenDialog(null);
					if(ret != JFileChooser.APPROVE_OPTION)
					{
						JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", "경고", JOptionPane.WARNING_MESSAGE);
						return;
					}
					filePath = chooser.getSelectedFile().getPath();
					text.setText(filePath + " 파일이 선택되었습니다");
					break;
					
				case "저장" :
					ret = chooser.showSaveDialog(null);
					if(ret != JFileChooser.APPROVE_OPTION)
					{
						JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", "경고", JOptionPane.WARNING_MESSAGE);
						return;
					}
					filePath = chooser.getSelectedFile().getPath();
					text.setText(filePath + " 파일에 저장되었습니다");
					break;
					
				case "종료" :
					ret = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "종료 확인", JOptionPane.YES_NO_OPTION);
					if (ret == JOptionPane.YES_OPTION)
						System.exit(0);
					break;
					
				case "색 선택" :
					Color selectedColor = JColorChooser.showDialog(null, "색상 선택", Color.cyan);
					if(selectedColor != null)
						text.setForeground(selectedColor);
					break;
					
				case "텍스트 변경" :
					String newText = JOptionPane.showInputDialog("변경할 텍스트를 입력하세요");
					text.setText(newText);
					break;
					
				case "버전 정보" :
					JOptionPane.showMessageDialog(null, "테스트 v1.0", "버전 정보", JOptionPane.INFORMATION_MESSAGE);
					break;
			}		
		}
	}

	public static void main(String[] args) 
	{
		new MenuTest();
	}
}