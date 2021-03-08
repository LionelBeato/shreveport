package mvc.service;

import mvc.model.prompt.Prompt;

import java.util.Scanner;

public interface PromptService {

    // Prompts should always produce another Prompt
    void getPrompt(Prompt prompt, Scanner scanner);

}
