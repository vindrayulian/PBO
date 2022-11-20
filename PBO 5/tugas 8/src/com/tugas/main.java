package com.tugas;

class lagu{
    String judul;
    String penyanyi;

    lagu(String judul, String penyanyi){
        this.judul = judul;
        this.penyanyi = penyanyi;
    }

    void display(){
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("penyanyi\t: " + this.penyanyi);
    }
}


public class main{
    public static void main(String[] args) {
        lagu lagu1 = new lagu("Negeri di awan", "Virgoun");
        lagu1.display();

        // Menampilkan address
        String addresslagu1 = Integer.toHexString(System.identityHashCode(lagu1));
        System.out.println(addresslagu1);
        
        // assignment object
        lagu lagu2 = lagu1;
        lagu2.display();
        String addresslagu2 = Integer.toHexString(System.identityHashCode(lagu2));
        System.out.println(addresslagu2);

        // karena lagu1 dan lagu2 berada pada address atau referensi yang sama 
        lagu2.judul = "Surat cinta untuk Starla";
        lagu1.display();
        lagu2.display();

        // kita akan memasukan object kedalam methods
        fungsi(lagu2);
        lagu1.display();
        lagu2.display();
    }

    public static void fungsi(lagu datalagu){
        String addressDatalagu = Integer.toHexString(System.identityHashCode(datalagu));
        System.out.println("address dalam fungsi " + addressDatalagu);
        datalagu.penyanyi = "Virgoun";
    }
}