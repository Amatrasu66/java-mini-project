package passwordgame.rules;

public class HasNumberRule implements Rule {

    @Override
    public boolean isSatisfied(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Password must contain at least one number.";
    }
}