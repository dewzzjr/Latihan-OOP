
package inheritance;


public class Burung extends Hewan{
    
    @Override
    public void bergerak() {
        terbang();
    }

    public void terbang() {
        System.out.println("Burung terbang");
    }
}
