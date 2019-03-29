package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private final List<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for(Lab lab : labs) {
            if(lab.getName().equals(labName)) {
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if(getLab(labName) == null) {
            throw new UnsupportedOperationException();
        }
        getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Collections.reverse(labs);
        for(Lab lab : labs) {
            String labName = lab.getName();
            LabStatus status = lab.getStatus();
            sb
                    .append(labName)
                    .append(" > ")
                    .append(status)
                    .append("\n");
        }

        return sb.toString().replaceAll("\n$", "");
    }
}
