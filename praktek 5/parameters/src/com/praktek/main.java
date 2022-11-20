package com.praktek;


public class main {

    // overloading
//     static int plusMethodInt(int x, int y) {
//   return x + y;
// }

// static double plusMethodDouble(double x, double y) {
//   return x + y;
// }

// static int MinMethodInt(int x, int y){
//     return x - y;
// }

// static int KaliMethodInt(int x, int y){
//     return x * y;
// }

// static int BagiMethodInt(int x, int y){
//     return x / y;
// }

// static int SisaBagiMethodInt(int x, int y){
//     return x % y;
// }



// public static void main(String[] args) {
//   int myNum1 = plusMethodInt(10, 5);
//   double myNum2 = plusMethodDouble(10, 5);
//   int myNum3 = MinMethodInt(10, 5);
//   int myNum4 = KaliMethodInt(10, 5);
//   int myNum5 = BagiMethodInt(10, 5);
//   int myNum6 = SisaBagiMethodInt(11, 5);

//   System.out.println("Hasil Tambah Int: " + myNum1);
//   System.out.println("Hasil Tambah double: " + myNum2);
//   System.out.println("Hasil Kurang :" + myNum3);
//   System.out.println("Hasil Kali :" + myNum4);
//   System.out.println("Hasil Bagi :" + myNum5);
//   System.out.println("Hasil Sisa Bagi :" + myNum6);
// }

//   clasesobjek1
//  

// second
//   int x = 16;
//   String nama="Vindra Arya Yulian";

// atribut
//     String nama = "Vindra";
//     String namap ="Arya Yulian";
//     String jurusan = "RPL";
//     int umur = 16;

//   public static void main(String[] args) {
//     main myObj = new main();
//     System.out.println("Nama: " + myObj.nama + " " + myObj.namap);
//     System.out.println("Jurusan :" + myObj.jurusan);
//     System.out.println("Umur: " + myObj.umur);
//   }



// class metod

//  public void fullThrottle() {
//     System.out.println("Ini Adalah spesifikasi mobil baruku ");
//   }

//   // Create a speed() method and add a parameter
//   public void speed(int maxSpeed) {
//     System.out.println("Maksimal Kecepatan : " + maxSpeed + " Km");
//   }

//   public void heavy(int berat) {
//     System.out.println("berat mobil :" + berat + " Kg");
//   }

//   public void color(String warna) {
//     System.out.println("warna mobil :" + warna);
//   }  

//   // Inside main, call the methods on the myCar object
//   public static void main(String[] args) {
//     main myCar = new main();   // Create a myCar object
//     myCar.fullThrottle();      // Call the fullThrottle() method
//     myCar.speed(200);   
//     myCar.heavy(100);  
//     myCar.color(" abang");     // Call the speed() method
//   }

// public void fullThrottle() {
//     System.out.println("Ini Adalah spesifikasi mobil baruku");
//   }

//   public void speed(int maxSpeed) {
//     System.out.println("Maximal Kecepatan: " + maxSpeed + " Km");
//   }

//   public void merek(String merk) {
//     System.out.println("Merek: " + merk);
//   }


// consuktor

    int modelYear;
  String modelWarna;
  String modelmerk;

  public main(String merk, int year, String warna) {
    modelmerk = merk;
    modelYear = year;
    modelWarna = warna;
    
    
  }

  public static void main(String[] args) {
    main myCar = new main("merk : " +"kodok ", 1969, "merah");
    System.out.println(myCar.modelmerk + myCar.modelYear + " " + myCar.modelWarna);
  }
}

