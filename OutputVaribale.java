//Fillname OutputVariable.java
//Written by Diana Grace Batara
// BSIT NETSEC 1-2
// WRITTEN ON AUGUST 22, 2026

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String user_name;

        System.out.print("Enter your name: ");
        user_name = user_input.next();

        System.out.println("Your name is: " + user_name);
    }
}