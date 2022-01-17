package com.taniabilqist.modul4.Latihan;

public class MainTabungan {

    public static void main(String[] args) {
        Tabungan tania = new Tabungan("Barca", 123456);
        Tabungan bilqis = new Tabungan("Manu", 12467, 15000, 22222);


        tania.setSaldo(10000); // digunakan mengisi nilai tanpa mengembalikan nilai
        tania.setPin(11111); //


        System.out.println("Saldo awal Tania " + tania.getSaldo());
        System.out.println("Saldo awal Bilqis " + bilqis.getSaldo());
        System.out.println("Nomor pin Tania " + tania.getPin());
        System.out.println("Nomor pin Bilqis " + bilqis.getPin());
    }

}

