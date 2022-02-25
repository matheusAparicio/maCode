package maCode;

public class Languages {

    // Constructor.
    int cL;

    public Languages(int cl) {
        cL = cl;
    }

    // Definitions.
    private String[] OR = {"ou", "or"};
    private String[] CHOOSED_LANGUAGE = {"A linguagem escolhida foi português. Você tem certeza?", "The choosed language was english. Are you certain?"};
    private String[] YES_NO = {"(s/n): ", "(y/n): "};

    // Getters.
    String getOr() {
        return OR[cL];
    }

    String getChoosedLanguage(int stringIndex) {
        return CHOOSED_LANGUAGE[stringIndex];
    }

    String getYesNo(int stringIndex) {
        return YES_NO[stringIndex];
    }
}
