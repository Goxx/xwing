package simulator;

public class ResultFight {
	int damage;
	int damageCritical;
	
	public ResultFight(int dmg, int dmgCritical){
		damage = dmg;
		damageCritical = dmgCritical;
	}

	public int getDamage() {
		return damage;
	}

	public int getDamageCritical() {
		return damageCritical;
	}
	
	public void afficher(){
		System.out.println("Damage :" + damage);
		System.out.println("Damage CRITIC :" + damageCritical);
	}
}
