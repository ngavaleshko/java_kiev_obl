package Lesson_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("first");
        set.add("second");
        set.add("third");
        set.add("four");
        System.out.println(set.size());

        set.add("first");
        System.out.println(set.size());
    }
}
