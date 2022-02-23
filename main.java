package maCode;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {

      // Definitions.
      Languages languages = new Languages();
      Scanner scanner = new Scanner(System.in);

      // Update.
      System.out.println("Choose your language.\n1: Português\n2: English");
      System.out.print("1 or 2: ");
      String cL = scanner.nextLine(); // cL = choosedLanguage

      System.out.println(languages.getChoosedLanguage(cL));
      System.out.println(languages.getYesNo(cL));
      String certain = scanner.nextLine();

      scanner.close();
    }
  }