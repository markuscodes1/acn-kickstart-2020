package tech.heinemann.kickstart;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib deinen Name an: ");
        String name = scanner.next();


        System.out.println("Bitte gib dein Alter an:");

        try {
            int age = scanner.nextInt();

            System.out.println("Hallo, " + name);
            System.out.println("Du bist " + age + " Jahre alt.");
        } catch (InputMismatchException exception) {
            System.out.println("Das Alter muss eine Zahl sein");
        }

        scanner.close();
    }
}
