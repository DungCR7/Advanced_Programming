package DesginPattern.BehaviorPattern.IteratorPattern.IteratorListIterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        List<String> sbj = subject.subjects;
        int length = sbj.size();
        for (int index = 0;index < length;index++){
            System.out.println(sbj.get(index));
        }
    }
}
