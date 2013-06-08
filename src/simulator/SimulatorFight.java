package simulator;

import miniature.Miniature;

public class SimulatorFight {

	Miniature attaquant;
	Miniature defenseur;
	
	public SimulatorFight(Miniature attaquant,	Miniature defenseur){
		this.attaquant = attaquant;
		this.defenseur = defenseur;
	}
	
	public void run(){
		int nbDesAttaque = attaquant.getPilot().getPrimaryWeapon();
		int nbDesDefense = defenseur.getPilot().getAgility();
		
		DiceAttaque[] resultAtt = new DiceAttaque[nbDesAttaque];
		DiceDefense[] resultDef = new DiceDefense[nbDesDefense];
		
		for (int i = 0; i < nbDesAttaque; i++){
			double val =Math.random();
			if ( val <= 0.25){
				resultAtt[i] = DiceAttaque.FAIL;
			}else if ( val <= 0.625){
				resultAtt[i] = DiceAttaque.EYE;
			}else if ( val <= 0.875){
				resultAtt[i] = DiceAttaque.SUCESS;
			}else {
				resultAtt[i] = DiceAttaque.CRITICAL;
			}
		}
		for (int i = 0; i < nbDesAttaque; i++){
			double val =Math.random();
			if ( val <= 0.325){
				resultDef[i] = DiceDefense.FAIL;
			}else if ( val <= 0.75){
				resultDef[i] = DiceDefense.DODGE;
			}else {
				resultDef[i] = DiceDefense.EYE;
			}
		}
	}
	
	public DiceAttaque[] getResultAttaque(){
		int nbDesAttaque = attaquant.getPilot().getPrimaryWeapon();
		DiceAttaque[] resultAtt = new DiceAttaque[nbDesAttaque];
		for (int i = 0; i < nbDesAttaque; i++){
			double val =Math.random();
			if ( val <= 0.25){
				resultAtt[i] = DiceAttaque.FAIL;
			}else if ( val <= 0.5){
				resultAtt[i] = DiceAttaque.EYE;
			}else if ( val <= 0.75){
				resultAtt[i] = DiceAttaque.SUCESS;
			}else {
				resultAtt[i] = DiceAttaque.CRITICAL;
			}
		}
		return resultAtt;
	}
	
	public DiceAttaque getDiceAttaque(){
		double val =Math.random();
		if ( val <= 0.25){
			return DiceAttaque.FAIL;
		}else if ( val <= 0.5){
			return DiceAttaque.EYE;
		}else if ( val <= 0.75){
			return DiceAttaque.SUCESS;
		}else {
			return DiceAttaque.CRITICAL;
		}
	}
	
	public DiceDefense[] getResultDefense(){
		int nbDesDefense = defenseur.getPilot().getAgility();
		DiceDefense[] resultDef = new DiceDefense[nbDesDefense];
		for (int i = 0; i < nbDesDefense; i++){
			double val =Math.random();
			if ( val <= 0.5){
				resultDef[i] = DiceDefense.FAIL;
			}else if ( val <= 0.75){
				resultDef[i] = DiceDefense.EYE;
			}else {
				resultDef[i] = DiceDefense.DODGE;
			}
		}
		return resultDef;
	}
	
	public DiceDefense getDiceDefense(){
		double val =Math.random();
		if ( val <= 0.5){
			return DiceDefense.FAIL;
		}else if ( val <= 0.75){
			return DiceDefense.EYE;
		}else {
			return DiceDefense.DODGE;
		}
	}
	
	public DiceDefense[] useEvade(DiceDefense[] resultDef){
		DiceDefense[] result = new DiceDefense[resultDef.length+1];
		for (int i=0; i < resultDef.length; i++){
			result[i] = resultDef[i] ;
		}
		result[result.length] = DiceDefense.DODGE;
		return result;
	}
	
	public void useFocusDefenseur(DiceDefense[] resultDef){
		for(int i=0; i < resultDef.length; i++){
			if ( resultDef[i] == DiceDefense.EYE){
				resultDef[i] = DiceDefense.DODGE;
			}
		}
	}
	
	public void useFocusAttaquant(DiceAttaque[] resultDefAtt){
		for(int i=0; i < resultDefAtt.length; i++){
			if ( resultDefAtt[i] == DiceAttaque.EYE){
				resultDefAtt[i] = DiceAttaque.SUCESS;
			}
		}
	}
	public void useTargetLockAttaquant(DiceAttaque[] resultAtt,int[] indiceRelancer){
		for (int indice = 0; indice < indiceRelancer.length ; indice ++) {
			int nb = indiceRelancer[indice];
			resultAtt[nb] = getDiceAttaque();
		}
		
	}
	
	public ResultFight getResult(DiceAttaque[] resultAtt, DiceDefense[] resultDef){
		int damage = 0;
		int damageCritical = 0;
		// on calcul les degat 
		for ( int i = 0; i < resultAtt.length; i++){
			if ( resultAtt[i] == DiceAttaque.CRITICAL){
				damageCritical++;
			}
			if ( resultAtt[i] == DiceAttaque.SUCESS){
				damage++;
			}
		}
		// on reduit les degats
		for ( int i = 0; i < resultDef.length; i++){
			if ( resultDef[i] == DiceDefense.DODGE){
				if ( damage == 0) {
					if (damageCritical > 0 )
						damageCritical--;
				}
				else {
					damage--;
				}
			}
		}
		return new ResultFight(damage, damageCritical);
	}
	
}
