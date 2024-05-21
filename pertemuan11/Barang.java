package pertemuan11;

import pertemuan11.InterfacePesan.Pesan;

public class Barang implements Pesan {
	    protected String nama;
	    protected double harga;

	    public Barang(String nama, double harga) {
	        this.nama = nama;
	        this.harga = harga;
	    }

	    public void tampilkanInfo() {
		}

		@Override
		public void pesan() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void batal() {
			// TODO Auto-generated method stub
			
		}
	}

