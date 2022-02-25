package maCode;

public class Languages {

    // Constructor.
    int cL;

    public Languages(int cl) {
        cL = cl;
    }

    // Definitions.
    private String[] OR = {"ou", "or"};
    private String[] CERTAIN = {". Você tem certeza?", ". Are you certain?"};
    private String[] CHOOSED_LANGUAGE = {"A linguagem escolhida foi português", "The choosed language was english"};
    private String[] YES_NO = {"(s/n): ", "(y/n): "};
    private String[] DIFFICULTY_CHOOSE = {"Neste projeto existem 3 atividades em ordem crescente de dificuldade.\n" + 
    "Você pode escolher em qual começar, caso queira pular alguma.\n" + 
    "Em qual você quer começar?\n" +
    "1. Fácil\n2. Médio\n3. Difícil\n" +
    "(1/2/3): ", 
    "In this project there is 3 activities in crescent order of dificulty.\n" +
    "You can choose in which one to start, in case you want to jump one of them.\n" +
    "Where do you want to begin?\n" +
    "1. Easy\n2. Average\n3. Hard\n" +
    "(1/2/3): "};
    private String[] DIFFICULTY_CHOOSED = {"A dificuldade escolhida foi ", "The choosed difficulty was "};

    // Getters.
    String getOr() {
        return OR[cL];
    }

    String getCertain() {
        return CERTAIN[cL];
    }

    String getChoosedLanguage() {
        return CHOOSED_LANGUAGE[cL];
    }

    String getYesNo() {
        return YES_NO[cL];
    }

    String getDificulty() {
        return DIFFICULTY_CHOOSE[cL];
    }

    String getDifficultyChoosed() {
        return DIFFICULTY_CHOOSED[cL];
    }

}
