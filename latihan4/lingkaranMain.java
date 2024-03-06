package latihan4;

 public class lingkaranMain {
     public static void main(String[] args) {
         lingkaran lingkaran1 = new lingkaran(5);
         lingkaran lingkaran2 = lingkaran1;
         lingkaran lingkaran3 = new lingkaran(7);
         lingkaran1.Show();
         lingkaran2.Show();
         lingkaran3.Show();
         lingkaran2.setNilai(8);
         lingkaran1.Show();
         lingkaran2.Show();
         lingkaran3.Show();
         lingkaran2 = lingkaran3;
         lingkaran1.Show();
         lingkaran2.Show();
         lingkaran3.Show();
         lingkaran2 = null;
         lingkaran1.Show();
         if(lingkaran2 != null) lingkaran2.Show();
         lingkaran3.Show();
         ubahNilai(lingkaran1);
         lingkaran1.Show();
     }
 
     public static void ubahNilai(lingkaran obj) {
         obj.setNilai(100);
     }
 }