package me.darki.aoc.days;

import me.darki.aoc.Solvable;
import me.darki.aoc.util.FileUtil;

import java.util.ArrayList;

public class Day1 extends Solvable {

    public void run() {

        partOne();
        partTwo();

    }

    public static void partOne() {

        ArrayList<Integer> input = FileUtil.getChallengeInputAsInteger("day1", 1);

        int previousMeasurement = -1;
        int numIncreased = 0;

        for(int i : input) {

            if(previousMeasurement == -1) {
                previousMeasurement = i;
                continue;
            }

            if(i > previousMeasurement) {
                numIncreased++;
            }

            previousMeasurement = i;

        }

        System.out.println("Day 1 Part 1: " + numIncreased);

    }

    public static void partTwo() {

        ArrayList<Integer> input = FileUtil.getChallengeInputAsInteger("day1", 2);

        ArrayList<Integer> sums = new ArrayList<>();

        for(int i = 0; i < input.size(); i++) {

            int sum = 0;

            for(int p = 0; p < 3; p++) {
                if(i + p < input.size()) {
                    sum += input.get(i + p);
                }
            }

            sums.add(sum);

        }

        int previousMeasurement = -1;
        int numIncreased = 0;

        for(int i : sums) {

            if(previousMeasurement == -1) {
                previousMeasurement = i;
                continue;
            }

            if(i > previousMeasurement) {
                numIncreased++;
            }

            previousMeasurement = i;

        }

        System.out.println("Day 1 Part 2: " + numIncreased);

    }

}
