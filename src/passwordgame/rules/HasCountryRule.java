package passwordgame.rules;

public class HasCountryRule implements Rule {

    private static final String[] COUNTRIES = {
        "Afghanistan", "Albania", "Algeria", "Argentina", "Australia",
        "Austria", "Bangladesh", "Belgium", "Brazil", "Canada",
        "Chad", "Chile", "China", "Colombia", "Cuba", "Denmark",
        "Egypt", "Ethiopia", "Finland", "France", "Germany", "Ghana",
        "Greece", "Hungary", "India", "Indonesia", "Iran", "Iraq",
        "Ireland", "Israel", "Italy", "Japan", "Jordan", "Kenya",
        "Kuwait", "Libya", "Malaysia", "Mexico", "Morocco", "Nepal",
        "Netherlands", "Nigeria", "Norway", "Oman", "Pakistan", "Peru",
        "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia",
        "Rwanda", "SaudiArabia", "Serbia", "Singapore", "Somalia", "Spain",
        "Sudan", "Sweden", "Switzerland", "Syria", "Thailand", "Tunisia",
        "Turkey", "Uganda", "Ukraine", "UAE", "UK", "USA",
        "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"
    };

    @Override
    public boolean isSatisfied(String password) {
        for (String country : COUNTRIES) {
            if (password.contains(country)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Password must contain a country name (e.g. India, Cuba, Oman).";
    }
}