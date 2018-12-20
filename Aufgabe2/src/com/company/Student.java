package com.company;

public class Student extends Mensch {

    public String Matrikelnummer;

    public String Studiengang;


    public Student(String vorname, String nachname, int alter, String matrikelnummer, String studiengang) {
        super(vorname, nachname, alter);
        Matrikelnummer = matrikelnummer;
        Studiengang = studiengang;
    }

    @Override
    public void Status(){
        System.out.println("Ich bin ein student: " + getVorname() + " " + getNachname() + " " + getAlter());

    }
}
