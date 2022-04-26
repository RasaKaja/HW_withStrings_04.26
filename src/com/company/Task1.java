package com.company;

import java.util.Scanner;

public class Task1 {
    Scanner scanner = new Scanner(System.in);

    String oldText = ",";
    String newText = "-MAKARENA";

    void converter() {
        System.out.println("Please, input the text, and I'll do focus pocus: ");
        String text = scanner.nextLine();
        text = text.replace(oldText, newText);
        System.out.println("Your text after focus pocus: ");
        System.out.println(text);
    }
}