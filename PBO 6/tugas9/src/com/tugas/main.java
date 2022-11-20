package com.tugas;

class orang{
    String nama; 
    public int nyawa; 
    private int skil; 

    orang(String nama, int nyawa, int skil){
        this.nama = nama;
        this.nyawa = nyawa;
        this.skil = skil;
    }

    // default modifier access
    void display(){
        tambahnyawa(); 
        System.out.println("\nnama\t: " + this.nama);
        System.out.println("nyawa\t: " + this.nyawa);
        System.out.println("skil\t: " + this.skil); 
    }

    // public
    public void ubahnama(String namaBaru){
        this.nama = namaBaru;
    }

    // private
    private void tambahnyawa(){
        this.nyawa += 12000;
    }
}


public class main{
    public static void  main(String[] args) {
        
        orang orang1 = new orang("Teshikaaa",50000,12000);

        // default
        System.out.println(orang1.nama);
        orang1.nama = "Vindra"; 
        System.out.println(orang1.nama); 

        // public
        System.out.println(orang1.nyawa); 
        orang1.nyawa = 50000; 
        System.out.println(orang1.nyawa); 

        // methods

        // default
        orang1.display();

        // public
        orang1.ubahnama("Arya");
        orang1.display();

        
    }
}