package rocks.zipcode.io.quiz3.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

/**
 * @author leon on 10/12/2018.
 */
public class CapitalizeNthCharacter {
    @Test
    public void test1() {
        // given
        String input = "hello";
        String expected = "Hello";
        Integer indexToCapitalize = 0;

        // when
        String actual = StringUtils.capitalizeNthCharacter(input, indexToCapitalize);

        // them
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String input = "hello";
        String expected = "hEllo";
        Integer indexToCapitalize = 1;

        // when
        String actual = StringUtils.capitalizeNthCharacter(input, indexToCapitalize);

        // them
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        String input = "hello";
        String expected = "heLlo";
        Integer indexToCapitalize = 2;

        // when
        String actual = StringUtils.capitalizeNthCharacter(input, indexToCapitalize);

        // them
        Assert.assertEquals(expected, actual);
    }
}
