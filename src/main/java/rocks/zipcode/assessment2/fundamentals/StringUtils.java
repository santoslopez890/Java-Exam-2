package rocks.zipcode.assessment2.fundamentals;


import java.util.regex.Pattern;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        char ch=' ';
        String result=String.format("%"+amountOfPadding+"s",stringToBePadded).replace(' ',ch);
        return result;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        char ch=' ';
        String result=String.format("%" + (-amountOfPadding) + "s", stringToBePadded).replace(' ',ch);
        return result;
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String expected = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            expected += String.valueOf(stringToBeRepeated);

        }
        return expected;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        string = string.replaceAll(" ", (""));
        return string.matches("[a-zA-Z0-9]*");

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        if (string == null) {
            return false;
        }
        return pattern.matcher(string).matches();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))
                    && !Character.isLetter(string.charAt(i))
                    && !Character.isWhitespace(string.charAt(i))) {

                return true;
            }
        }
        return false;
    }
}
