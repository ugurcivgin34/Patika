
public class SafeHouse extends NormalLoca{

	public SafeHouse(Player player) {
		super(player, "G�venli Ev");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean onLocation() {
		// TODO Auto-generated method stub
		System.out.println("G�venli evdesiniz ! ");
		System.out.println("Can�n�z yenilendi !");
		this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
		return true;
	}

}
