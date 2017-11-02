
package oop;

import inheritance.Burung;
import inheritance.Hewan;
import inheritance.Ikan;

public class Main {

    public static void main(String[] args) {
        /**
         * Inheritance
         * @extends
         * Object subclass bisa dimasukkan ke superclass
         * object Ikan dimasukkan ke variable bertipe Hewan
         * object Burung dimasukkan ke variable bertipe Hewan
         * 
         */
        Hewan siHewan = new Hewan();
        Hewan siIkan = new Ikan();
        Hewan siBurung = new Burung();
        
        
        /**
         * Polimorphism
         * @Override
         * Memiliki method yang sama namun 
         * mengimplementasikan cara yang berbeda
         */
        System.out.println("@override");
        siHewan.bergerak();
        siIkan.bergerak();
        siBurung.bergerak();
        
        /**
         * @casting
         * NB: 
         * Jika memanggil method yang ada di subclass 
         * namun tidak ada di superclass akan error 
         * (coba hilangkan tanda comment untuk melihat pesan error)
         * 
         * Maka bisa diubah dengan cara Casting
         * (seperti yang sudah dipelajari di bab sebelumnya)
         */
        System.out.println("@casting");
        // siIkan.berenang();
        // siBurung.terbang();
        Ikan ikanBaru = (Ikan) siIkan;
        ikanBaru.berenang();
        
        /**
         * Polimorphism
         * @Overload
         * Memiliki nama method yang sama namun parameter berbeda
         */
        System.out.println("@overload");
        Ikan ikanPeliharaan = new Ikan();
        ikanPeliharaan.berenang();
        ikanPeliharaan.berenang("kolam");
        ikanPeliharaan.berenang("sungai", 500);
    }
    
}
