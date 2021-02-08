package mvc.model.prompt;

import mvc.model.Selections;

public class MainPrompt implements Prompt<String> {

    private static MainPrompt instance = null;

    private MainPrompt() {

    }


    public static MainPrompt getInstance() {
        if (instance == null) {
            instance = new MainPrompt();
        }
        return instance;
    }

    @Override
    public String showPromptText() {

        return """
        Here are your options:
        %s%s%s%s%s%s
        """.formatted((Object[]) Selections.values());
    }


}
