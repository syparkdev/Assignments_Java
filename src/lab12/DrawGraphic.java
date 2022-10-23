package lab12;


/*영어영문학과 1613665 박세연
 * 21-07-06
 * 툴바가 있는 컨테이너에서 도형을 그리는 프로그램입니다.
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
		setTitle("그래픽 그리기");                                        //컨테이너와 배경 패널 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createTb();                                                                //메뉴바를 만드는 메소드 호출
		JPanel p = new MyPanel();
		c.add(p, BorderLayout.CENTER);
		setSize(600, 500);
		setVisible(true);
	}
	
	private void createTb()
	{
		JToolBar tb = new JToolBar("도형 툴바");
		tb.setBackground(Color.LIGHT_GRAY);
		
		JLabel shape = new JLabel("도형");
		JLabel chooseColor = new JLabel("색 선택");
		
		JButton line = new JButton("선");
		JButton square = new JButton("사각형");
		JButton circle = new JButton("원");
		JButton tri = new JButton("삼각형");
		JButton colorBtn = new JButton("Color");
		colorBtn.addActionListener(new ActionListener()        //컬러 버튼을 클릭하면 색상 선택 창이 뜨도록 하는 리스너
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Color selectedColor = JColorChooser.showDialog(null, "색상 선택", Color.cyan);
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
	
	class MyPanel extends JPanel                        //도형을 그릴 패널
	{
		@Override
		protected void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			g.setColor(color);                                        //선택한 색으로 그릴 컬러 설정
			
			
		}
		
	}


	public static void main(String[] args) 
	{
		new DrawGraphic();
	}
}