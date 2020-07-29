package jeuxk;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.personnage.Mario;

import java.awt.Graphics2D;

@SuppressWarnings("serial")
public class Scene extends JPanel {
	private ImageIcon icoFond ; 
	private Image imgFond1 ; 
	private Image imgFond2 ; 
	
	private ImageIcon icoChateau1 ; 
	private Image imgChateau1 ; 
	private Image imgDepart ; 
	private ImageIcon icoDepart ;
	
	private int xFond1 ;
	private int xFond2 ; 
	private int dx ; 
	private int xPos ; 
	public Mario mario ; 
	public Scene() {
		super() ; 
		this.xFond1=-50;
		this.xFond2=750;
		this.dx=0 ; 
		this.xPos=-1;
		mario=new Mario(300,245);
		icoFond= new ImageIcon(getClass().getResource("/hki/fondEcran.png"));
		this.imgFond1=this.icoFond.getImage();
		this.imgFond2=this.icoFond.getImage();
		
		icoChateau1= new ImageIcon(getClass().getResource("/hki/chateau1.png"));
		this.imgChateau1=this.icoChateau1.getImage();
		icoDepart= new ImageIcon(getClass().getResource("/hki/depart.png"));
		this.imgDepart=this.icoDepart.getImage();
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier()) ; 
		Thread chronoEcran=new Thread(new Chrono()) ; 
		chronoEcran.start();
	}
	public int getDx() {return dx ; }
	
	public int getxPos() {return xPos;}
	
	public void setDx(int dx) {this.dx=dx ;  }
	public void setxPos(int xPos) {this.xPos = xPos;}
	
	public void setxFond1(int xFond1) {
		this.xFond1 = xFond1;
	}
	public void setxFond2(int xFond2) {
		this.xFond2 = xFond2;
	}
	public void deplacementsFond() {
		if(this.xPos>=0) {this.xPos=this.xPos+this.dx ; 
		this.xFond1= this.xFond1 - this.dx ; 
		this.xFond2= this.xFond2 - this.dx ; }
		if(this.xFond1==-800) {this.xFond1=800 ; }
		else if(this.xFond2==-800) {this.xFond2=800 ; }
		else if(this.xFond1==800) {this.xFond1=-800 ; }
		else if(this.xFond2==800) {this.xFond2=-800 ; }
		
	}
	
	public void  paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2=(Graphics2D)g;
		this.deplacementsFond();
		g2.drawImage(this.imgFond1, this.xFond1, 0, null);
		g2.drawImage(this.imgFond2, this.xFond2, 0, null);
		g2.drawImage(this.mario.getImgMario(), 300, 245, null);
		g2.drawImage(this.imgChateau1, 10-this.xPos, 95, null);
		g2.drawImage(imgDepart,220-this.xPos, 234, null);
		
}
}