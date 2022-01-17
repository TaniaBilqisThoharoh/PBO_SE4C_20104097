package com.taniabilqist.modul3.percobaan;

public class TesTabungan {

    public static void main(String[] args) {
        Tabungan t = new Tabungan(5000);
        System.out.println("SALDO AWAL TABUNGAN ANDA = " + t.saldo);
        t.ambiluang(1500);

        System.out.println("JUMLAH UANG YANG DIAMBIL = 1500");
        System.out.println("SALDO TABUNGAN ANDA YANG SEKARANG ADALAH = " + t.saldo);


    }
}
