package lab10;


/*영어영문학과 1613665 박세연
 * 21-07-06
 * 리스트를 추가하고 삭제하는 프로그램입니다.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Vector;

public class ListTest extends JFrame
{
	public ListTest() 
	{
		setTitle("리스트 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		
		JTextField tfInput = new JTextField();                       //리스트에 새로운 요소를 추가하는 텍스트필드
		
		Vector<String> v = new Vector<>();                         //리스트를 구성할 벡터
		JList<String> scrollList = new JList<String>(v);     //벡터로 구성한 리스트
		JScrollPane sp = new JScrollPane(scrollList);		 //스크롤팬에 리스트 달기
		
		JPanel under = new JPanel();                                     //수정 텍스트필드와 수정버튼, 삭제버튼
		under.setLayout(new FlowLayout());
		JTextField tfUpdate = new JTextField(12);
		JButton btnUpdate = new JButton("수정");
		JButton btnDelete = new JButton("삭제");
		under.add(tfUpdate);
		under.add(btnUpdate);
		under.add(btnDelete);
		
		tfInput.addActionListener(new ActionListener()    //입력을 처리하는 리스너
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JTextField tf1 = (JTextField)e.getSource();
				v.add(tf1.getText());
				scrollList.setListData(v);
				tfInput.setText("");
			}
			
		});
		
		scrollList.addListSelectionListener(new ListSelectionListener()
				//리스트에서 선택한 항목을 수정 텍스트필드에 보여주는 리스너
		{
			@Override
			public void valueChanged(ListSelectionEvent e) 
			{
				String name = (String) scrollList.getSelectedValue();
				int idx = scrollList.getSelectedIndex();
				tfUpdate.setText(name);
			}
		});
		
		btnUpdate.addActionListener(new ActionListener()             //수정을 처리하는 리스너
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				int idx = scrollList.getSelectedIndex();
				v.remove(idx);
				v.add(idx, tfUpdate.getText());
				scrollList.setListData(v);
			}		
		});
		
		btnDelete.addActionListener(new ActionListener()            //삭제를 처리하는 리스너
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				int idx = scrollList.getSelectedIndex();
				v.remove(idx);
				scrollList.setListData(v);
				
			}		
		});
		
		p.add(tfInput, BorderLayout.NORTH);
		p.add(sp, BorderLayout.CENTER);
		p.add(under, BorderLayout.SOUTH);		
		c.add(p);
		setSize(300, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new ListTest();
	}

}
