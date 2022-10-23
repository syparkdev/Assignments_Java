package lab9;


/*영어영문학과 박세연 1613665
 * 21-07-05
 * =버튼을 눌려 곱셈 결과를 출력하는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcFrame extends JFrame
{
	JTextField num1 = new JTextField(6);          //텍스트필드 객체 생성 및 초기화
	JTextField num2 = new JTextField(6);
	JTextField result = new JTextField(12);
	
	public CalcFrame() 
	{
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("=");                                 //버튼 객체 생성
		b1.addActionListener(new MyActionListener());    //버튼에 리스너 달기
		
		JLabel la = new JLabel("X");                                        //라벨 객체 생성
		
		c.add(num1);                                                                 //컴포넌트를 프레임에 추가하기
		c.add(la);
		c.add(num2);
		c.add(b1);
		c.add(result);
		
		setSize(400,100);
		setVisible(true);
	}
	
	private class MyActionListener implements ActionListener                //리스너 클래스 구현하기
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			JButton btn = (JButton)e.getSource();                      //이벤트가 발생한 소스를 받아와 btn에 대입
			
			if (btn.getText().equals("="))                                       // =버튼을 클릭했을 때 곱셈 연산 수행 및 출력
			{
				Integer answer = Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText());
				result.setText(answer.toString());
			}
		}
	}

	public static void main(String[] args) 
	{
		new CalcFrame();
	}
}