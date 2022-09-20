package DesginPattern.BehaviorPattern.IteratorPattern.IteratorListIterator;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    //    public String[] subjects = {"PHP","JAVA","PYTHON","SALEFORCE","JAVASCRIPT"};
    public List<String> subjects = new ArrayList<>();

    public Subject() {
        subjects.add("mm");
        subjects.add("mm");
        subjects.add("mm");

    }

    @Override
    public Iterator getIterator() {

        return new SubjectIterator();
    }

    private class SubjectIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < subjects.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return subjects.get(index);
        }
    }
}
