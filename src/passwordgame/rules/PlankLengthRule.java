package passwordgame.rules;

public class PlankLengthRule implements Rule {

    private static final String PLANK_VALUE = "1.616255";

    @Override
    public boolean isSatisfied(String password) {
        return password.contains(PLANK_VALUE);
    }

    @Override
    public String getDescription() {
        return "Password must contain the Planck length value: 1.616255";
    }
}