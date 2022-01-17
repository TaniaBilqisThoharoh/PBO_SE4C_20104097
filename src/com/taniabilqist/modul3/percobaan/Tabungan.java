package com.taniabilqist.modul3.percobaan;

public class Tabungan {
    int saldo; // atribut

    Tabungan(int saldo){           // atribut
        this.saldo = saldo;       // memanggil atribut di atas
    }

    public void ambiluang(int saldo){
        this.saldo = this.saldo - saldo;


    }
}
