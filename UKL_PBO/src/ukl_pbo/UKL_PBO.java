/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_pbo;

/**
 *
 * @author MOKLET-2
 */
public class UKL_PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barang barang = new Barang();
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Lelang lelang = new Lelang();
        Laporan laporan = new Laporan();
       
        lelang.prosesLelang(petugas, barang, laporan);
       
        lelang.prosesPenawaran(masyarakat, barang);
    
}
}
