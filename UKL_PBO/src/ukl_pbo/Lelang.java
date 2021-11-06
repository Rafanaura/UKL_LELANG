/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_pbo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static ukl_pbo.Lelang.inputIdBarang;

/**
 *
 * @author MOKLET-2
 */
public class Lelang {

    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();

    public Lelang() {
        this.idPenawar.add(0);
        this.idBarang.add(0);
        this.hargaTawar.add(2);

    }

    static int inputIdBarang;

    public void prosesLelang(Petugas petugas, Barang barang, Laporan laporan) {
        Scanner object = new Scanner(System.in);

        System.out.println("========== Login Petugas ==========");
        System.out.println(" ");
        laporan.laporan(petugas);
        System.out.print("Masukkan ID Petugas : ");
        int idPetugas = object.nextInt();
        System.out.println("Selamat datang, " + petugas.getNama(idPetugas) + " ! ");
        System.out.println(" ");
        
        laporan.laporan(barang);
      

    }

    static int idMasy;
    static String namaPemenang = " ";

    public void prosesPenawaran(Masyarakat masyarakat, Barang barang) {
        Scanner object = new Scanner(System.in);
        System.out.println(" ");
        if (barang.getStatus(inputIdBarang) == true) {
            System.out.println("====== Silahkan melakukan penawaran barang ! ======");
            int temp = 0;
            int i = 0;

            do {
                System.out.print("Masukkan ID Masyarakat : ");
                idMasy = object.nextInt();

                do {
                    System.out.print("Masukkan kode barang : ");
                    temp = object.nextInt();
                    if (temp == 99) {
                        continue;
                    } else {
                        inputIdBarang = temp;
                       
                    }

                    if (temp != 99) {
                        idBarang.add(temp);
                        System.out.print(barang.getNamaBarang(idBarang.get(i))
                                + " Harga Tawar : Rp.");
                        int inputHargaTawar = object.nextInt();
                        if (inputHargaTawar < Collections.max(this.hargaTawar)) {
                            continue;
                        } else {
                            namaPemenang = masyarakat.getNama(idMasy);
                            this.hargaTawar.add(inputHargaTawar);
                        }
                        i++;
                    }
                } while (temp != 99);
                System.out.print("\nLanjutkan atau matikan 1 / 99 ?   : ");

                temp = object.nextInt();
            } while (temp != 99);
            System.out.println("Barang sudah tidak dapat dilelang");
           
            barang.editStatus(inputIdBarang, false);
             System.out.println("Status barang saat ini          : " + barang.getStatus(i));
              
            int total = 0;
            int x = idBarang.size();
            System.out.println("\n =========TABEL PEMENANG LELANG BARANG=========");
            System.out.println("Barang yang dilelang               : " + barang.getNamaBarang(inputIdBarang));
            System.out.println("Nama pemenang                      : " + namaPemenang);
            System.out.println("Harga Awal                         : Rp." + barang.getHargaAwal(inputIdBarang));
            System.out.println("Harga tertinggi                    : Rp." + Collections.max(this.hargaTawar));

            
        } else if (barang.getStatus(inputIdBarang) == false) {
            System.out.println("Barang tidak dapat ditawar");
        }
    }

    public void setIdPenawar(int idPenawar) {
        this.idPenawar.add(idPenawar);
    }

    public void setidBarang(int idBarang) {
        this.idBarang.add(idBarang);
    }

    public void setHargaTawar(int idPenawar, int hargaTawar) {
        this.hargaTawar.add(hargaTawar);
    }

    public int getBanyaknya(int id) {
        return this.hargaTawar.get(id);
    }

    public int getidPenawar(int id) {
        return this.idPenawar.get(id);
    }

    public int getJmlLelang() {
        return this.idPenawar.size();
    }

    public int getHargaTawar(int idBarang) {
        return this.hargaTawar.get(idBarang);
    }
}
