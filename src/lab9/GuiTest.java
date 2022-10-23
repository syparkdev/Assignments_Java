package lab9;


/*영어영문학과 박세연 1613665
 * 21-07-05
 * 버튼에 대한 액션 이벤트를 처리하는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiTest extends JFrame
{
	JTextField tf1 = new JTextField("");          //텍스트필드 객체 생성 및 초기화
	JTextField tf2 = new JTextField("");
	JTextField tf3 = new JTextField("");
	JTextField tf4 = new JTextField("");
	
	public GuiTest() 
	{
		setTitle("GUI TEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(20, 5));
		
		JButton b1 = new JButton("확인");                                 //버튼 객체 생성
		b1.addActionListener(new MyActionListener());        //버튼에 리스너 달기
		JButton b2 = new JButton("취소");
		b2.addActionListener(new MyActionListener());
		
		JPanel p1 = new JPanel();                                               //프레임의 서쪽 보더에 라벨 패널 달기
		p1.setLayout(new GridLayout(4, 0, 0, 5));
		p1.add(new JLabel("이름"));
		p1.add(new JLabel("학번"));
		p1.add(new JLabel("전공"));
		p1.add(new JLabel("연락처"));
		c.add(p1, BorderLayout.WEST);
		
		JPanel p2 = new JPanel();                                               //프레임 중앙 보더에 텍스트필드 패널 달기
		p2.setLayout(new GridLayout(4, 0, 0, 5));
		p2.add(tf1);
		p2.add(tf2);
		p2.add(tf3);
		p2.add(tf4);
		c.add(p2, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel();                                              //프레임 남쪽 보더에 버튼 패널 달기
		p3.setLayout(new FlowLayout());
		p3.add(b1);
		p3.add(b2);
		c.add(p3, BorderLayout.SOUTH);
		
		setSize(300,200);
		setVisible(true);
	}
	
	private class MyActionListener implements ActionListener                //리스너 클래스 구현하기
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			JButton btn = (JButton)e.getSource();                      //이벤트가 발생한 소스를 받아와 btn에 대입
			
			if (btn.getText().equals("확인"))                                   //누른 버튼이 확인일 시 텍스트필드 내용 출력
				System.out.print(tf1.getText() + "\t" + tf2.getText() + "\t" + tf3.getText() + "\t" + tf4.getText());
			
			else if (btn.getText().equals("취소"))                           //취소일 시 텍스트필드 초기화
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