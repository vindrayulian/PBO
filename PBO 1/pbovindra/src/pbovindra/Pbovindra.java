/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbovindra;
class Siswa {
    String nama;
    String nis;
    String alamat;
    String jurusan;
    int umur;
}


/**
 *
 * @author vindr
 */
public class Pbovindra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Siswa siswa1 = new Siswa();
        siswa1.nama = "Vindra Arya Yulian";
        siswa1.nis = "0061476103";
        siswa1.alamat = "JL.Kenanga no 17, Kel.Grendeng, Kec.Purwkerto Utara, Kab.Banyumas";
        siswa1.jurusan= "Rekayasa Perangkat Lunak";
        siswa1.umur = 15;
        
        System.out.println(siswa1.nama);
        System.out.println(siswa1.nis);
        System.out.println(siswa1.alamat);
        System.out.println(siswa1.jurusan);
        System.out.println(siswa1.umur);
        
        Siswa siswa2 = new Siswa();
        siswa2.nama = "Asshiddiqie.S.P";
        siswa2.nis = "0066592725";
        siswa2.alamat = "Gg melati 3 Rt3 Rw3 Purwosari";
        siswa2.jurusan= "Rekayasa Perangkat Lunak";
        siswa2.umur = 16;
        
        System.out.println(siswa2.nama);
        System.out.println(siswa2.nis);
        System.out.println(siswa2.alamat);
        System.out.println(siswa2.jurusan);
        System.out.println(siswa2.umur);

        // TODO code application logic here
    }
    
}
