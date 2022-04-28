package com.company;

import java.util.Scanner;

public class Task3 {
    Scanner scanner = new Scanner(System.in);

    void inverter(){
        System.out.println("Please input the text");
        String text = scanner.nextLine();

        String inverter = "";

        for (int i = text.length()-1; i >= 0; i--) {
            inverter = inverter + text.charAt(i);
        }
        System.out.println(inverter);
    }

    void answer(){
        System.out.println("Please input the text");
        String text = scanner.nextLine();

        String inverse = "";

        // create loop through String from the last character and add that character to the Inverse String
        for (int i = text.length()-1; i >= 0; i--) {
            char letter = text.charAt(i);

            // convert letter char to a string and add it to inverse String
            inverse = inverse.concat(String.valueOf(letter));
        }
        System.out.println(inverse);
    }
}
