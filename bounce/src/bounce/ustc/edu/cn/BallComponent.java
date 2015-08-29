package bounce.ustc.edu.cn;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class BallComponent extends JPanel{

	private static final int DEFAULT_WIDTH = 450;
	private static final int DEFAULT_HEIGH = 350;
	
	private List<Ball> balls = new ArrayList<>();
	
	public void add(Ball b){
		balls.add(b);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		for(Ball b: balls){
			g2.fill(b.getShape());
		}
	}
}
