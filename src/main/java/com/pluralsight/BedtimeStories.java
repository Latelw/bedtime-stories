package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        System.out.println("Enter the name of a story: ");
        System.out.println(userInput);

        String line;
        String
        try { BufferedReader buffreader = new BufferedReader(new FileReader(scanner.nextLine()));
            while (line = buffreader.readLine() != null){
                System.out.println();
            }

    } catch (Exception e) {

        }
}
