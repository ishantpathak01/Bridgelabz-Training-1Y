package com.gla.WrapperClass;

import java.util.ArrayList;

public class StudentMarks {
    public static void main(String[] args) {

        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> marks = new ArrayList<>();

        for (Object obj : inputs) {
            try {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!str.equals("null")) {
                        marks.add(Integer.parseInt(str));
                    }
                } else if (obj instanceof Integer) {
                    marks.add((Integer) obj);
                }
            } catch (NumberFormatException e) {
                // ignore invalid values
            }
        }

        int sum = 0;
        int count = 0;

        for (Integer m : marks) {
            sum += m;
            count++;
        }

        double avg = (count == 0) ? 0 : (double) sum / count;

        System.out.println("Average marks = " + avg);
    }
}
