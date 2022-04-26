package com.company;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void separator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your text here: ");
        String text = scanner.nextLine(); // read input
        text = text.toLowerCase();
        text = text.trim();
        String newText = text.replace(",", "");
        //String newText = text.replaceAll("([^A-za-z])", " ");
        String[] strText = newText.split(" ");

        Arrays.sort(strText);

        int counter = 1;
        for (int i = 0; i < strText.length-1; i++) {
            for (int k = i+1; k < strText.length; k++) {
                if (strText[i].equals(strText[k])) {
                    counter = counter + 1;
                    System.out.println(strText[i] + " -  " + counter);
                    counter = 1;
                    i = i + 1;
                } // end if
            }
            System.out.println(strText[i] + " - " + counter);
        }
    }

}
