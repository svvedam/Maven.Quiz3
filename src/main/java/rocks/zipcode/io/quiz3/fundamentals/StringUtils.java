package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] array = str.toCharArray();
        array[indexToCapitalize] = Character.toUpperCase(array[indexToCapitalize]);
        String returnString = new String(array);

        return returnString;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        char[] array = baseString.toCharArray();
        char s = array[indexOfString];
        String a = Character.toString(characterToCheckFor);
        String b = Character.toString(s);
        if(a.equals(b))
            return true;
        else
            return false;
    }

    public static String[] getAllSubStrings(String string) {
        StringBuilder sbr = new StringBuilder();
        int length = string.length();
        for (int i = 0; i < length; i++){
            for (int j = i+1; j <= length; j++){
                sbr.append(string.substring(i, j));
                sbr.append(",");
            }
        }
        String s = sbr.toString();
        //s = s.substring(1,s.length()-1);
        String[] returnStringArray = s.split(",");
        return returnStringArray;
    }

    public static Integer getNumberOfSubStrings(String input){
        StringBuilder sbr = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i++){
            for (int j = i+1; j <= length; j++){
                sbr.append(input.substring(i, j));
                sbr.append(",");
            }
        }
        String s = sbr.toString();
        s = s.substring(0,s.length()-1);
        String[] returnStringArray = s.split(",");
        return returnStringArray.length;
    }
}
