package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Gib die ersten Wert an");
        String s2 = JOptionPane.showInputDialog("Gib die zweiten Wert an");
        String s3 = JOptionPane.showInputDialog("Gib die dritten Wert an");

        List<String> l = Arrays.asList( s1, s2, s3);

        int foundSame = 1;
        for(int i = 0; i < l.size(); i++){
            if(i != l.lastIndexOf(l.get(i))) {
                foundSame++;
            }
        }
        if(foundSame > 0) {
            JOptionPane.showMessageDialog(null, "Es gibt "+foundSame+" gleiche werte");
        }else {
            JOptionPane.showMessageDialog(null, "Es keine gleichen werte ");
        }
    }
}

