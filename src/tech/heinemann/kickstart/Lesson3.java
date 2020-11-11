package tech.heinemann.kickstart;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Bitte gib dein Alter an:");
            int age = scanner.nextInt();

            if (age < 18) {
                System.out.println("Du bist zu Jung!");
            } else if (age > 25) {
                System.out.println("Du bist zu alt!");
            } else {
                System.out.println("Du bist alt genug.");
            }

        } catch (InputMismatchException exception) {
            System.out.print("Das Alter muss eine Zahl sein");
        }

        scanner.close();
    }
}
