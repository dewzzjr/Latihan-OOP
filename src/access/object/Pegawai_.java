
package access.object;

/**
 * Class ini digunakan untuk 
 * Memperlihatkan contoh hak akses method dan variable
 * Pada class dengan hak akses default
 * 
 * Sifat default
 * Nama class dan nama file boleh beda
 * Hanya bisa diakses di satu package yang sama (tidak bisa diimport)
 */
class Pegawai_default {
    public String nama_public;
    private String nama_private;
    String nama_default;
    protected String nama_protected;
    
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
         * private bisa diakses didalam class yang sama
         */
        return getJenisKelamin_private();
    }
    
    public String getJenisKelamin_public() {
        /**
         * protected bisa diakses didalam class yang sama
         */
        return getJenisKelamin_protected();
    }
    
    String getJenisKelamin_default() {
        /**
         * public bisa diakses didalam class yang sama
         */
        return getJenisKelamin_public();
    }
}
