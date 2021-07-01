package Ball;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;


import java.awt.Graphics;
import java.awt.List;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.invoke.SwitchPoint;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.print.attribute.standard.MediaSize.Other;
import javax.swing.*;



public class Frame extends JFrame{
		private BufferedImage image=new BufferedImage(1000, 1000, 1);
		private OtherBall otherBall=new OtherBall();
		private MyBall mb=new MyBall(15, 500, 500, Color.white);
		private boolean isAnimate=true;
		JPanel jp1=null;
		JButton jb1=null;
		JLabel jlb1=null;
		String string="当前直径:";
		public Frame(int i,int k,int m,int j)//i控制增长速度，k我的控制速度,m控制敌方速度,j控制线程刷新
		{
			
			jp1=new JPanel();
			jb1=new JButton("重新开始");
			jp1.add(jb1);
			jlb1=new JLabel(string);
			jlb1.setBounds(10, 10, 80, 20);
			
			this.add(jlb1);
			this.setLayout(null);
			this.setVisible(true);
			this.setTitle("大球吃小球");
			this.setSize(1000, 1000);
			this.setLocation(400, 0);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setBackground(Color.white);
			this.addKeyListener(new suspend());
			
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e)
				{
						Direction newDir=mb.getDir();
						switch(e.getKeyCode())
						{
						case KeyEvent.VK_A:
							newDir=Direction.LEFT;break;
						case KeyEvent.VK_W:
							newDir=Direction.UP;break;
						case KeyEvent.VK_D:
							newDir=Direction.RIGHT;break;
						case KeyEvent.VK_S:
							newDir=Direction.DOWN;break;
						
						}
						if(newDir!=mb.getDir())
						{
							mb.changDirection(newDir);
						}
				}/*
				public void keyReleased(KeyEvent e)
				{
					Direction newDir=mb.getDir();
					switch(e.getKeyCode())
					{
					case KeyEvent.VK_A:
						newDir=null;break;
					case KeyEvent.VK_W:
						newDir=null;break;
					case KeyEvent.VK_D:
						newDir=null;break;
					case KeyEvent.VK_S:
						newDir=null;break;
					
					}
					if(newDir!=mb.getDir())
					{
						mb.changDirection(newDir);
					}
				}*/
			});
			
			
	
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					while(true)
					{			
						if(isAnimate){
						otherBall.iseat(mb,i);
						otherBall.isAlive();
						string="当前直径:"+mb.getDiameter();
						jlb1.setText(string);
						if(mb.getDiameter()!=0&&mb.getX()>-100&&mb.getX()<1100&&mb.getY()>-100&&mb.getY()<1100){
						otherBall.move(m);
						mb.move(k);
						repaint();
						}
						else{
							try {
								Thread.sleep(3000);
								setVisible(false);
								
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("游戏失败");
							AgainPanel againPanel=new AgainPanel();
							break;
						}
						}
						try {
							Thread.sleep(j);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();
			
			
		}
		
		public void paint(Graphics g)
		{
			Graphics g2=image.getGraphics();
			super.paint(g2);			
			otherBall.draw(g2);
			mb.draw(g2);
			g.drawImage(image, 0, 0, null);
		}
		private class suspend extends KeyAdapter{
			public void keyReleased(KeyEvent e){
				if((e.getKeyChar())==' '){
					isAnimate=!isAnimate;
				}
		} 
		}
}
