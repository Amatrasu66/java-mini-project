package passwordgame;

import java.util.List;
import passwordgame.rules.Rule;

public class ConsoleHelper {

    public static void printWelcome() {
        System.out.println("=============================");
        System.out.println("   Welcome to Password Game  ");
        System.out.println("=============================");
        System.out.println("Create a password that satisfies all the rules.");
        System.out.println("New rules unlock as you satisfy existing ones!\n");
    }

    public static void printRules(List<Rule> rules, String password) {
        System.out.println("\n--- Active Rules ---");
        for (int i = 0; i < rules.size(); i++) {
            boolean passed = rules.get(i).isSatisfied(password);
            String status = passed ? "[PASS]" : "[FAIL]";
            System.out.println(status + " Rule " + (i + 1) + ": " + rules.get(i).getDescription());
        }
        System.out.println("--------------------");
    }

    public static void printWin(int attempts) {
        System.out.println("\n🏆 YOU WIN! You satisfied all 15 rules!");
        System.out.println("Total attempts: " + attempts);
    }

    public static void printPrompt() {
        System.out.print("\nEnter your password: ");
    }
}