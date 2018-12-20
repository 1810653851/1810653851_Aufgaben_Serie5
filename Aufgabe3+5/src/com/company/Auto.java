package com.company;

public class Auto extends Fahrzeug implements Comparable<Auto>{
    public boolean Klimaanlage;
    public boolean Airbags;
    public Auto() {
        super();
    }

    public Auto(int ps, Color farbe){
        this.PS = (short)ps;
        this.Farbe = farbe;
    }


    @Override
    public String toString() {
        return "PS: " + this.PS + " Farbe: " + this.Farbe.toString();
    }

    @Override
    public int compareTo(Auto o) {
        return this.PS - o.PS;
    }
}
