package Ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Select_Frame extends JFrame implements ActionListener{
	JButton jb1=null;
	JButton jb2=null;
	JButton jb3=null;
	JButton jb4=null;
	JButton jb5=null;
	Select_Frame()
	{
		jb1=new JButton("简单");
		jb2=new JButton("普通");
		jb3=new JButton("困难");
		jb4=new JButton("极难");
		jb5=new JButton("炼狱");
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb1.setActionCommand("jb1");
		jb2.setActionCommand("jb2");
		jb3.setActionCommand("jb3");
		jb4.setActionCommand("jb4");
		jb5.setActionCommand("jb5");
		this.setTitle("选择难度");
		this.setVisible(true);
		this.setLocation(700,300);
		this.setSize(400,400);
		this.setLayout(new GridLayout(5, 1));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		Select_Frame sf=new Select_Frame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("jb1")){			
			this.setVisible(false);
			Frame frame=new Frame(2,2,1,10);
		}
		else if(e.getActionCommand().equals("jb2")){			
			this.setVisible(false);
			Frame frame=new Frame(4,2,1,10);
		}
		else if(e.getActionCommand().equals("jb3")){			
			this.setVisible(false);
			Frame frame=new Frame(6,2,1,10);
		}
		else if(e.getActionCommand().equals("jb4")){			
			this.setVisible(false);
			Frame frame=new Frame(6,2,1,8);
		}
		else if(e.getActionCommand().equals("jb5")){			
			this.setVisible(false);
			Frame frame=new Frame(6,2,1,6);
		}
	}
}
