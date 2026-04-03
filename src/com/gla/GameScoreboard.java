package com.gla.WrapperClass;
public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {50, null, 80, null, 100};
        int notPlayed = 0;
        int total = 0;
        for (Integer s : scores) {
            if (s == null) {
                notPlayed++;
            } else {
                total += s;   
            }
        }

        System.out.println("Players not played = " + notPlayed);
        System.out.println("Total score = " + total);
    }
}
