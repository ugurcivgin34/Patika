import java.util.Random;

public abstract class BattleLoc extends Location {

	private Obstacle obstacle;
	private String award; // �d�l
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
		System.out.println("�uan buradas�n�z : " + this.getName());
		System.out
				.println("Dikkatli ol Burada ! " + obsNumver + " tane " + this.getObstacle().getName() + " ya��yor ! ");
		System.out.println("<S>ava� yada <k>a�");
		System.out.println(this.getPlayer().getInventory().isFood());

		String selectCase = input.nextLine();
		selectCase = selectCase.toUpperCase();

		if (selectCase.equals("S")) {
			if (combat(obsNumver)) {
				System.out.println(this.getName() + " B�lgesindeki d��manlar� temizlediniz ");
				if (this.getAward().equals("food") && this.getPlayer().getInventory().isFood() == false) {
					System.out.println(this.award + "kazand�n�z");
					this.getPlayer().getInventory().setFood(true);
				} else if(this.getAward().equals("water") && this.getPlayer().getInventory().isWater() == false) {
					System.out.println(this.award + "kazand�n�z");
					this.getPlayer().getInventory().setWater(true);
				} else if (this.getAward().equals("firewood") && this.getPlayer().getInventory().isFirewood() == false) {
					System.out.println(this.award + "kazand�n�z");
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
				System.out.println("�ld�n�z");
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
				System.out.println("<V>ur veya <K>a�");
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
				System.out.println("D��man� yendiniz ! ");

				System.out.println(this.getObstacle().getAward() + " para kazand�n�z ");
				System.out.println(this.getAward() + " �d�l kazand�n�z");
				this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
				System.out.println("G�ncel paran�z : " + this.getPlayer().getMoney());
			} else {
				return false;
			}
			System.out.println("------------");
		}
		return true;

	}

	public void afterHit() {
		System.out.println("Can�n�z : " + this.getPlayer().getHealth());
		System.out.println(this.getObstacle().getName() + "Can� : " + this.getObstacle().getHealth());
		System.out.println();
	}

	public void playerStats() {
		System.out.println("Oyuncu de�erleri");
		System.out.println("------------------");
		System.out.println("Sa�l�k : " + this.getPlayer().getHealth());
		System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
		System.out.println("Z�rh : " + this.getPlayer().getInventory().getArmor().getName());
		System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
		System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
		System.out.println("Para : " + this.getPlayer().getMoney());

	}

	public void obstacleStats(int i) {
		System.out.println(i + ". " + this.getObstacle().getName() + " De�erleri");
		System.out.println("----------------");
		System.out.println("Sa�l�k : " + this.getObstacle().getHealth());
		System.out.println("Hasar : " + this.getObstacle().getDamage());
		System.out.println("�d�l : " + this.getObstacle().getAward());
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
