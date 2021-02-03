package mvc.service;

import mvc.model.prompt.Prompt;

import java.util.Scanner;

public class PromptServiceImpl implements PromptService {

    @Override
    public Prompt getPrompt(Prompt prompt, Scanner scanner) {
        System.out.println(prompt.showPromptText());
        var input = scanner.next();
        return new Prompt() {
            @Override
            public String showPromptText() {
                return null;
            }
        };
    }
}
