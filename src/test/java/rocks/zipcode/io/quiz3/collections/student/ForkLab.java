package rocks.zipcode.io.quiz3.collections.student;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.collections.Lab;
import rocks.zipcode.io.quiz3.collections.Student;
import rocks.zipcode.io.quiz3.collections.LabStatus;

/**
 * @author leon on 10/12/2018.
 * Forking a lab switches labstatus to `PENDING`
 */
public class ForkLab {
    @Test
    public void test1() {
        // given
        Lab lab = new Lab("duplicate deleter");
        Student student = new Student();
        LabStatus expected = LabStatus.valueOf("PENDING");

        // when
        student.forkLab(lab);
        LabStatus actual = student.getLabStatus(lab.getName());

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Lab lab = new Lab("learner lab");
        Student student = new Student();
        LabStatus expected = LabStatus.valueOf("PENDING");

        // when
        student.forkLab(lab);
        LabStatus actual = student.getLabStatus(lab.getName());

        // then
        Assert.assertEquals(expected, actual);
    }
}
