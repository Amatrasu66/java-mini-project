package src.passwordgame;

import java.util.Scanner;

public class GameEngine {

    private RuleManager ruleManager;
    private int attempts;

    public GameEngine() {
        this.ruleManager = new RuleManager();
        this.attempts = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        ConsoleHelper.printWelcome();

        while (true) {
            ConsoleHelper.printPrompt();
            String password = scanner.nextLine();
            attempts++;

            boolean allPassed = ruleManager.evaluate(password);

            if (allPassed && ruleManager.allRulesUnlocked()) {
                ConsoleHelper.printWin(attempts);
                break;
            }
        }

        scanner.close();
    }
}