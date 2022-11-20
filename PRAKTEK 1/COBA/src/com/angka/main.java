package com.angka;

public class main {
    public static void main(String[] args) {
        String cetak="";
        int x;
            for (x=1;x<=5;x++) {
                if (x==10)
                    continue;
                    cetak=cetak+x+"";
            }
            System.out.println(cetak);
    }
}
