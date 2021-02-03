package mvc.controller;

import mvc.model.prompt.Prompt;
import mvc.service.PromptService;
import mvc.service.PromptServiceImpl;

public class PromptController {

    private PromptService promptService = new PromptServiceImpl();

    public PromptController(PromptService promptService) {
        this.promptService = promptService;
    }


    public void showPrompt(Prompt prompt) {
        promptService.showPrompt(prompt);
    }
}
