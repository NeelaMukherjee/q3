package rocks.zipcode.io.quiz3.generics.arrayutility.string;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.generics.ArrayUtility;

/**
 * @author leon on 09/12/2018.
 */
public class StringGetNumberOfOccurrencesTest {
    @Test
    public void test1() {
        // given
        Integer expected = 3;
        String stringToEvaluate = "Wilmington";
        String[] array = {stringToEvaluate, stringToEvaluate, stringToEvaluate, "Code", "Code", "Code", "Code", "Zip", "Zip"};
        ArrayUtility<String> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.getNumberOfOccurrences(stringToEvaluate);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Integer expected = 5;
        String stringToEvaluate = "(-_-)";
        String[] array = {stringToEvaluate, stringToEvaluate, stringToEvaluate, "Code", "Code", "Code", "Code", stringToEvaluate, stringToEvaluate, "Wilmington", "Wilmington"};
        ArrayUtility<String> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.getNumberOfOccurrences(stringToEvaluate);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        Integer expected = 7;
        String stringToEvaluate = "Code";
        String[] array = {"Zip", "Zip", "Zip", "Zip", "Zip", "Zip", stringToEvaluate, stringToEvaluate, stringToEvaluate, stringToEvaluate, "Wilmington", "Wilmington", stringToEvaluate, stringToEvaluate, stringToEvaluate};
        ArrayUtility<String> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.getNumberOfOccurrences(stringToEvaluate);
        Assert.assertEquals(expected, actual);
    }
}
