package latihan4;

 public class studentMain {
     public static void main(String[] args) {
         student x = new student();
         student y = x;
         x.setNrp("1");
         y.setNrp("2");
         x.show();
         student z = new student();
         z.setNrp("3");
         x = z;
         x.show();
         y.show();
     }
 
 }
