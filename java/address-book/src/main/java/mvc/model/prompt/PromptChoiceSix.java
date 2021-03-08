package mvc.model.prompt;

public class PromptChoiceSix implements Prompt {

    private static PromptChoiceSix instance = null;

    public static PromptChoiceSix getInstance() {
        if (instance == null) {
            instance = new PromptChoiceSix();
        }
        return instance;
    }


    @Override
    public String showPromptText() {
        return "Shutting down...";
    }
}
