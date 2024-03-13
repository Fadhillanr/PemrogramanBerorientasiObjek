package latihan5;

public class gelasMain {
	public static void main(String[] args) { 
		gelas g1 = new gelas("Hitam"); 
		gelas g2 = new gelas ("Biru");


	tukarWarnagelas(g1,g2);
		g1.show("g1");
		g2.show("g2");
	}

	static void tukarWarnagelas(gelas g1, gelas g2) {
		gelas gtemp = new gelas("temp");
		gtemp.setWarna (g1.getWarna ());
		g1.setWarna(g2.getWarna());
		g2.setWarna(gtemp.getWarna());
	}
}
