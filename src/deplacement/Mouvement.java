package deplacement;

import miniature.Miniature;

public class Mouvement {

	String type; // le nom du mouvement
	double deplacement;// indique la distance effectuer ( par rapport à la taille d'un vaisseau )
	int orientation;// decalage a l orientation du vaisseau a la fin (90 est un mouvement sans virage, 270 un demi tour)
	int decalage; // represente l'orientation du déplacement effectuer ( de 0 a 360)
	int portee; //indique si le mouvement est droit ou un arc de cercle ( 0 est un mouvement droit, positif est un mouvement trigo, negatif un mouvement horaire)
	
	public Mouvement(String type, double deplacement, int orientation,	int decalage,int portee) {
		this.type = type;
		this.deplacement = deplacement;
		this.orientation = orientation;
		this.decalage = decalage;
		this.portee = portee;
	}
	
	public void setNewPosition(Miniature imageBase){
		Miniature newImage = new Miniature();
		int orientationBase =imageBase.getOrientation();
		int degre = 0; ;
		double deplacementPixel = deplacement * imageBase.getHeight();
		// on calcule a quel endroit va atterrir la miniature
		
		if (this.decalage < 90 ) {
			degre = orientationBase - 90 + this.decalage;
		}else if (this.decalage >=90 ){
			degre = orientationBase + this.decalage - 90;
		}
		
		if ( degre < 0){
			degre += 360;
		}
		else if ( degre >= 360){
			degre-= 360;
		}
		// on calcule le deplacement sur x et y que sa implique
		double xBonus = 0;
		double yBonus = 0;
		if ( degre >= 0 && degre < 90){
			yBonus = -Math.cos(Math.toRadians(90-degre)) * deplacementPixel;
			xBonus = Math.sin(Math.toRadians(90-degre)) * deplacementPixel;
			
		}else if( degre >= 90 && degre < 180){
			yBonus = - Math.sin(Math.toRadians(180-degre)) * deplacementPixel;
			xBonus = - Math.cos(Math.toRadians(180-degre)) * deplacementPixel;
			
		}else if( degre >= 180 && degre < 270){
			yBonus = +Math.cos(Math.toRadians(270-degre)) * deplacementPixel;
			xBonus = -Math.sin(Math.toRadians(270-degre)) * deplacementPixel;
		}else if( degre >= 270){
			yBonus = Math.sin(Math.toRadians(360-degre)) * deplacementPixel;
			xBonus = Math.cos(Math.toRadians(360-degre)) * deplacementPixel;
		}
		//met la nouvelle orientation
		//newImage.setOrientation(orientationBase+90-this.orientation);
		//deplace la miniature
		//newImage.move(xBonus,yBonus);
		
		imageBase.setOrientation(orientationBase-90+this.orientation);
		imageBase.move(xBonus, yBonus);
		
	}
	
}