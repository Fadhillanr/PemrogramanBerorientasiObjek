package latihan5;

public class gelas {
	private  String warna;
	
	public gelas(String warna) {
		this.warna = warna;
	}
	
	// Setter
	void setWarna(String warna) {
		this.warna = warna;
	}
	
	//getter
	public String getWarna() {
		return warna;
	}
	
	public void show(String namaVar) {
		System.out.println("Warna " + namaVar + " " + getWarna());
	}
}
