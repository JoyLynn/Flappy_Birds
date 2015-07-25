package flappyBird;

import java.awt.Graphics;
import javax.swing.JPanel;

public class render  extends JPanel {
private static final long serialVersionVID = 1L;
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		flappybird.flappyBird.repaint(g);
	}
	
}
