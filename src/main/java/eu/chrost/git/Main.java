package eu.chrost.git;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello World!");
        System.out.println("hello World World!!!!!!");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        Random rand = new Random();
        int value = rand.nextInt(100);
        System.out.println(value);

        System.out.println("New feature on master branch test");
    }


}
