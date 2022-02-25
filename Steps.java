package maCode;
import java.util.Scanner;

public class Steps {

    static void chooseDifficulty() {
        // Definitions.
    
        // Update.
      }

    static String chooseLanguage(Languages languages) {
        // Definitions.
        Scanner scanner = new Scanner(System.in);
        String cL = "0";
        String certain = "n";

        // Update.
        while (!Utilities.isCertain(certain, cL)) {
            System.out.println("Choose your language.\n1: Português\n2: English");
            System.out.print("(1/2): ");
            cL = scanner.nextLine();

            System.out.println(languages.getChoosedLanguage(cL));
            System.out.print(languages.getYesNo(cL));
            certain = scanner.nextLine();
        }
        scanner.close();
        return cL;
    }
}
