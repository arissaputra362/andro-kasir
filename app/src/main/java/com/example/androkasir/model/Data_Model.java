package com.example.androkasir.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_Model {
    @SerializedName("kode_barang")
    @Expose
    private String kode_barang;

    @SerializedName("nama_barang")
    @Expose
    private String nama_barang;

    @SerializedName("jumlah_barang")
    @Expose
    private String jumlah_barang;

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(String jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    @Override
    public String toString() {
        return "Data_Model{" +
                "kode_barang='" + kode_barang + '\'' +
                ", nama_barang='" + nama_barang + '\'' +
                ", jumlah_barang='" + jumlah_barang + '\'' +
                '}';
    }
}
