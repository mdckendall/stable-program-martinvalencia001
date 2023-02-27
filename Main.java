import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the address of the stable? ");
        String address = input.nextLine();
        Stable stable = new Stable(address);

        while (true) {
            System.out.print("Do you wish to add a horse to the stable? (y/n) ");
            String choice = input.nextLine();
            if (choice.equals("n")) {
                break;
            } else if (!choice.equals("y")) {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
                continue;
            }

            System.out.print("What is the name of the horse? ");
            String name = input.nextLine();

            double weight;
            while (true) {
                System.out.print("What is the weight of the horse? ");
                try {
                    weight = Double.parseDouble(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }

            boolean isTame;
            while (true) {
                System.out.print("Enter true if the horse is tame or false if it is not: ");
                String tameInput = input.nextLine();
                if (tameInput.equals("true")) {
                    isTame = true;
                    break;
                } else if (tameInput.equals("false")) {
                    isTame = false;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'true' or 'false'.");
                }
            }

            Horse horse = new Horse(name, weight, isTame);
            stable.addHorse(horse);
        }

        stable.printHorses();
    }
}