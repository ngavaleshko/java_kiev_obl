package Lesson_2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list =new ArrayList(1000);
        list.add("first");
        list.add(12);
        System.out.println(list.get(0));

        list.add(0,"element");
        System.out.println(list);
        list.size();
        System.out.println(list.size());

    }
}
