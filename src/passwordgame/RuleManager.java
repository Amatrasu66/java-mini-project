package passwordgame;

import java.util.ArrayList;
import java.util.List;
import passwordgame.rules.ChemicalSymbolRule;
import passwordgame.rules.DivisibleBySevenRule;
import passwordgame.rules.HasCountryRule;
import passwordgame.rules.HasMonthRule;
import passwordgame.rules.HasNumberRule;
import passwordgame.rules.HasRomanNumeralRule;
import passwordgame.rules.HasSpecialCharRule;
import passwordgame.rules.HasUppercaseRule;
import passwordgame.rules.HasWordJavaRule;
import passwordgame.rules.MinLengthRule;
import passwordgame.rules.OddLengthRule;
import passwordgame.rules.PlankLengthRule;
import passwordgame.rules.Rule;

public class RuleManager {
 
    private List<Rule> allRules;
    private List<Rule> activeRules;

    public RuleManager() {
        allRules = new ArrayList<>();
        activeRules = new ArrayList<>();
        loadRules();
        activeRules.add(allRules.get(0));
    }

    private void loadRules() {
        allRules.add(new MinLengthRule());
        allRules.add(new HasNumberRule());
        allRules.add(new HasUppercaseRule());
        allRules.add(new HasSpecialCharRule());
        allRules.add(new PlankLengthRule());
        allRules.add(new HasMonthRule());
        allRules.add(new HasRomanNumeralRule());
        allRules.add(new OddLengthRule());
        allRules.add(new HasWordJavaRule());
        allRules.add(new HasCountryRule());
        allRules.add(new DivisibleBySevenRule());
        allRules.add(new ChemicalSymbolRule());
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
                activeRules.add(allRules.get(activeRules.size()));
                System.out.println("New rule unlocked!\n");
                return false;
            } else {
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