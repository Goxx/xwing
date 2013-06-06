package deplacement;

import miniature.Miniature;

public class Mouvement {

	String type; // le nom du mouvement
	float deplacement;// indique la distance effectuer
	float orientation;// decalage a l orientation du vaisseau a la fin (90 est un mouvement sans virage, 270 un demi tour)
	float decalage; // represente l'orientation du déplacement effectuer ( de 0 a 360)
	float porte; //indique si le mouvement est droit ou un arc de cercle ( 0 est un mouvement droit, positif est un mouvement trigo, negatif un mouvement horaire)
	
	public Mouvement(String type, float deplacement, float orientation,	float decalage) {
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
		
		if (this.decalage < 90 ) {
			degre = orientationBase - 90 + this.decalage;
		}else if (this.decalage >=90 ){
			degre = orientationBase + this.decalage - 90;
		}
		
		if ( degre < 0){
			degre += 360;
		}
		else if ( degre > 360){
			degre-= 360;
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
		//met la nouvelle orientation
		newImage.setOrientation(orientationBase+90-this.orientation);
		//deplace la miniature
		newImage.move(xBonus,yBonus);
		
	}
	
}