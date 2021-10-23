package com.taniabilqist.modul3.percobaan;

public class KomplekPerumahan {
    public static void main(String[] args) {
        Rumah r = new Rumah(); // membuat object dari blueprint rumah
        r.setAlamat_rumah("Kesana kemari mencari alamat");
        System.out.println(r.alamat_rumah);
    }
}

