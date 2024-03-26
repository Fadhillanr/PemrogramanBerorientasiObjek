package latihan7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

	public class TranskripNilai {
		private Date tglCetak;
		private double ipk = 0.0;
		private List<KartuHasilStudi>kartuHasilStudi;
		private Mahasiswa mahasiswa;
		
		public TranskripNilai(Mahasiswa mahasiswa) {
			super();
			this.mahasiswa = mahasiswa;
			kartuHasilStudi = new ArrayList<KartuHasilStudi>();
			tglCetak = new Date();
		}
		public void hitungIPK() {
		    double totalIpk = 0.0;
		    int totalSemester = 0;

		    for (KartuHasilStudi khs : kartuHasilStudi) {
		        khs.hitungIPS(); // Hitung IPS untuk setiap KHS
		        totalIpk += khs.getIps(); // Tambahkan IPS ke total IPK
		        totalSemester++; // Tambahkan jumlah semester
		    }

		    if (totalSemester > 0) {
		        ipk = totalIpk / totalSemester; // Hitung IPK
		    } else {
		        ipk = 0.0; // Jika tidak ada semester, maka IPK dianggap 0
		    }
		}

		public void addKHS(KartuHasilStudi khs) {
			kartuHasilStudi.add(khs);
		}
		public void display() {
			System.out.println(mahasiswa.display());
			System.out.println("Tanggal Cetak: "+ tglCetak.toString());
			System.out.println("IPK: "+ ipk);
			for(KartuHasilStudi khs: kartuHasilStudi) {
				System.out.println(khs.display());
			}
		}
		//Setter getter
		public Date getTglCetak() {
			return tglCetak;
		}
		public void setTglCetak(Date tglCetak) {
			this.tglCetak = tglCetak;
		}
		public double getIpk() {
			return ipk;
		}
		public void setIpk(double ipk) {
			this.ipk = ipk;
		}
		public List<KartuHasilStudi> getKartuHasilStudi() {
			return kartuHasilStudi;
		}
		public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
			this.kartuHasilStudi = kartuHasilStudi;
		}
		public Mahasiswa getMahasiswa() {
			return mahasiswa;
		}
		public void setMahasiswa(Mahasiswa mahasiswa) {
			this.mahasiswa = mahasiswa;
		}
}
