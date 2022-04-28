package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Task2_v2 {
    public static void separator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your text here: ");

        // divide the text into the individual words
        // count number of occurance of words regardless of class

        String message = scanner.nextLine(); // read text from console

        // make string lowercase so all string will be compared regardless
        message = message.toLowerCase();
        message = message.replaceAll("\\p{Punct}","");

        // divide the text into the individual words
        // String.split: used to split strings into an array
        String [] messageArray = message.split(" ");
        Arrays.sort(messageArray);

        int counter;

        // loop over all elements in array
        for (int i = 0; i < messageArray.length; i++) {
            // condition to check if current iteration is not a duplicate
            if (messageArray[i] == null) {
                continue;
            }

            counter = 1;
             // loop over remaining elements to check if they are equal to current item, meaning the word is repeated the word is in the array
            for (int j = i+1; j < messageArray.length; j++) {
                if (messageArray[i].equals(messageArray[j])) {
                   counter++;
                    messageArray[j] = null;
                }
            }
            System.out.println(messageArray[i] + " - " + counter);
        }
    }
}
