package maCode;

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Languages languages = new Languages();
    String cL = chooseLanguage(languages); // cL = choosedLanguage
    chooseDifficulty();
  }

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
    while (!isCertain(certain)) {
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

  static Boolean isCertain(String certain) {
    if (certain.toLowerCase().equals("s") || certain.toLowerCase().equals("y")) {
      return true;
    }
    return false;
  }

}