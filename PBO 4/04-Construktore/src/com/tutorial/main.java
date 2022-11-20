package com.tutorial;

import javax.swing.InputMap;

//tidak menggunakan Construktor
// class Moana{
//     String dataString = "Film";
//     Integer dataiInteger = 1;



// }

//dengan Construktor
// class Maui{
//     String Nama;
//     String Kelas;
//     Integer Absen;

//     Maui(){
//         System.out.println("Ini di ambil dari Film Moana");
//     }
// }

class Maui1{
    String Nama;
    String Kelas;
    String Jurusan;

    Maui1 (String inputNama, String inputKelas, String inputJurusan){
        Nama = inputNama;
        Kelas = inputKelas;
        Jurusan = inputJurusan;

        System.out.println(Nama);
        System.out.println(Kelas);
        System.out.println(Jurusan);
    }
}

public class main {
    public static void main(String[] args) {

        Maui1 maui2 = new Maui1("Vindra","X RPL 1","RPL");
        Maui1 maui3 = new Maui1("Bagus","X RPL 1","RPL");


        //dengan Construktor
        // Maui maui1 = new Maui();

        // tidak menggunakan Construktor
        // System.out.println("Moana");
        // Moana objekMoana = new Moana();
        // objekMoana.dataString = "Film";
        // objekMoana.dataiInteger = 1;

        // System.out.println(objekMoana.dataString);
        // System.out.println(objekMoana.dataiInteger);
    }
}
