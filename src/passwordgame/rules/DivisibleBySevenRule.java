package passwordgame.rules;

public class DivisibleBySevenRule implements Rule {

    @Override
    public boolean isSatisfied(String password) {
        for (int i = 0; i < password.length() - 1; i++) {
            if (Character.isDigit(password.charAt(i)) && 
                Character.isDigit(password.charAt(i + 1))) {
                int twoDigit = Integer.parseInt(password.substring(i, i + 2));
                if (twoDigit >= 10 && twoDigit % 7 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Password must contain a 2-digit number divisible by 7 (14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98).";
    }
}