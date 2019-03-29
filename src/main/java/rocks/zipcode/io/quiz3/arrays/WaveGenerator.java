package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str = str.toLowerCase();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            Character currentChar = str.charAt(i);
            if(Character.isLetter(currentChar)) {
                String currentString = StringUtils.capitalizeNthCharacter(str, i);
                list.add(currentString);
            }
        }
        return list.toArray(new String[0]);
    }
}
