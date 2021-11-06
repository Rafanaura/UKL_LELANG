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
public class Laporan {
    
     public void laporan(Petugas petugas){
        int a= petugas.getJmlPetugas();
        System.out.println(" ");
        System.out.println("====== Tabel Petugas =====");
        System.out.println("Nama \tAlamat  \t\tTelepon");
        for(int i=0;i<a;i++){
            System.out.println(petugas.getNama(i)+"\t"
                    +petugas.getAlamat(i)+"\t"+petugas.getTelepon(i));
         }
           System.out.println(" ");
    }
    public void laporan(Barang barang) {
        int a = barang.getJmlBarang();

        System.out.println(" ");
        System.out.println("===== Tabel Barang =====");
        System.out.println("ID Nama Barang \tHarga \t\tStatus ");
        for (int i = 0; i < a; i++) {
             System.out.println(i +".\t" + barang.getNamaBarang(i) + ".\t" + "\t" + "Rp." + barang.getHargaAwal(i) + ".\t" + "\t" + barang.getStatus(i));
        }
    }
   
    public void laporan(Masyarakat masyarakat){
        int a= masyarakat.getJmlMasyarakat();
        
        System.out.println(" ");
        System.out.println("Tabel Masyarakat");
        System.out.println(" ");
        System.out.println("Nama \tAlamat \t\tTelepon");
        for(int i=0;i<a;i++){
            System.out.println(masyarakat.getNama(i)+ "\t"+masyarakat.getAlamat(i)+"\t"+masyarakat.getTelepon(i));
        }
        System.out.println("\n");
    }
    
}
