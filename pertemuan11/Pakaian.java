package pertemuan11;

public class Pakaian extends Barang {
	    private String ukuran;

	    public Pakaian(String nama, double harga, String ukuran) {
	        super(nama, harga);
	        this.ukuran = ukuran;
	    }

	    @Override
	    public void pesan() {
	        System.out.println("Pakaian " + nama + " berhasil dipesan.");
	    }

	    @Override
	    public void batal() {
	        System.out.println("Pemesanan pakaian " + nama + " dibatalkan.");
	    }

	    @Override
	    public void tampilkanInfo() {
	        System.out.println("Pakaian: " + nama);
	        System.out.println("Harga: $" + harga);
	        System.out.println("Ukuran: " + ukuran);
	    }
	}
