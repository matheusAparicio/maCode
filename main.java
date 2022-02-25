package maCode;

import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    // Definitions.
    Languages languages = new Languages();
    Scanner scanner = new Scanner(System.in);
    String certain = "n";

    // Update.
    while (!isCertain(certain)) {
      System.out.println("Choose your language.\n1: Português\n2: English");
      System.out.print("(1/2): ");
      String cL = scanner.nextLine(); // cL = choosedLanguage

      System.out.println(languages.getChoosedLanguage(cL));
      System.out.print(languages.getYesNo(cL));
      certain = scanner.nextLine();
    }
    scanner.close();
  }

  static Boolean isCertain(String certain) {
    if (certain.toLowerCase().equals("s") || certain.toLowerCase().equals("y")) {
      return true;
    }
    return false;
  }

}