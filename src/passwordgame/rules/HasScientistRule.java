package passwordgame.rules;

public class HasScientistRule implements Rule {

    private static final String[] SCIENTISTS = {
        "Newton", "Darwin", "Einstein", "Curie", "Galileo",
        "Tesla", "Faraday", "Kepler", "Bohr", "Planck",
        "Hawking", "Turing", "Pasteur", "Mendel", "Hubble",
        "Feynman", "Heisenberg", "Schrodinger", "Lovelace", "Noether"
    };

    @Override
    public boolean isSatisfied(String password) {
        for (String scientist : SCIENTISTS) {
            if (password.contains(scientist)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Password must contain a famous scientist name (e.g. Newton, Curie, Tesla, Turing).";
    }
}