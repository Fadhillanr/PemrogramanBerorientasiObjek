package latihan7;

public class Mahasiswa {
	private String NRP;
	private String Nama;
	
	public Mahasiswa() {
	
	}
	
	public Mahasiswa(String nRP, String nama) {
		super();
		NRP = nRP;
		this.Nama = nama;
	}
	
	public String display() {
		return "NRP: "+ NRP+ ", Nama: "+ Nama;
	}
	
	// SETTER & GETTER
		public String getNRP() {
			return NRP;
		}
		public void setNRP(String NRP) {
			this.NRP = NRP;
		}
		public String getNama() {
			return Nama;
		}
		public void setNama(String nama) {
			this.Nama=nama;
		}	
}