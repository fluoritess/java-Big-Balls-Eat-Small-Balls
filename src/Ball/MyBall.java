package Ball;

import java.awt.Color;

import java.awt.Graphics;

public class MyBall {
	private int diameter;
	private int x;
	private int y;
	private Color color;
	private Direction dir;
	public int getDiameter() {
		return diameter;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Color getColor() {
		return color;
	}
	public Direction getDir() {
		return dir;
	}
	
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public MyBall(int diameter, int x, int y, Color color) {
		super();
		this.diameter = diameter;
		this.x = x;
		this.y = y;
		this.color = color;
		dir=null;
	}	
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillOval(x, y, diameter, diameter);  	
		g.setColor(Color.black);
		g.drawOval(x, y, diameter, diameter);
	}
	public void changDirection(Direction newDir)
	{		
			dir=newDir;		
	}
	public void move(int k)
	{
		if(dir!=null){
		switch(dir)
		{
		case LEFT:x-=k;break;
		case UP:y-=k;break;
		case RIGHT:x+=k;break;
		case DOWN:y+=k;break;
		}}
	}
	public void eat(Ball ball,int i)
	{
		int x1=ball.getX();//传入圆的坐标及直径
		int y1=ball.getY();
		int d1=ball.getDiameter();
		if(this.diameter<600)
		{
			if(d1<this.diameter)//判断吃与被吃
			{
				int d=(int)Math.sqrt((x1+d1/2-this.x-this.diameter/2)*(x1+d1/2-this.x-this.diameter/2)+(y1+d1/2-this.y-this.diameter/2)*(y1+d1/2-this.y-this.diameter/2))-1;//两个圆心之间的距离或者减一
				if(d<(int)(d1+this.diameter)/2)
				{				
					this.diameter+=(int)d1/i;
					ball.setX(-100);
					ball.setY(-100);
					ball.setDiameter(0);
					ball=null;
				}
				ball=null;
		}
			else if(d1>this.diameter)
			{
				int d=(int)Math.sqrt((x1+d1/2-this.x-this.diameter/2)*(x1+d1/2-this.x-this.diameter/2)+(y1+d1/2-this.y-this.diameter/2)*(y1+d1/2-this.y-this.diameter/2))-1;//两个圆心之间的距离或者减一
				if(d<(int)(d1+this.diameter)/2)
				{				
					this.x=-100;
					this.y=-100;
					this.diameter=0;
				}
		
			}
		}
	}
}
