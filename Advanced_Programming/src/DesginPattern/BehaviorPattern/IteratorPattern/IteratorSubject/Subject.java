package DesginPattern.BehaviorPattern.IteratorPattern.IteratorSubject;

public class Subject implements ISubject{
    public String[] subjects = {"PHP","JAVA","PYTHON","SALEFORCE","JAVASCRIPT"};


    @Override
    public Iterator getIterator() {

        return new SubjectIterator();
    }
    private class SubjectIterator implements Iterator{
        int index = 0;
        @Override
        public boolean hasNext() {
            if (index <subjects.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            return subjects[index++];
        }
    }
}
