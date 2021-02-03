package mvc.model.prompt;

import java.util.Scanner;

public abstract class Prompt {

    private String promptText;

    public void exitProgram() {
        System.exit(0);
    }

    public void returnToMainMenu() {

    }

    public abstract String showPromptText();

}
