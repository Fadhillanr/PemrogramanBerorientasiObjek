package latihan4;

 public class student {
     String nrp;
 
     public student() {
 
     }
     public void setNrp (String nrp) {
         this.nrp = nrp;
     }
 
     public String getNrp(){
         return nrp;
     }
 
     public void show(){
         System.out.println("Student index of : " + getNrp());
     }
 }