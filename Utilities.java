package maCode;

public class Utilities {
    static Boolean isCertain(String certain, String cL) {
        if ((certain.toLowerCase().equals("s") && cL.equals("1"))
                || (certain.toLowerCase().equals("y") && cL.equals("2"))) {
            return true;
        }
        return false;
    }
}
