package jeuxk;

import javax.swing.JFrame;

public class Main {
	public static Scene scene ; 
	public static void main(String[] arg) {
	
		
		JFrame fenetre = new JFrame("mario 2018");
		  fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  fenetre.setSize(700, 360);
		  fenetre.setLocationRelativeTo(null);
		  fenetre.setResizable(false);
		  fenetre.setAlwaysOnTop(true);
		  
		  scene=new Scene() ; 
		 fenetre.setContentPane(scene);
		 fenetre.setVisible(true);
		 
		  
		   
		
	}

}
