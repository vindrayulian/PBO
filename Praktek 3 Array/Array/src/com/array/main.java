package com.array;

public class main {
    public static void main(String[] args) {
        String warna1 ="Red";
        String warna2 ="Red";

        if (warna1=="Red" && warna2=="Yellow") {
            System.out.println("orange");
        }

        else if (warna1=="Yellow" && warna2=="Blue") {
            System.out.println("Green");
        }

        else if (warna1=="Blue" && warna2=="Red") {
            System.out.println("Purple");
        }

        else{
            System.out.println("Warna Tidak ditemukan");
        }
    }
}
 