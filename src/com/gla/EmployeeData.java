package com.gla.WrapperClass;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeData {
    public static void main(String[] args) {

        int[] ages = {25, 30, 22, 40, 28};

        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages) {
            list.add(age);   
        }

        int minAge = Collections.min(list);
        int maxAge = Collections.max(list);

        System.out.println("Youngest age = " + minAge);
        System.out.println("Oldest age = " + maxAge);
    }
}
