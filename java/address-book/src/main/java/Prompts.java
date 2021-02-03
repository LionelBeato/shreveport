import java.util.InputMismatchException;
import java.util.Scanner;

public class Prompts {

    private static void selectionOne(Scanner scanner) {
        System.out.print("Please enter a first name: \n");
        var firstName = scanner.next();
        System.out.print("Please enter a last name: \n");
        var lastName = scanner.next();
        System.out.print("Please enter a phone number: \n");
        var phoneNumber = scanner.next();
        System.out.print("Please enter an email address: \n");
        var emailAddress = scanner.next();

        System.out.print("Attempting to add entry...\n");
        AddressBook.addEntry(new Entry(firstName, lastName, phoneNumber, emailAddress));
        scanner.nextLine();
        makeSelection(scanner);
    }


    private static void selectionFive(Scanner scanner) {
        System.out.printf("selected %s\n", Selections.FIVE);
        System.out.print("Are you sure? (Y/n)\n");
        var choice = scanner.next();

        if (choice.equalsIgnoreCase("y")) {
            AddressBook.removeAll();
            scanner.nextLine();
            makeSelection(scanner);
        } else if (choice.equalsIgnoreCase("n")) {
            scanner.nextLine();
            makeSelection(scanner);
        }

        System.out.print("please try again:\n");
        scanner.nextLine();
        selectionFive(scanner);

    }


    private static void exitSystem() {
        System.exit(0);
    }

    public static void makeSelection(Scanner scanner) {
        var options =
                """
                
                Here are your options:
                %s%s%s%s%s%s
                """.formatted((Object[]) Selections.values());

        System.out.print(options);
        System.out.print("Please make your selection:\n");

        try  {
            var selection = scanner.nextInt();
            switch (Selections.enumBySelection(selection)) {
                case ONE -> {
                    System.out.printf("selected %s\n", Selections.ONE);
                    selectionOne(scanner);
                }
                case TWO -> {
                    System.out.printf("selected %s\n", Selections.TWO);
                    System.out.print("Please enter an email:\n");
                    var email = scanner.next();
                    Entry entry = AddressBook.findEntry(email);
                    System.out.println(AddressBook.removeEntry(entry));
                    makeSelection(scanner);
                }
                case THREE -> {
                    System.out.printf("selected %s\n", Selections.THREE);
                    System.out.print("Please enter an email:\n");
                    var email = scanner.next();
                    Entry entry = AddressBook.findEntry(email);
                    System.out.println(entry);
                    makeSelection(scanner);
                }
                case FOUR -> {
                    System.out.printf("selected %s\n", Selections.FOUR);
                    AddressBook.printAll();
                    scanner.nextLine();
                    makeSelection(scanner);
                }
                case FIVE -> selectionFive(scanner);
                case SIX ->  exitSystem();
                default -> throw new InputMismatchException();
            }

        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.print("Bad selection, try again!\n");
            scanner.nextLine();
            makeSelection(scanner);
        }
    }
}
