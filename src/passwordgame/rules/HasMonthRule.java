package passwordgame.rules;

public class HasMonthRule implements Rule {

    private static final String[] MONTHS = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    @Override
    public boolean isSatisfied(String password) {
        for (String month : MONTHS) {
            if (password.contains(month)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Password must contain a month name (e.g. March, July).";
    }
}