/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_pbo;

import java.util.ArrayList;

/**
 *
 * @author MOKLET-2
 */
public class Barang {
    private ArrayList<Integer>idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String>namaBarang = new ArrayList<String>();
    private ArrayList<Integer>hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean>status = new ArrayList<Boolean>();
    
    public Barang(){
        this.namaBarang.add("Televisi");
        this.hargaAwal.add(7000000);
        this.status.add(true);
        
        this.namaBarang.add("Handphone");
        this.hargaAwal.add(5000000);
        this.status.add(true);
        
        this.namaBarang.add("Kamera");
        this.hargaAwal.add(10000000);
        this.status.add(true);
    }
    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public void setHargaAwal(int hargaAwal){
        this.hargaAwal.add(hargaAwal);
    }
    public void setStatus(int idBarang, Boolean status){
        this.status.add(status);
    }
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    public int getHargaAwal(int idBarang){
        return this.hargaAwal.get(idBarang);
    }
    public boolean getStatus(int idBarang){
        return this.status.get(idBarang);
    }
    public void editStatus(int idBarang, Boolean status ){
        this.status.set(idBarang, status);
}
}
