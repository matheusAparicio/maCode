package maCode;

public class Languages {

    // Constructor.
    String cL;

    // Definitions.
    private String[] or = {"ou", "or"};
    private String[] choosedLanguage = {"A linguagem escolhida foi português. Você tem certeza?", "The choosed language was english. Are you certain?"};
    private String[] yesNo = {"(s/n): ", "(y/n): "};

    // Getters.
    String getOr(String stringIndex) {
        int index;
        index = Integer.parseInt(stringIndex) - 1;
        return or[index];
    }

    String getChoosedLanguage(String stringIndex) {
        int index;
        index = Integer.parseInt(stringIndex) - 1;
        return choosedLanguage[index];
    }

    String getYesNo(String stringIndex) {
        int index;
        index = Integer.parseInt(stringIndex) - 1;
        return yesNo[index];
    }
}
