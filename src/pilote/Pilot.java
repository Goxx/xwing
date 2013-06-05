package pilote;

import java.util.ArrayList;

public class Pilot {

	private Ship ship;
	private int cost;
	private int pilotSkill;
	private int primaryWeapon;
	private int agility;
	private int hull;
	private int shield;
	private ArrayList<Action> actions;
	private ArrayList<Upgrade> upgrades;
	
	
	public Pilot(Ship ship, int cost, int pilotSkill, int primaryWeapon, int agility, int hull, int shield, ArrayList<Action> actions,
			ArrayList<Upgrade> upgrades) {
		this.ship = ship;
		this.cost = cost;
		this.pilotSkill = pilotSkill;
		this.primaryWeapon = primaryWeapon;
		this.agility = agility;
		this.hull = hull;
		this.shield = shield;
		this.actions = actions;
		this.upgrades = upgrades;
	}


	public Ship getShip() {
		return ship;
	}


	public void setShip(Ship ship) {
		this.ship = ship;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public int getPilotSkill() {
		return pilotSkill;
	}


	public void setPilotSkill(int pilotSkill) {
		this.pilotSkill = pilotSkill;
	}


	public int getPrimaryWeapon() {
		return primaryWeapon;
	}


	public void setPrimaryWeapon(int primaryWeapon) {
		this.primaryWeapon = primaryWeapon;
	}


	public int getAgility() {
		return agility;
	}


	public void setAgility(int agility) {
		this.agility = agility;
	}


	public int getHull() {
		return hull;
	}


	public void setHull(int hull) {
		this.hull = hull;
	}


	public int getShield() {
		return shield;
	}


	public void setShield(int shield) {
		this.shield = shield;
	}


	public ArrayList<Action> getActions() {
		return actions;
	}


	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}


	public ArrayList<Upgrade> getUpgrades() {
		return upgrades;
	}


	public void setUpgrades(ArrayList<Upgrade> upgrades) {
		this.upgrades = upgrades;
	}
	
}
