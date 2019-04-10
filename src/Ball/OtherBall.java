package Ball;

import java.awt.Color;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class OtherBall {
	private List<Ball> balls=new ArrayList<>();
	public OtherBall(){	
		Random rand = new Random();
		//构造函数初始化产生二十个球
		while(balls.size()<20){
			int x1 = rand.nextInt(201) + -100;
			int x2 = rand.nextInt(201) + 800;
			int y1 = rand.nextInt(201) +-100;
			int y2 = rand.nextInt(201) + 800;
			Ball ball=null;
			int count=(int) (Math.random()*9+1);
			switch (count) {
			case 1:
				ball=new Ball(10,x1, y1, Color.green);balls.add(ball);
				break;
			case 2:
				ball=new Ball(20,x1, y2, Color.black);balls.add(ball);
				break;
			case 3:
				ball=new Ball(30,x2, y1, Color.blue);balls.add(ball);
				break;
			case 4:
				ball=new Ball(40,x2, y2, Color.CYAN);balls.add(ball);
				break;
			case 5:
				ball=new Ball(50,x1, y2, Color.yellow);balls.add(ball);
				break;
			case 6:
				ball=new Ball(60,x1, y1, Color.red);balls.add(ball);
				break;
			case 7:
				ball=new Ball(70,x2, y2, Color.gray);balls.add(ball);
				break;
			case 8:
				ball=new Ball(80,x2, y1, Color.PINK);balls.add(ball);
				break;
			case 9:
				ball=new Ball(14,x2, y2, Color.gray);balls.add(ball);
				break;	
			default:
				break;
			}
		}
	}
	//判断是否有球出界，如果有删除该球添加新球
	public void isAlive()
	{
		for(Ball ball:balls)
		{
			if(ball.getX()<-200||ball.getX()>1000||ball.getY()<-200||ball.getY()>1000){
				ball=null;
			}
		}	
		newball();
	}
	
	public void draw(Graphics g)
	{
		for(Ball ball:balls)
		{
			ball.draw(g);
		}
	}
	
	public void move(int m)
	{
		for(Ball ball:balls)
		{
			ball.move(m);
		}
	}
	public void iseat(MyBall mb,int i)//判断是否被吃
	{
		for(Ball ball:balls)
		{
			mb.eat(ball,i);
		}		
	}
	//产生新球
	public void newball()
	{
			Random rand = new Random();
			int x1 = rand.nextInt(101) + -100;
			int x2 = rand.nextInt(101) + 1000;
			int y1 = rand.nextInt(101) +-100;
			int y2 = rand.nextInt(101) + 1000;
			int x3 = rand.nextInt(1001) + 0;			
			int y3 = rand.nextInt(1001) + 0;
			Ball ball=null;
			int count=(int) (Math.random()*18+1);
			int count2=(int) (Math.random()*100+1);
			if(count2>70)
			{
			switch (count) {
			case 1:
				ball=new Ball(10,x1, y1, Color.green);balls.add(ball);
				break;
			case 2:
				ball=new Ball(20,x1, y2, Color.black);balls.add(ball);
				break;
			case 3:
				ball=new Ball(30,x2, y1, Color.blue);balls.add(ball);
				break;
			case 4:
				ball=new Ball(40,x2, y2, Color.CYAN);balls.add(ball);
				break;
			case 5:
				ball=new Ball(50,x1, y2, Color.yellow);balls.add(ball);
				break;
			case 6:
				ball=new Ball(60,x1, y1, Color.red);balls.add(ball);
				break;
			case 7:
				ball=new Ball(70,x2, y2, Color.gray);balls.add(ball);
				break;
			case 8:
				ball=new Ball(80,x2, y1, Color.PINK);balls.add(ball);
				break;
			case 9:
				ball=new Ball(100,x1, y1, Color.magenta);balls.add(ball);
				break;	
			case 10:
				ball=new Ball(14,x2, y2, Color.gray);balls.add(ball);
				break;
			case 11:
				ball=new Ball(70,x1, y3, Color.gray);balls.add(ball);
				break;
			case 12:
				ball=new Ball(80,x3, y1, Color.PINK);balls.add(ball);
				break;
			case 13:
				ball=new Ball(100,x3, y2, Color.magenta);balls.add(ball);
				break;	
			case 14:
				ball=new Ball(14,x2, y3, Color.gray);balls.add(ball);
				break;	
			case 15:
				ball=new Ball(10,x1, y3, Color.green);balls.add(ball);
				break;
			case 16:
				ball=new Ball(20,x3, y1, Color.black);balls.add(ball);
				break;
			case 17:
				ball=new Ball(30,x2, y3, Color.blue);balls.add(ball);
				break;
			case 18:
				ball=new Ball(40,x3, y2, Color.CYAN);balls.add(ball);
				break;	
			default:
				break;
			}
		}
	}

}

