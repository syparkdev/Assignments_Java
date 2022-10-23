package lab8;


/*1613665 영어영문학과 박세연
 * 21-07-02
 * 배치관리자의 혼합 사용을 연습하는 프로그램입니다.
 */


import java.awt.*;
import javax.swing.*;

public class GuiTest extends JFrame
{
	GuiTest()
	{
		setTitle("GUI TEST");                                                                        //제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            //x버튼으로 종료
		
		Container c = getContentPane();                                                 //배치 관리자를 보더레이아웃으로 설정
		c.setLayout(new BorderLayout(5,7));
		
		JPanel p1 = new JPanel();                                        //그리드 레이아웃으로 라벨을 배치한 서쪽 보더
		p1.setLayout(new GridLayout(4, 0));
		p1.add(new JLabel("이름"));
		p1.add(new JLabel("학번"));
		p1.add(new JLabel("전공"));
		p1.add(new JLabel("연락처"));
		c.add(p1, BorderLayout.WEST);
		
		JPanel p2 = new JPanel();                                        //그리드 레이아웃으로 텍스트필드를 배치한 중앙 보더
		p2.setLayout(new GridLayout(4, 0, 5, 5));
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		p2.add(new JTextField(""));
		c.add(p2, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel();                                       //플로우 레이아웃으로 버튼을 배치한 남쪽 보더
		p3.setLayout(new FlowLayout());
		p3.add(new JButton("확인"));
		p3.add(new JButton("취소"));
		c.add(p3, BorderLayout.SOUTH);
		
		JPanel p4 = new JPanel();                                       //텍스트필드와 제목 사이에 틈을 주기 위한 패널
		c.add(p4, BorderLayout.NORTH);

		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new GuiTest();

	}

}
