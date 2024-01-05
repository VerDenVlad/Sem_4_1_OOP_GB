package list;

import list.MyArrayList;
import list.MyList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>(); //MyList<Integer> list = new MyArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list.get(0));
        list.delete(1);
        System.out.println(list);
    }
}