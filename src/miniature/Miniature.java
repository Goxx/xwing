package miniature;

import java.awt.Image;

import pilot.Pilot;

public class Miniature {

	private Pilot pilot;
	private Image image;
	private float x;
	private float y;
	private float width;
	private float height;
	private float orientation;
	
	public Miniature(Pilot pilot, Image image, float x, float y, float width, float height,float orientation) {
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

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getOrientation() {
		return orientation;
	}

	/**
	 * verifie si l orientation est positif
	 * @param orientation
	 */
	public void setOrientation(float orientation) {
		if (orientation < 0)
			this.orientation = 360 + orientation;
		else
			this.orientation = orientation;
	}

	public void move(double xBonus, double yBonus) {
		this.x += xBonus;
		this.y += yBonus;
	}
	
}
