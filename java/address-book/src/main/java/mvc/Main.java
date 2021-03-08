package mvc;

import mvc.controller.PromptController;
import mvc.model.prompt.MainPrompt;
import mvc.service.PromptService;
import mvc.service.PromptServiceImpl;

import java.util.Scanner;

public class Main {

    private static final PromptService promptService = new PromptServiceImpl();
    private static final PromptController promptController = new PromptController(promptService);
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // Main Screen: shows your options
       promptController.showPrompt(MainPrompt.getInstance(), scanner);

    }
}
