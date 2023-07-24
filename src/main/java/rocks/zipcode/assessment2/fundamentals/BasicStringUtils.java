package rocks.zipcode.assessment2.fundamentals;

import java.util.ArrayList;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1+string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        char character;
        String  reversed="";
        for (int i=0; i<string1.length(); i++)
        {
            character= string1.charAt(i); //extracts each character
            reversed= character+reversed; //adds each character in front of the existing string
        }
        return reversed;


    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        char character;
        char character2;
        String  reversed="";
        String reversed2="";
        for (int i=0; i<string1.length(); i++)
        {
            character= string1.charAt(i); //extracts each character
            reversed= character+reversed; //adds each character in front of the existing string
        }
        for (int i=0; i<string2.length(); i++)
        {
            character2= string2.charAt(i); //extracts each character
            reversed2= character2+reversed2; //adds each character in front of the existing string
        }


        return reversed+reversed2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        char [] cahrarr= charactersToRemove.toCharArray();
        for (int i = 0; i < cahrarr.length; i++) {

            string = string.replaceAll(String.valueOf(cahrarr[i]), "");

        }

        return string;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        char [] cahrarr= charactersToRemove.toCharArray();
        for (int i = 0; i < cahrarr.length; i++) {

            string = string.replaceAll(String.valueOf(cahrarr[i]), "");

        }
        char character;
        String  reversed="";
        for (int i=0; i<string.length(); i++)
        {
            character= string.charAt(i); //extracts each character
            reversed= character+reversed; //adds each character in front of the existing string
        }
        return reversed;




    }
}
