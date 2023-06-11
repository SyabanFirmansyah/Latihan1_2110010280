package hitung;

public class Matematika {
   //variable
   private double bil1, bil2;
   
   //construktor
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
   
   //method setPenjumlahan
   double setPenjumlahan(){
       return bil1 + bil2;
   }
   
   //method setPengurangan
   double setPengurangan(){
       return bil1 - bil2;
   }
   
   //method setPerkalian
   double setPerkalian(){
       return bil1 * bil2;
   }
   
   //method setPembagian
   double setPemabian(){
       return bil1 / bil2;
   }
}
