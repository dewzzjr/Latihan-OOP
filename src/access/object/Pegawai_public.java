
package access.object;

/**
 * Class ini digunakan untuk 
 * Memperlihatkan contoh hak akses method dan variable
 * Pada class dengan hak akses public
 * 
 * Sifat public
 * Nama class dan nama file harus sama
 * Bisa diakses di package yang berbeda dengan cara import
 */
public class Pegawai_public {
    public String nama;
    protected int gaji;
    String departemen;
    private boolean jenisKelamin;
    
    /**
     * @return menampilkan Jenis Kelamin dalam String
     * @boolean jenisKelamin 
     * jika true maka laki-laki
     * jika false maka perempuan
     */
    private String getJenisKelamin_private () {
        if (jenisKelamin) {
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }
    
    protected String getJenisKelamin_protected() {
        /**
         * private bisa diakses didalam class itu sendiri
         */
        return getJenisKelamin_private();
    }
    
    public String getJenisKelamin_public() {
        /**
         * protected bisa diakses didalam class itu sendiri
         */
        return getJenisKelamin_protected();
    }
    
    String getJenisKelamin_default() {
        /**
         * public bisa diakses didalam class itu sendiri
         */
        return getJenisKelamin_public();
    }
}
