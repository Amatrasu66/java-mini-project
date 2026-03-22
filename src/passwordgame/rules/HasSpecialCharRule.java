package passwordgame.rules;

public class HasSpecialCharRule implements Rule {

    private static final String SPECIAL_CHARS = "!@#$%";

    @Override
    public boolean isSatisfied(String password) {
        for (char c : password.toCharArray()) {
            if (SPECIAL_CHARS.indexOf(c) >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Password must contain a special character: ! @ # $ %";
    }
}