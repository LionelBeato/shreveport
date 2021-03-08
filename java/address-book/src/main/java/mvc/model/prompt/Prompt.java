package mvc.model.prompt;

import java.util.Scanner;

public interface Prompt <T> {

    default void exitProgram() {
        System.out.println("Shutting down...");
        System.exit(0);
    }

    default void returnToMainMenu() {

    }

    T showPromptText();

}
