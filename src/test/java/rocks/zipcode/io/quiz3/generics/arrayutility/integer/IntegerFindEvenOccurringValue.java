package rocks.zipcode.io.quiz3.generics.arrayutility.integer;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.generics.ArrayUtility;

/**
 * @author leon on 09/12/2018.
 */
public class IntegerFindEvenOccurringValue {
    @Test
    public void test1() {
        // given
        Integer expected = 5;
        Integer[] array = new Integer[]{1, 2, 3, 4, expected, expected};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.findEvenOccurringValue();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Integer expected = 18;
        Integer[] array = new Integer[]{1, 1, 1, 2, 2, 2, 2, 2, expected, 4, 4, 4, expected, expected, expected};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.findEvenOccurringValue();

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        Integer expected = 30;
        Integer[] array = new Integer[]{1, expected, 4, expected, expected, 10, 10, 10, expected, expected, expected};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);

        // when
        Integer actual = utility.findEvenOccurringValue();

        // then
        Assert.assertEquals(expected, actual);
    }
}
