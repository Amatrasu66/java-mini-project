package src.passwordgame;

import passwordgame.rules.*;
import java.util.ArrayList;
import java.util.List;

public class RuleManager {

    private List<Rule> allRules;
    private List<Rule> activeRules;

    public RuleManager() {
        allRules = new ArrayList<>();
        activeRules = new ArrayList<>();
        loadRules();
        activeRules.add(allRules.get(0)); // Start with Rule 1 only
    }

    private void loadRules() {
        allRules.add(new MinLengthRule());   // Rule 1
        allRules.add(new HasNumberRule());   // Rule 2
        // More rules coming in Stage 3...
    }

    public boolean evaluate(String password) {
        boolean allPassed = true;

        for (Rule rule : activeRules) {
            if (!rule.isSatisfied(password)) {
                allPassed = false;
            }
        }

        ConsoleHelper.printRules(activeRules, password);

        if (allPassed && activeRules.size() < allRules.size()) {
            activeRules.add(allRules.get(activeRules.size()));
            System.out.println("🔓 New rule unlocked!\n");
        }

        return allPassed;
    }

    public boolean allRulesUnlocked() {
        return activeRules.size() == allRules.size();
    }

    public List<Rule> getActiveRules() {
        return activeRules;
    }
}