 package latihan4;

 public class node {
     private int nilai;
     private node node;
 
 
 
     //        inisialisasi constructor node
     public node(int nilai) {
         this.nilai = nilai;
     }
 
     public int getNilai() {
         return nilai;
     }
 
     public void setNilai(int nilai) {
         this.nilai = nilai;
     }
 
     public node getNext() {
         return node;
     }
 
     public void setNext(node next) {
         this.node = next;
     }
 }
