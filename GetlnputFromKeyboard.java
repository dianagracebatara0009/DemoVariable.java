//Filename GetlnputFromKeyboard.java
//Written by Diana Grace Batara
// BSIT NETSEC 1-2
// WRITTEN ON AUGUST 22, 2026

import javax.swing.JOptionPane;

public class GetInputFromKeyboard {
    public static void main(String[] args) {
        String name = "";
        name = JOptionPane.showInputDialog("Please enter your name");
        String msg = "Hello " + name + "!";

        JOptionPane.showMessageDialog(null, msg);
    }
}