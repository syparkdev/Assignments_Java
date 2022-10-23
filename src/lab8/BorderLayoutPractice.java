package lab8;


/*1613665 영어영문학과 박세연
 * 21-07-02
 * BorderLayout을 사용하여 컴포넌트 사이의 간격을 조절하는 프로그램입니다.
 */

import java.awt.*;
import javax.swing.*;

public class BorderLayoutPractice extends JFrame
{
	BorderLayoutPractice()
	{
		setTitle("BorderLayoutPractice");                                        //제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //x버튼으로 종료
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,7));                                 //BorderLayout으로 설정 후 간격 조정
		c.add(new JButton("Center"), BorderLayout.CENTER);  //버튼 추가
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("East"), BorderLayout.EAST);
		
		setSize(400, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new BorderLayoutPractice();

	}

}
