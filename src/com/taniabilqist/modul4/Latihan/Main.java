package com.taniabilqist.modul4.Latihan;

public class Main {

    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Barca",50410420,1000000,12345);
        System.out.println("Nama\t\t : " + saya.getNama());
        System.out.println("noRekening\t : " + saya.getNoRekening());
        System.out.println("saldo\t\t : " + saya.getSaldo());
        System.out.println("pin\t\t : " + saya.getPin());
    }
}
