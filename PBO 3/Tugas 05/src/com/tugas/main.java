package com.tugas;

//Class Objek  
class Tumbuhan{
    String Nama;
    String Jenis;
    String Tinggi;

    Tumbuhan(){
        System.out.println("Ini adalah CONSTRUCTOR TUMBUHAN");
    }

    // Constructor
    Tumbuhan (String inputNama, String inputJenis, String inputTinggi){
        Nama = inputNama;
        Jenis = inputJenis;
        Tinggi = inputTinggi;

        System.out.println(Nama);
        System.out.println(Jenis);
        System.out.println(Tinggi);
    }
}

//metodh
class moana1{
    String nama;
    String jenis;

    moana1(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }
    void ndeleng(){
        System.out.println("Nama :" + this.nama);
        System.out.println("Jenis : " + this.jenis);
    }
}
//akhir metodh


public class main {
    public static void main(String[] args) {

        // Constructor dan Objek
        Tumbuhan tumbuhan1 = new Tumbuhan();

        Tumbuhan tumbuhan2 = new Tumbuhan("Kelapa", "Buah", "7 meter");
        Tumbuhan tumbuhan3 = new Tumbuhan("Jati", "Kayu", "10 meter");

        //metodh
        moana1 bunga1 = new moana1("ANTO", "Laki laki");
        bunga1.ndeleng();
        //akhir metodh
        
        
    }
}
