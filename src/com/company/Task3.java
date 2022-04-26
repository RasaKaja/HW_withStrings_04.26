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
}
