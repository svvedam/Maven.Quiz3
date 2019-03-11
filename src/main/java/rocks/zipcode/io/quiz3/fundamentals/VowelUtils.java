package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        String vowels = "aeiou";
        String loweredWord = word.toLowerCase();
        for (int index = 0; index < loweredWord.length(); index++)
        {
            if (vowels.contains(String.valueOf(loweredWord.charAt(index))))
            {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String vowels = "aeiou";
        String loweredWord = word.toLowerCase();
        for (int index = 0; index < loweredWord.length(); index++)
        {
            if (vowels.contains(String.valueOf(loweredWord.charAt(index))))
            {
                return index;
            }
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        String vowels = "aeiou";
        String loweredWord = word.toLowerCase();
        if (vowels.contains(String.valueOf(loweredWord.charAt(0))))
            return true;
        else
            return false;
    }

    public static Boolean isVowel(Character character) {
        String vowels = "aeiou";
        String loweredWord = String.valueOf(Character.toLowerCase(character));
        if (vowels.contains(loweredWord))
            return true;
        else
            return false;
    }
}
