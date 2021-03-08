package mvc.controller;

import mvc.model.prompt.Prompt;
import mvc.service.PromptService;
import mvc.service.PromptServiceImpl;

import java.util.Scanner;

public class PromptController {

    private final PromptService promptService;
    public PromptController(PromptService promptService) {
        this.promptService = promptService;
    }

    // prompts should return prompts based on input
    public void showPrompt(Prompt prompt, Scanner scanner) {
        promptService.getPrompt(prompt, scanner);
    }

}
