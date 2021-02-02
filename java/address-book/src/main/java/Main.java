import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // we can refer to AddressBook directly because its implementations are static
        AddressBook.addAll(
                new Entry("Bobby",
                        "John",
                        "555-555-5555",
                        "test@aol.com"),
                new Entry("Jimmy",
                        "Oak",
                        "555-555-5555",
                        "test@gmail.com"),
                new Entry("Susan",
                        "Cheeks",
                        "555-555-5555",
                        "test@icloud.com")
        );


        Scanner scanner = new Scanner(System.in);
        Prompts.makeSelection(scanner);


    }

}
