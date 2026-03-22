package passwordgame.rules;

public class HasWordJavaRule implements Rule {

    @Override
    public boolean isSatisfied(String password) {
        return password.toLowerCase().contains("java");
    }

    @Override
    public String getDescription() {
        return "Password must contain the word 'java' (any case).";
    }
}