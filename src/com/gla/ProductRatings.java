package com.gla.WrapperClass;
import java.util.ArrayList;
import java.util.Objects;

public class ProductRatings {
    public static void main(String[] args) {
        int[] ratingsArray = {4, 5, 3, 4};
        ArrayList<Integer> ratingsList = new ArrayList<>();
        ratingsList.add(5);
        ratingsList.add(null);
        ratingsList.add(4);
        ratingsList.add(null);
        ArrayList<Integer> allRatings = new ArrayList<>();
        for (int r : ratingsArray) {
            allRatings.add(r);
        }
        allRatings.addAll(ratingsList);
        int sum = 0;
        int count = 0;

        for (Integer r : allRatings) {
            if (Objects.nonNull(r)) {
                sum += r;   
                count++;
            }
        }

        double avg = (count == 0) ? 0 : (double) sum / count;
        System.out.println("Average rating = " + avg);
    }
}
