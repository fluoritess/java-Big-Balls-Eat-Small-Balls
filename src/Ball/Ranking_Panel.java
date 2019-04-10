package Ball;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ranking_Panel extends JFrame{
		JTextArea jta=null;
		JScrollPane jsp=null;
		JLabel jLabel=null;
		String string="xxx";
		public Ranking_Panel() {
			// TODO Auto-generated constructor stub
			jta=new JTextArea();
			jLabel=new JLabel(string);
			jsp=new JScrollPane(jta);
			jta.append("xxxxxx\nxxxxxx");
			jLabel.setBounds(200, 200, 220, 222);
			this.add(jLabel);
			this.setLayout(null);
			this.setVisible(true);
			this.setSize(400,400);
			this.setLocation(800, 300);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
}
