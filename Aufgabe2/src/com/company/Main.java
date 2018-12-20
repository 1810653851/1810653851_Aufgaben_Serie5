package com.company;

public class Main {

    public static void main(String[] args) {
        Mensch mensch = new Mensch("Justin", "Biber", 18);
        mensch.Status();

        mensch = new Student("Sebastian", "Kurz", 19, "135", "Mathematik");

        mensch.Status();
    }
}
