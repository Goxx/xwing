package miniature;

import java.awt.Image;

import pilot.Pilot;

public class Miniature {

	private Pilot pilot;
	private Image image;
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Miniature(Pilot pilot, Image image, int x, int y, int width, int height) {
		this.pilot = pilot;
		this.image = image;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
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
	
	public void move(int x, int y) {
		
	}
	
}
