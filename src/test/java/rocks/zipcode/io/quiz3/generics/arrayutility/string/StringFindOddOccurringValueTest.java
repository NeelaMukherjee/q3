package rocks.zipcode.io.quiz3.generics.arrayutility.string;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.generics.ArrayUtility;

/**
 * @author leon on 09/12/2018.
 */
public class StringFindOddOccurringValueTest {
    @Test
    public void test1() {
        // given
        String expected = "Wilmington";
        String[] array = {expected, expected, expected, "Code", "Code", "Code", "Code", "Zip", "Zip"};
        ArrayUtility<String> utility = new ArrayUtility<>(array);

        // when
        String actual = utility.findOddOccurringValue();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String expected = "(-_-)";
        String[] array = {expected, expected, expected, "Code", "Code", "Code", "Code", expected, expected, "Wilmington", "Wilmington"};
        ArrayUtility<String> utility = new ArrayUtility<>(array);

        // when
        String actual = utility.findOddOccurringValue();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        String expected = "Code";
        String[] array = {"Zip", "Zip", "Zip", "Zip", "Zip", "Zip", expected, expected, expected, expected, "Wilmington", "Wilmington", expected, expected, expected};
        ArrayUtility<String> utility = new ArrayUtility<>(array);

        // when
        String actual = utility.findOddOccurringValue();
        Assert.assertEquals(expected, actual);
    }
}
