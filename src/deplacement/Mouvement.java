package deplacement;

import miniature.Miniature;

public class Mouvement {

	String type;
	float deplacement;// indique la distance effectuer
	float orientation;
	float decalage;
	
	public Mouvement(String type, float deplacement, float orientation,
			float decalage) {
		super();
		this.type = type;
		this.deplacement = deplacement;
		this.orientation = orientation;
		this.decalage = decalage;
	}
	
	public void setNewPosition(Miniature imageBase){
		Miniature newImage = new Miniature();
		float orientationBase =imageBase.getOrientation();
		float degre = 0; ;
		// on calcule a quel endroit va atterrir la miniature
		if (this.orientation < 90) {
			if ( orientationBase - this.decalage < 0) {
				degre = 360 + (orientationBase - this.decalage );
			}
			else {
				degre = orientationBase - this.decalage ;
			}
		}
		
		// on calcule le deplacement sur x et y que sa implique
		double xBonus = 0;
		double yBonus = 0;
		if ( degre >= 0 && degre < 90){
			xBonus = Math.sin(degre) * deplacement;
			yBonus = Math.cos(degre) * deplacement;
			
		}else if( degre >= 90 && degre < 180){
			xBonus = - Math.sin(degre) * deplacement;
			yBonus = Math.cos(degre) * deplacement;
			
		}else if( degre >= 180 && degre < 270){
			xBonus = -Math.sin(degre) * deplacement;
			yBonus = -Math.cos(degre) * deplacement;
		}else if( degre >= 270){
			xBonus = Math.sin(degre) * deplacement;
			yBonus = - Math.cos(degre) * deplacement;
		}
		
		newImage.setOrientation(orientationBase+this.orientation);
		newImage.move(xBonus,yBonus);
		
	}
	
}