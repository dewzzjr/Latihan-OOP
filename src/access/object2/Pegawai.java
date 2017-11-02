
package access.object2;

import access.object.Pegawai_public;

/**
 * Pegawai default tidak bisa diimport karena tipenya bukan public
 * NB: coba hilangkan comment untuk melihat error message
 */
// import access.object.Pegawai_default;


public class Pegawai extends Pegawai_public {
    public void accessLevelVariable() {
        /**
         * super digunakan untuk mengakses 
         * variable atau method yang ada di superclass
         * (class yang di extends)
         */
        String n = super.nama;
        int g = super.gaji;
        super.getJenisKelamin_protected();
        super.getJenisKelamin_public();
        
        /**
         * variable departemen error karena bertipe default
         * default tidak boleh diakses di beda package
         * 
         * variable jenis kelamin error karena bertipe private
         * private akan error karena tidak boleh diakses selain di class yang sama
         * NB: coba hilangkan comment untuk melihat error message
         */
        
        // String departemen = super.departemen;
        // boolean jenisKelamin = super.jenisKelamin;
        // super.getJenisKelamin_default();
        // super.getJenisKelamin_private();
    }
}
