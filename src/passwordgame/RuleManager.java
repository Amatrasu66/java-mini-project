package passwordgame;

import java.util.ArrayList;
import java.util.List;
import passwordgame.rules.*;

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
    allRules.add(new MinLengthRule());         // Rule 1
    allRules.add(new HasNumberRule());         // Rule 2
    allRules.add(new HasUppercaseRule());      // Rule 3
    allRules.add(new HasSpecialCharRule());    // Rule 4
    allRules.add(new PlankLengthRule());       // Rule 5
    allRules.add(new HasMonthRule());          // Rule 6
    allRules.add(new HasRomanNumeralRule());   // Rule 7
    allRules.add(new OddLengthRule());         // Rule 8
    allRules.add(new HasWordJavaRule());       // Rule 9
    allRules.add(new HasCountryRule());        // Rule 10
    allRules.add(new DivisibleBySevenRule());  // Rule 11
    allRules.add(new ChemicalSymbolRule());    // Rule 12
    // Rules 13-15 coming in Stage 4
}
    public boolean evaluate(String password) {
    boolean allPassed = true;

    for (Rule rule : activeRules) {
        if (!rule.isSatisfied(password)) {
            allPassed = false;
        }
    }

    ConsoleHelper.printRules(activeRules, password);

    if (allPassed) {
        if (activeRules.size() < allRules.size()) {
            // More rules to unlock — add next rule and continue
            activeRules.add(allRules.get(activeRules.size()));
            System.out.println("New rule unlocked!\n");
            return false; // ← don't let GameEngine think we won yet
        } else {
            // All rules are active AND all passed → real win!
            return true;
        }
    }

    return false;
}

    public boolean allRulesUnlocked() {
        return activeRules.size() == allRules.size();
    }

    public List<Rule> getActiveRules() {
        return activeRules;
    }
}