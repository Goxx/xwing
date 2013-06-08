package pilot;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import deplacement.Mouvement;


public class Ship {
	
	ShipName name;
	Set<Mouvement> mouvementPossible;
	
	// petit virage  +/- 45° 22 degre || +3.5 / +2.5 / +1.5 ( taille vaisseau ) 
	// grand virage  +/- 90° 45 degre || +3.25 / +2.25 / +1.25 ( taille vaisseau )
	
	
	public Ship(ShipName name){
		this.name = name;
		
		mouvementPossible = new HashSet<Mouvement>();
		switch ( this.name ){
		case TIE_FIGHTER :
			//ajouter(new Mouvement("virage1G", 1.5, 135, 112,0));
			//ajouter(new Mouvement("virage1D", 1.5, 45, 72,0));
			ajouter(new Mouvement("virage2G", 2.5, 135, 112,0));
			ajouter(new Mouvement("virage2D", 2.5, 45, 72,0));
			ajouter(new Mouvement("virage3G", 3.5, 135, 112,0));
			ajouter(new Mouvement("virage3D", 3.5, 45, 72,0));
			
			ajouter(new Mouvement("grosVirage1G", 1.25, 180, 135,0));
			ajouter(new Mouvement("grosVirage1D", 1.25, 0, 45,0));
			ajouter(new Mouvement("grosVirage2G", 2.25, 180, 135,0));
			ajouter(new Mouvement("grosVirage2D", 2.25, 0, 45,0));
			ajouter(new Mouvement("grosVirage3G", 3.25, 180, 135,0));
			ajouter(new Mouvement("grosVirage3D", 3.25, 0, 45,0));
			
			//ajouter(new Mouvement("avancer1", 1, 90, 90,0));
			ajouter(new Mouvement("avancer2", 2, 90, 90,0));
			ajouter(new Mouvement("avancer3", 3, 90, 90,0));
			ajouter(new Mouvement("avancer4", 4, 90, 90,0));
			ajouter(new Mouvement("avancer5", 5, 90, 90,0));
			
			ajouter(new Mouvement("demiTour3", 3, 270, 90,0));
			ajouter(new Mouvement("demiTour4", 4, 270, 90,0));
			
			break;
		case X_WING:
			ajouter(new Mouvement("virage1G", 1.5, 135, 112,0));
			ajouter(new Mouvement("virage1D", 1.5, 45, 72,0));
			ajouter(new Mouvement("virage2G", 2.5, 135, 112,0));
			ajouter(new Mouvement("virage2D", 2.5, 45, 72,0));
			ajouter(new Mouvement("virage3G", 3.5, 135, 112,0));
			ajouter(new Mouvement("virage3D", 3.5, 45, 72,0));
			
			//ajouter(new Mouvement("grosVirage1G", 1.25, 180, 135,0));
			//ajouter(new Mouvement("grosVirage1D", 1.25, 0, 45,0));
			ajouter(new Mouvement("grosVirage2G", 2.25, 180, 135,0));
			ajouter(new Mouvement("grosVirage2D", 2.25, 0, 45,0));
			ajouter(new Mouvement("grosVirage3G", 3.25, 180, 135,0));
			ajouter(new Mouvement("grosVirage3D", 3.25, 0, 45,0));
			
			ajouter(new Mouvement("avancer1", 1, 90, 90,0));
			ajouter(new Mouvement("avancer2", 2, 90, 90,0));
			ajouter(new Mouvement("avancer3", 3, 90, 90,0));
			ajouter(new Mouvement("avancer4", 4, 90, 90,0));
			//ajouter(new Mouvement("avancer5", 5, 90, 90,0));
			
			//ajouter(new Mouvement("demiTour3", 3, 270, 90,0));
			ajouter(new Mouvement("demiTour4", 4, 270, 90,0));
			
			
			break;
		}
	}
	
	public void ajouter(Mouvement newMouvement){
		mouvementPossible.add(newMouvement);
	}
	
	public Iterator<Mouvement> getListeMouvement(){
		return mouvementPossible.iterator();
	}
	
}
