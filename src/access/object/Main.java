
package access.object;

/**
 *
 * Untuk memeperlihatkan bahwa bisa diakses oleh package yang sama
 */
public class Main {
    public static void main(String[] args) {
        Pegawai_public a = new Pegawai_public();
        Pegawai_default b = new Pegawai_default();
        
        a.getJenisKelamin_default();
        a.getJenisKelamin_protected();  
        a.getJenisKelamin_public();
        
        /**
         * private akan error karena tidak boleh diakses selain di class yang sama
         * NB: coba hilangkan comment untuk melihat error message
         */
        
        // a.getJenisKelamin_private();
        
        String nama1 = b.nama_public;
        String nama2 = b.nama_default;
        String nama3 = b.nama_protected;
        
        
        /**
         * private akan error karena tidak boleh diakses selain di class yang sama
         * NB: coba hilangkan comment untuk melihat error message
         */
        
        // String nama4 = b.nama_private;
        
    }
    
}
