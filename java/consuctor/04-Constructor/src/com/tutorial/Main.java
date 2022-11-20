package com.tutorial;

class dino{
    String datasString;
    int dataInteger;
}

class inidino{
    String Nama;
    String NISN;

    inidino(){
        System.out.println("Ini Adalah Dino");
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        inidino dino1= new inidino();
        new inidino();
        
        // dino objekDino = new dino();
        // objekDino.datasString="Mie dino";
        // objekDino.dataInteger=1;

        // System.out.println(objekDino.datasString);
        // System.out.println(objekDino.dataInteger);

    }
}
