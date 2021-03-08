package mvc.service;

import mvc.model.Selections;
import mvc.model.entry.AddressBook;
import mvc.model.prompt.*;

import java.util.Scanner;

public class PromptServiceImpl implements PromptService {

    @Override
    public void getPrompt(Prompt prompt, Scanner scanner) {
        System.out.println(prompt.showPromptText());
        var input = scanner.nextInt();
        switch (Selections.enumBySelection(input)) {
            case FOUR -> {
                System.out.println(PromptChoiceFour
                                                .getInstance()
                                                .showPromptText());
                getPrompt(prompt, scanner);
            }
            case ONE -> System.out.println("not implemented!");
            case TWO ->
            case FIVE -> {
                System.out.println(PromptChoiceFive.getInstance().showPromptText());
                var choice = scanner.next();
                if (choice.equalsIgnoreCase("Y")){
                    AddressBook.getInstance()
                            .getEntryList()
                            .clear();
                    System.out.println("Contacts deleted. Address Book cleared.\nReturning to the main menu...");
                } else {
                    scanner.nextLine();
                    getPrompt(prompt, scanner);
                }
            }
            case SIX -> prompt.exitProgram();
        }
        scanner.nextLine();
        getPrompt(prompt, scanner);
    }
}
