package Ball;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.omg.CORBA.PUBLIC_MEMBER;

public class AgainPanel extends JFrame implements ActionListener{
	JButton jb1=null;
	JButton jb2=null;
	JButton jb3=null;
	public AgainPanel()
	{
		jb1=new JButton("重新开始");
		jb2=new JButton("结束游戏");
		jb3=new JButton("查看排名");
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		jb1.addActionListener(this);
		jb1.setActionCommand("jb1");
		jb2.addActionListener(this);
		jb2.setActionCommand("jb2");
		jb3.addActionListener(this);
		jb3.setActionCommand("jb3");
		this.setVisible(true);
		this.setLayout(new GridLayout(3,1));
		this.setLocation(800, 300);
		this.setSize(300, 400);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("jb1"))
		{
			Select_Frame sFrame=new Select_Frame();
		}
		else if(e.getActionCommand().equals("jb2"))
		{
			this.setVisible(false);
		}
	}
}
