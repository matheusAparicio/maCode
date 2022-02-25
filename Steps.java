package maCode;
import java.util.Scanner;

public class Steps {

    static void chooseDifficulty() {
        // Definitions.
    
        // Update.
      }

    static Languages chooseLanguage() {
        // Definitions.
        Languages languages = new Languages(1);
        Scanner scanner = new Scanner(System.in);
        String cL = "0";
        String certain = "n";

        // Update.
        while (!Utilities.isCertain(certain, cL)) {
            System.out.println("Choose your language.\n1: Português\n2: English");
            System.out.print("(1/2): ");
            cL = scanner.nextLine();

            System.out.println(languages.getChoosedLanguage(Utilities.getLanguageIndex(cL)));
            System.out.print(languages.getYesNo(Utilities.getLanguageIndex(cL)));
            certain = scanner.nextLine();
        }
        scanner.close();
        languages = new Languages(Utilities.getLanguageIndex(cL));
        return languages;
    }
}
