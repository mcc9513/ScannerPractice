import java.util.Scanner;

import java.util.Scanner;
public class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String text = scanner.nextLine();
        System.out.println("What is their superpower?");
        String more = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + text + ", who had the power of " + more + ".");
        System.out.println("As they grew older, " + text + " saw that the world needed them.");
        System.out.println(text + " used their ability to " + more + " to save the world.");
    }
}