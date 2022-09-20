package DesginPattern.BehaviorPattern.IteratorPattern.IteratorSubject;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        String [] sbj = subject.subjects;
        int length = sbj.length;
        for (int index = 0;index < length;index++){
            System.out.println(sbj[index]);
        }
    }
}
