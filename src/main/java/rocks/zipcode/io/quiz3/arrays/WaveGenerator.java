package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

        StringBuilder sbr = new StringBuilder();
        int length = str.length();
        str=str.toLowerCase();
        for (int i = 0; i < length; i++){
            char[] charArray = str.toCharArray();
            charArray[i] = Character.toUpperCase(charArray[i]);
            if((charArray[i]=='_')||(charArray[i]==' ' )||(charArray[i]=='0'||(charArray[i]=='!' ) ))
                continue;
            String returnString = new String(charArray);
                sbr.append(returnString);
                sbr.append(",");
        }
        String s = sbr.toString();
        //s = s.substring(1,s.length()-1);
        String[] returnStringArray = s.split(",");
        return returnStringArray;

      }

}

