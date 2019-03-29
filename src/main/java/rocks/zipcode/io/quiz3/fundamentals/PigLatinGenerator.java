package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        if (words.length > 1) {
            for (String word : words) {
                sb
                        .append(translateWord(word))
                        .append(" ");
            }
            return sb.toString().replaceAll(" $", "");
        } else {
            return translateWord(str);
        }
    }

    private String translateWord(String str) {
        //If the word starts with a vowel,
        if (VowelUtils.startsWithVowel(str)) {
            // then return the original string with "way" appended.
            return str + "way";
        }

        //If the word has no vowels,
        if (!VowelUtils.hasVowels(str)) {
            // then return the original string plus "ay".
            return str + "ay";
        }

        //if the word starts with a consonant,
        // identify first vowel
        Integer firstVowelIndex = VowelUtils.getIndexOfFirstVowel(str);

        // then shift consonants from the beginning of the word to the end of the word until the first vowel.
        String prefix = str.substring(firstVowelIndex);
        String body = str.substring(0, firstVowelIndex);

        // Then, return the newly shifted string with "ay" appended.
        String suffix = "ay";

        return prefix + body + suffix;
    }
}