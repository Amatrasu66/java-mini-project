package passwordgame.rules;

public class HasRomanNumeralRule implements Rule {

    @Override
    public boolean isSatisfied(String password) {
        return password.matches(".*[IVXLCDM].*");
    }

    @Override
    public String getDescription() {
        return "Password must contain a Roman numeral letter (I, V, X, L, C, D, M).";
    }
}