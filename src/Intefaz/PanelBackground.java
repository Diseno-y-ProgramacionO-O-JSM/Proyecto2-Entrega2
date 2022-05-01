package Intefaz;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class PanelBackground extends JPanel {

	private Image background;
	
	public void paintComponent(Graphics g) {
		
		int width = this.getSize().width;
		int height = this.getSize().height;

		if (this.background != null) {
			
			g.drawImage(this.background, 0, 0, width, height-30,null );
			
		}

		super.paintComponent(g);
	}

	public void setBackground(String imagePath) {
		
		
		this.setOpaque(false);
		this.background = new ImageIcon(imagePath).getImage();
	
		
		repaint();
	}

}
