
public class SafeHouse extends NormalLoca{

	public SafeHouse(Player player) {
		super(player, "Güvenli Ev");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean onLocation() {
		// TODO Auto-generated method stub
		System.out.println("Güvenli evdesiniz ! ");
		System.out.println("Canýnýz yenilendi !");
		this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
		return true;
	}

}
