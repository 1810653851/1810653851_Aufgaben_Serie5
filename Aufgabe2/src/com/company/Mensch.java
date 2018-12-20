package com.company;

public class Mensch {

    public Mensch(String vorname, String nachname, int alter){
        this.Vorname = vorname;
        this.Alter = alter;
        this.Nachname = nachname;
    }

    public void Status(){
        System.out.println("Ich bin ein mensch: " + getVorname() + " " + getNachname() + " " + getAlter());
    }

    String Vorname;
    int Alter;
    String Nachname;

    public String getVorname() {
        return Vorname;
    }

    public int getAlter() {
        return Alter;
    }

    public String getNachname() {
        return Nachname;
    }
}
