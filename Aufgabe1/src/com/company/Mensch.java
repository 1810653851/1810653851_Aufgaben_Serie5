package com.company;

public class Mensch extends Saugetier {

    public Mensch(String name, int alter, String geschlecht){
        super(name, alter, geschlecht);
    }

    public String printAll()
    {
        return String.format("#%s#%d#%s", getName(), getAlter(), getGeschlecht());
    }

}

