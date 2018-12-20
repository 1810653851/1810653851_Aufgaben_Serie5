package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Auto> list = new ArrayList<Auto>();
        list.add(new Auto(400, Color.black));
        list.add(new Auto(100, Color.blue));
        list.add(new Auto(300, Color.red));
        list.add(new Auto(200, Color.white));

        Collections.sort(list);

        System.out.println("Sortierte autos :\n" + list);

    }
}
