package mvc.model.prompt;

import java.util.Scanner;

public class PromptChoiceFive implements Prompt {

    private static PromptChoiceFive instance = null;

    static public PromptChoiceFive getInstance() {
        if (instance == null) {
            instance = new PromptChoiceFive();
        }
        return instance;
    }

    @Override
    public String showPromptText() {
        return """
                Are you sure you want to delete all contacts? (Y/n)
                """;
    }

}
