package pilot;

import java.util.Iterator;
import java.util.Set;

import deplacement.Mouvement;

public class Ship {
	
	String type;//X_WING, TIE_FIGHTER;
	Set<Mouvement> mouvementPossible;
	
	public Ship(){
		
	}
	public void ajouter(Mouvement newMouvement){
		mouvementPossible.add(newMouvement);
	}
	
	public Mouvement get(){
		Iterator<Mouvement> it = mouvementPossible.iterator();
		return it.next();
	}
	
}
