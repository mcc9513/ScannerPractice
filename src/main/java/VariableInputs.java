import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String text = scanner.nextLine();
        System.out.println("Enter an integer:");
        int intinput = scanner.nextInt();
        System.out.println("Enter a double:");
        double doubleinput = scanner.nextDouble();
        System.out.println("Enter a boolean value:");
        boolean bool = scanner.nextBoolean();

        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + intinput);
        System.out.println("Your double is " + doubleinput);
        System.out.println("Your boolean is " + bool);
    }
}
