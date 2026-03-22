package passwordgame.rules;

public interface Rule {
    boolean isSatisfied(String password);
    String getDescription();
}