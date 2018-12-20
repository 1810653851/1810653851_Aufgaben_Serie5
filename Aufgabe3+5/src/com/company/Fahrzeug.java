package com.company;

public class Fahrzeug {
    public Fahrzeug() {
        Farbe = Color.black;
        Anzahl++;
    }

    public short Reifen;
    public Color Farbe;
    public short PS;
    public short Tueren;
    public boolean Gestartet;
    public short Geschwindichkeit;
    public static int Anzahl;
    public void gestartet(){
        Gestartet = true;
    }
    public void stoppen() {
        Gestartet = false;
    }
}
