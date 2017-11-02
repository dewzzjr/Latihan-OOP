
package inheritance;

public class Ikan extends Hewan {
    @Override
    public void bergerak() {
        berenang();
    }

    public void berenang() {
        System.out.println("Ikan berenang");
    }
    
    /**
     *
     * @param lokasi tempat object berenang
     */
    public void berenang(String lokasi) {
        System.out.println("Ikan berenang di " + lokasi);
    }
    
    /**
     * 
     * @param lokasi tempat object berenang
     * @param jarak sejauh berapa meter object berenang
     */
    public void berenang(String lokasi, int jarak) {
        System.out.println("Ikan berenang di " + lokasi + " sejauh " + jarak + " meter");
    }
}
