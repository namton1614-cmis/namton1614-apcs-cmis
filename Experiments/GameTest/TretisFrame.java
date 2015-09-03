/*
 * 							Redemptie tutorial demo
 * 					Charles Thomson Tretis for youtube 
 * 
 * 							December the 16th 2011
 * 
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;



import javax.swing.JFrame;



public class TretisFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	public TretisPanel pan;
	public Dimension dim;
	int locX;
	int locY;
	public TretisFrame() throws InterruptedException{
		
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		locX=(int) dim.getWidth()*4/12;//this is to set the game into the center of the screen
		locY=(int) dim.getHeight()*2/12;
		pan = new TretisPanel();
		this.setTitle("TretisFrame");
		this.setSize(326,585);
		this.setLocation(locX, locY);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setFocusable(true);
		this.setResizable(false);
		this.add(pan);
		addKeyListener(pan);
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException{
		new TretisFrame();
	}
}