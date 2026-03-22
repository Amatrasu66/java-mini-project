package passwordgame.rules;

public class 1_MinLengthRule implements Rule {

    private static final int MIN_LENGTH = 8;

    @Override
    public boolean isSatisfied(String password) {
        return password.length() >= MIN_LENGTH;
    }

    @Override
    public String getDescription() {
        return "Password must be at least " + MIN_LENGTH + " characters long.";
    }
}