package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private static String vowels = "aeiouAEIOU";

    public static Boolean hasVowels(String word) {
        for(Character c : vowels.toCharArray()) {
            if(word.contains(c.toString())) {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int currentIndex = 0; currentIndex < word.length(); currentIndex++) {
            Character currentChar = word.charAt(currentIndex);
            if(isVowel(currentChar)) {
                return currentIndex;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        return hasVowels(character.toString());
    }
}
