package com.company;

public abstract class Saugetier {

    public Saugetier(String name, int alter, String geschlecht){
        this.Name = name;
        this.Alter = alter;
        this.Geschlecht = geschlecht;
    }


    public abstract String printAll();

    String Name;
    int Alter;
    String Geschlecht;

    public String getName() {
        return Name;
    }

    public int getAlter() {
        return Alter;
    }

    public String getGeschlecht() {
        return Geschlecht;
    }

}
