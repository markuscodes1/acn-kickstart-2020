package tech.heinemann.kickstart;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib deinen Name an: ");
        String name = scanner.next();


        System.out.println("Bitte gib dein Alter an:");
        int age = scanner.nextInt();


        scanner.close();

        System.out.println("Hallo, " + name);
        System.out.println("Du bist " + age + " Jahre alt.");
    }
}
