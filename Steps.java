package maCode;

import java.util.Scanner;

public class Steps {

    static void chooseDifficulty(Languages language) {
        // Definitions.
        String difficulty = "0";
        Scanner scanner = new Scanner(System.in);
        String certain = "n";

        // Update.
        System.out.println(language.getDificulty());
        if (scanner.hasNextLine()) {
            difficulty = scanner.nextLine();
        }
        System.out.println(language.getDifficultyChoosed() + difficulty + language.getCertain());
        scanner.close();
    }

    static Languages chooseLanguage() {
        // Definitions.
        Languages language = new Languages(1);
        Scanner scanner = new Scanner(System.in);
        String cL = "0";
        String certain = "n";

        // Update.
        while (!Utilities.isCertain(certain, cL)) {
            System.out.println("Choose your language.\n1: Português\n2: English");
            System.out.print("(1/2): ");
            cL = scanner.nextLine();
            language = new Languages(Utilities.getLanguageIndex(cL));
            System.out.println(language.getChoosedLanguage() + language.getCertain());
            System.out.print(language.getYesNo());
            certain = scanner.nextLine();
        }
        scanner.close();
        return language;
    }
}
