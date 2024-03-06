package latihan4;

 public class lingkaran {
     int Nilai;
     public lingkaran(int Nilai) {
         this.Nilai = Nilai;
     }
 
     public int getNilai(){
         return Nilai;
     }
 
     public void setNilai(int nilai) {
         Nilai = nilai;
     }
 
     public void Show(){
         System.out.println("Nilai Lingkaran : " + getNilai());
     }
 }