package passwordgame.rules;

public class OddLengthRule implements Rule {

    @Override
    public boolean isSatisfied(String password) {
        return password.length() % 2 != 0;
    }

    @Override
    public String getDescription() {
        return "Password length must be an odd number.";
    }
}