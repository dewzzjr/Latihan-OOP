
package oop;

import encapsulate.Hewan;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("@encapsulation");
        Hewan siSinga = new Hewan("Singa", 5);
        System.out.println( siSinga.getNama() + " berumur " + siSinga.getUmur() + " tahun");
        System.out.println( "4 tahun kemudian...");
        siSinga.setUmur(4);
        System.out.println( siSinga.getNama() + " berumur " + siSinga.getUmur() + " tahun");
        

        /**
         * Constructor juga bisa di overload lhoo..
         */
        System.out.println("@overload");
        Hewan bayiHarimau = new Hewan("Harimau");
        Hewan siHewan = new Hewan();
        
    }
}
