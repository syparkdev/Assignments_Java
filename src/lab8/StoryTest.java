package lab8;


/*1613665 영어영문학과 박세연
 * 21-07-02
 * 배치관리자 없이 컴포넌트를 배치하는 프로그램입니다.
 */

import java.awt.*;
import javax.swing.*;

public class StoryTest extends JFrame
{
	StoryTest()
	{
		setTitle("SM Story");                                                                //제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //x버튼으로 종료
		
		
		Container c = getContentPane();                                 //컨테이너 생성하고 배치관리자 없애기
		c.setLayout(null);
		
		JLabel la1 = new JLabel("SM Story");                       //컴포넌트 생성
		JLabel la2 = new JLabel("가을은");
		JLabel la3 = new JLabel("이다");
		JTextField tf = new JTextField();

		c.add(la1);                                                                   //각 컴포넌트 사이즈 설정과 배치
		la1.setLocation(20, 20);
		la1.setSize(60, 20);

		c.add(la2);
		la2.setLocation(100, 50);
		la2.setSize(60, 20);

		c.add(tf);
		tf.setLocation(180, 80);
		tf.setSize(80, 20);

		c.add(la3);
		la3.setLocation(300, 110);
		la3.setSize(60, 20);
		
		setSize(450, 250);
		setVisible(true);
		
	}
		
	public static void main(String[] args) 
	{
		new StoryTest();

	}
}
