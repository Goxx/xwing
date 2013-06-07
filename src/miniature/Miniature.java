package miniature;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import pilot.Pilot;

public class Miniature {

	private Pilot pilot;
	private Image image;
	private int x;
	private int y;
	private int width; // rapport avec y ou x ? x je pense
	private int height; // rapport avec x ou y ? y je pense
	private int orientation;
	
	public Miniature(Pilot pilot, Image image, int x, int y, int width, int height,int orientation) {
		this.pilot = pilot;
		this.image = image;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.orientation = orientation;
	}
	
	public Miniature() {
		this.pilot = null;
		this.image = null;
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
		this.orientation = 0;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getOrientation() {
		return orientation;
	}

	/**
	 * verifie si l orientation est positif
	 * @param orientation
	 */
	public void setOrientation(int orientation) {
		if (orientation < 0)
			this.orientation = 360 + orientation;
		else
			this.orientation = orientation;
	}

	public void move(double xBonus, double yBonus) {
		this.x += xBonus;
		this.y += yBonus;
	}

	public void dessiner(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		int taille = 40;
		g.drawOval((int)x-width/2, (int)y-height/2, width, height);
		g.setColor(Color.RED);
		//if ( orientation == 90)
		int xArrivee = 0 ;
		int yArrivee = 0;
		
		
		if (orientation  >= 0 && orientation <=90){
			yArrivee = (int)( y - (Math.cos(Math.toRadians(90 - orientation)) * taille));
			xArrivee = (int) (x + (Math.sin(Math.toRadians(90 - orientation)) * taille));
		}else if( orientation > 90 && orientation <= 180){
			yArrivee = (int)( y - (Math.sin(Math.toRadians(180 - orientation)) * taille));
			xArrivee = (int)( x - (Math.cos(Math.toRadians(180 - orientation)) * taille));
		}
		else if( orientation > 180 && orientation <= 270){
			yArrivee = (int)( y + (Math.cos(Math.toRadians(270 - orientation)) * taille));
			xArrivee = (int)( x - (Math.sin(Math.toRadians(270 - orientation)) * taille));
		}
		else if( orientation > 270){
			yArrivee = (int)( y + (Math.sin(Math.toRadians(360 - orientation)) * taille));
			xArrivee = (int)( x + (Math.cos(Math.toRadians(360 - orientation)) * taille));
		}
		g.drawLine((int) x , (int)  y , xArrivee, yArrivee);
		//g.drawLine((int) x , (int)  y , x+30, (int)y);
		//if ( orientation == 270)
		//	g.drawLine((int) x , (int)  y,(int) (x),(int) (y +5));
	}
	
}
