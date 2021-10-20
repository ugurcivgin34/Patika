import java.util.Random;

public abstract class BattleLoc extends Location {

	private Obstacle obstacle;
	private String award; // ödül
	private int maxObstacle;

	public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
		super(player, name);
		this.obstacle = obstacle;
		this.award = award;
		this.maxObstacle = maxObstacle;

	}

	@Override
	boolean onLocation() {
		
		int obsNumver = this.randomObstacleNumber();
		System.out.println("Þuan buradasýnýz : " + this.getName());
		System.out
				.println("Dikkatli ol Burada ! " + obsNumver + " tane " + this.getObstacle().getName() + " yaþýyor ! ");
		System.out.println("<S>avaþ yada <k>aç");
		System.out.println(this.getPlayer().getInventory().isFood());

		String selectCase = input.nextLine();
		selectCase = selectCase.toUpperCase();

		if (selectCase.equals("S")) {
			if (combat(obsNumver)) {
				System.out.println(this.getName() + " Bölgesindeki düþmanlarý temizlediniz ");
				if (this.getAward().equals("food") && this.getPlayer().getInventory().isFood() == false) {
					System.out.println(this.award + "kazandýnýz");
					this.getPlayer().getInventory().setFood(true);
				} else if(this.getAward().equals("water") && this.getPlayer().getInventory().isWater() == false) {
					System.out.println(this.award + "kazandýnýz");
					this.getPlayer().getInventory().setWater(true);
				} else if (this.getAward().equals("firewood") && this.getPlayer().getInventory().isFirewood() == false) {
					System.out.println(this.award + "kazandýnýz");
					this.getPlayer().getInventory().setFirewood(true);
				}
				return true;
			}

//			if(this.getPlayer().getInventory().isFood()) {
//			return false;	
//			}
//				
//				
			if (this.getPlayer().getHealth() <= 0) {
				System.out.println("Öldünüz");
				return false;
			}
		}
		return true;
	}

	public boolean combat(int obsNumber) {

		for (int i = 1; i <= obsNumber; i++) {
			this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
			playerStats();
			obstacleStats(i);
			while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
				System.out.println("<V>ur veya <K>aç");
				String selectCombat = input.nextLine().toUpperCase();
				if (selectCombat.equals("V")) {
					System.out.println("Siz vurdunuz");
					this.obstacle.setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
					afterHit();
					if (this.getObstacle().getHealth() > 0) {
						System.out.println();
						System.out.println("Canavar size vurdu");
						int obstacleDamage = this.getObstacle().getDamage()
								- this.getPlayer().getInventory().getArmor().getBlock();
						if (obstacleDamage < 0) {
							obstacleDamage = 0;
						}
						this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
						afterHit();
					}
				} else {
					return false;
				}
			}

			if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
				System.out.println("Düþmaný yendiniz ! ");

				System.out.println(this.getObstacle().getAward() + " para kazandýnýz ");
				System.out.println(this.getAward() + " ödül kazandýnýz");
				this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
				System.out.println("Güncel paranýz : " + this.getPlayer().getMoney());
			} else {
				return false;
			}
			System.out.println("------------");
		}
		return true;

	}

	public void afterHit() {
		System.out.println("Canýnýz : " + this.getPlayer().getHealth());
		System.out.println(this.getObstacle().getName() + "Caný : " + this.getObstacle().getHealth());
		System.out.println();
	}

	public void playerStats() {
		System.out.println("Oyuncu deðerleri");
		System.out.println("------------------");
		System.out.println("Saðlýk : " + this.getPlayer().getHealth());
		System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
		System.out.println("Zýrh : " + this.getPlayer().getInventory().getArmor().getName());
		System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
		System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
		System.out.println("Para : " + this.getPlayer().getMoney());

	}

	public void obstacleStats(int i) {
		System.out.println(i + ". " + this.getObstacle().getName() + " Deðerleri");
		System.out.println("----------------");
		System.out.println("Saðlýk : " + this.getObstacle().getHealth());
		System.out.println("Hasar : " + this.getObstacle().getDamage());
		System.out.println("Ödül : " + this.getObstacle().getAward());
	}

	public int randomObstacleNumber() {
		Random r = new Random();
		return r.nextInt(this.getMaxObstacle()) + 1;
	}

	public Obstacle getObstacle() {
		return obstacle;
	}

	public void setObstacle(Obstacle obstacle) {
		this.obstacle = obstacle;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public int getMaxObstacle() {
		return maxObstacle;
	}

	public void setMaxObstacle(int maxObstacle) {
		this.maxObstacle = maxObstacle;
	}

}
