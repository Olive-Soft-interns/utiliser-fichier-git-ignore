package jeuxk;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener {
	

	@Override
	public void keyTyped(KeyEvent e) {
		Main.scene.setDx(0);
		}
		
	

	@Override
	public void keyPressed(KeyEvent e) {
		
		
     if(e.getKeyCode()== KeyEvent.VK_RIGHT)
			
		{if(Main.scene.getxPos()==-1) {
    	 Main.scene.setDx(1);
    	 Main.scene.setxPos(0);
    	 Main.scene.setxFond1(-50);
    	 Main.scene.setxFond2(750);
    	 
    	 }}
     else if(e.getKeyCode()== KeyEvent.VK_LEFT) {
			Main.scene.setDx(-1);
			
		                                         }
	                                     }

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}
