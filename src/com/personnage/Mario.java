package com.personnage;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Mario extends Personnage {
	private ImageIcon icoMario ;
	private Image imgMario ;

	public Mario(int x, int y) {
		super(x, y,28,50);
		icoMario=new ImageIcon("src/hki/marioMarcheDroite.png");
		this.imgMario=this.icoMario.getImage();
		// TODO Auto-generated constructor stub
	}

	public Image getImgMario() {
		return imgMario;
	}
	

}
