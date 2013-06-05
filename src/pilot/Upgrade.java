package pilot;

public class Upgrade {
	
	private int cost;
	private UpgradeName upgradeName;
	private UpgradeType upgradeType;
	
	public Upgrade(int cost, UpgradeName upgradeName, UpgradeType upgradeType) {
		this.cost = cost;
		this.upgradeName = upgradeName;
		this.upgradeType = upgradeType;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public UpgradeName getUpgradeName() {
		return upgradeName;
	}

	public void setUpgradeName(UpgradeName upgradeName) {
		this.upgradeName = upgradeName;
	}

	public UpgradeType getUpgradeType() {
		return upgradeType;
	}

	public void setUpgradeType(UpgradeType upgradeType) {
		this.upgradeType = upgradeType;
	}
	
}
