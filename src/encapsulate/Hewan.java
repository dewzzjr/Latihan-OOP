
package encapsulate;

public class Hewan {
    private String nama;
    private int umur;
    
    /**
     * Membuat object hewan dengan nilai default
     * nama default
     * umur 0 tahun
     */
    public Hewan () {
        nama = "default";
        umur = 0;
    }
    
    /**
     * Membuat object hewan dengan nilai default
     * umur 0 tahun
     * @param nama nama hewan
     */
    public Hewan (String nama) {
        this.nama = nama;
        umur = 0;
    }
    
    public Hewan (String nama, int umur) {
        this.nama = nama;
        this.umur =  umur;
    }

    /**
     *
     * @return mendapatkan nama hewan
     */
    public String getNama() {
        return nama;
    }

    /**
     *
     * @return mendapatkan umur hewan dalam tahun
     */
    public int getUmur() {
        return umur;
    }

    /**
     * Menambahkan dengan umur dengan nilai yang baru
     * @param umur jumlah tahun yang ditambah
     */
    public void setUmur(int umur) {
        this.umur += umur;
    }
    
    
}
