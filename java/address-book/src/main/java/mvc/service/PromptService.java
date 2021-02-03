package mvc.service;

import mvc.model.prompt.Prompt;

import java.util.Scanner;

public interface PromptService {

    Prompt getPrompt(Prompt prompt, Scanner scanner);

}
