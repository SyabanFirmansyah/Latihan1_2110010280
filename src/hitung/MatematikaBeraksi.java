package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //object
        Matematika iman = new Matematika(8,0);
        
        System.out.println("Hasil penjumlahan: "+iman.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+iman.setPengurangan());
        System.out.println("Hasil perkalian: "+iman.setPerkalian());
        System.out.println("Hasil pembagian: "+iman.setPembagian());
    }
}
