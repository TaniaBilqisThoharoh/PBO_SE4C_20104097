package com.modul2.tugas;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int anak_ayam, s;

        System.out.print("Masukan Jumalah Anak Ayam : ");
        anak_ayam = scann.nextInt();
        for (s = anak_ayam; s > 1; s--){
            System.out.print("Anak Ayam Turun " + anak_ayam+ "\n");
            anak_ayam=s-1;
            System.out.println("Mati 1 Tinggal " + anak_ayam);
        }
        System.out.println("Anak Ayam Turun 1 \nMati 1 Tinggal Induknya");
    }
}
