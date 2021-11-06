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
public class Petugas implements User{
    private ArrayList<String>namaPetugas = new ArrayList<String>();
    private ArrayList<String>alamat = new ArrayList<String>();
    private ArrayList<String>telepon = new ArrayList<String>();
    
    public Petugas(){
        this.namaPetugas.add("Rani");
        this.alamat.add("Malang");
        this.telepon.add("019918223873");
        
        this.namaPetugas.add("Nora");
        this.alamat.add("Surabaya");
        this.telepon.add("019298938732");
    }
    public int getJmlPetugas(){
        return this.namaPetugas.size();
    }
    public void setNama(String namaPetugas){
        this.namaPetugas.add(namaPetugas);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    public String getNama(int idPetugas){
        return this.namaPetugas.get(idPetugas);
    }
    public String getAlamat(int idPetugas){
        return this.alamat.get(idPetugas);
    }
    public String getTelepon(int idPetugas){
        return this.telepon.get(idPetugas);
}
}
