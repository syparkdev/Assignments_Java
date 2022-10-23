package lab10;


/*영어영문학과 1613665 박세연
 * 21-07-06
 * 폰트와 사이즈 등을 바꾸어 결과를 확인하는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class FontTest extends JFrame
{
	JLabel resultLbl = new JLabel("Default");
	int fontSize = 20;
	String fontName = "굴림";
	int fontStyle = Font.PLAIN;
	Font font = new Font(fontName, fontStyle, fontSize);
	JCheckBox cbx1 = new JCheckBox("BOLD");
	JCheckBox cbx2 = new JCheckBox("ITALIC");
	JRadioButton gulim = new JRadioButton("굴림", true);
	JRadioButton dotum = new JRadioButton("돋움");
	JRadioButton gungsu = new JRadioButton("궁서");

	public FontTest() 
	{
		setTitle("Font 설정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout(10, 10));
		
		JPanel categories = new JPanel();                                         //컨테이너 서쪽의 카테고리 라벨 패널
		categories.setLayout(new GridLayout(4, 0, 10, 10));
		JLabel la1 = new JLabel("Font 설정", SwingConstants.CENTER);
		JLabel la2 = new JLabel("Style 설정", SwingConstants.CENTER);
		JLabel la3 = new JLabel("Size 설정", SwingConstants.CENTER);
		JLabel la4 = new JLabel("Text 내용", SwingConstants.CENTER);
		categories.add(la1);
		categories.add(la2);
		categories.add(la3);
		categories.add(la4);
		p.add(categories, BorderLayout.WEST);
		
		JPanel buttons = new JPanel();                                            //컨테이너 중앙의 버튼 패널
		buttons.setLayout(new GridLayout(4, 0, 10, 10));
		
		radiobtnListener listener1 = new radiobtnListener();     //라디오버튼에 각각 리스너 달기
		gulim.addItemListener(listener1);
		dotum.addItemListener(listener1);
		gungsu.addItemListener(listener1);
		
		JPanel radiobtns = new JPanel();                                        //라디오버튼 패널과 그룹에 버튼 달기
		ButtonGroup g = new ButtonGroup();
		
		g.add(gulim);
		g.add(dotum);
		g.add(gungsu);
		radiobtns.add(gulim);
		radiobtns.add(dotum);
		radiobtns.add(gungsu);
		
		JPanel checkbxs = new JPanel();                                     //체크박스에 리스너 달고 체크박스 패널에 체크박스 달기
		cbxListener listener2 = new cbxListener();
		cbx1.addItemListener(listener2);
		checkbxs.add(cbx1);
		cbx2.addItemListener(listener2);
		checkbxs.add(cbx2);
	
		JTextField size = new JTextField("20");                         //폰트 사이즈 텍스트필드 기본값과 함께 생성
		size.addActionListener(new ActionListener()             //텍스트필드 리스너 익명으로 생성
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
		
		JTextField content = new JTextField();                         //폰트 테스트 라벨 내용 텍스트필드 생성
		content.addActionListener(new ActionListener()     //텍스트필드 리스너 익명으로 생성
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JTextField content = (JTextField)e.getSource();
				resultLbl.setText(content.getText());			
			}
		});

		buttons.add(radiobtns);                                              //버튼 패널에 버튼 종류별로 따로 묶은 패널 달기
		buttons.add(checkbxs);
		buttons.add(size);
		buttons.add(content);		
		p.add(buttons, BorderLayout.CENTER);
		
		JPanel resultPanel = new JPanel();	                         //결과 라벨이 위치할 패널
		Border resultBorder = BorderFactory.createTitledBorder("Font 설정 결과");
		resultPanel.setBorder(resultBorder);
		resultLbl.setFont(font);
		resultPanel.add(resultLbl);
		p.add(resultPanel, BorderLayout.SOUTH);
		
		c.add(p);
		setSize(300, 300);
		setVisible(true);
	}
	
	class cbxListener implements ItemListener                    //체크박스 리스너
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
	
	class radiobtnListener implements ItemListener                  //라디오버튼 리스너
	{

		@Override
		public void itemStateChanged(ItemEvent e) 
		{
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if(e.getStateChange() == ItemEvent.SELECTED)
			{
				if(gulim.isSelected())
					fontName = "굴림";
				else if(dotum.isSelected())
					fontName = "돋움";
				else if(gungsu.isSelected())
					fontName = "궁서";
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