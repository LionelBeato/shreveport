package mvc.model.prompt;

import mvc.model.Selections;

public class MainPrompt extends Prompt {



    public String showPromptText() {

        var options =
                """
                
                Here are your options:
                %s%s%s%s%s%s
                """.formatted((Object[]) Selections.values());

        return options;
    }
}
