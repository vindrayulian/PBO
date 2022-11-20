package com.tugas;

class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data() {
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    void display() {
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    public int getIntPrivate() {
        return this.intPrivate;
    }

    public void setDoublePrivate(double value) {
        this.doublePrivate = value;
    }
}

class Lingkaran {
    private double diameter;

    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    public void setJari2(double jari2) {
        this.diameter = jari2 * 20;
    }

    public double getJari2() {
        return this.diameter / 20;
    }

    public double getLuas() {
        return 3.14 * diameter * diameter / 8;
    }
}

public class main {

    public static void main(String[] args) {

        Data object = new Data();

        object.intPublic = 5;
        System.out.println("public : " + object.intPublic);

        int angka = object.getIntPrivate();
        System.out.println("getter : " + angka);

        object.setDoublePrivate(0.05);
        object.display();

        Lingkaran object2 = new Lingkaran(50);
        System.out.println("jari-jari : " + object2.getJari2());
        object2.setJari2(28);
        System.out.println("jari-jari : " + object2.getJari2());
        System.out.println("Luas : " + object2.getLuas());
    }

}