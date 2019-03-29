package rocks.zipcode.io.quiz3.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

/**
 * @author leon on 10/12/2018.
 */
public class GetNumberOfSubStrings {
    @Test
    public void test1() {
        // given
        String input = "Hello";
        Integer expected = 14;

        // when
        Integer actual = StringUtils.getNumberOfSubStrings(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String input = "The Quick Brown";
        Integer expected = 119;

        // when
        Integer actual = StringUtils.getNumberOfSubStrings(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
