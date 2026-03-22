package passwordgame.rules;

public class ChemicalSymbolRule implements Rule {

    private static final String[] SYMBOLS = {
        "H", "He", "Li", "Be", "Ne", "Na", "Mg", "Al", "Si",
        "Cl", "Ar", "Ca", "Sc", "Ti", "Cr", "Mn", "Fe", "Co",
        "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr",
        "Rb", "Sr", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd",
        "Ag", "Cd", "In", "Sn", "Sb", "Te", "Xe", "Cs", "Ba",
        "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb",
        "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "Re",
        "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po",
        "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "Np", "Pu",
        "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr"
    };

    @Override
    public boolean isSatisfied(String password) {
        for (String symbol : SYMBOLS) {
            if (password.contains(symbol)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Password must contain a chemical symbol (e.g. Fe, Au, Cu, Zn).";
    }
}