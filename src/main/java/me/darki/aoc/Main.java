package me.darki.aoc;

import me.darki.aoc.days.Day1;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Solvable> days = new ArrayList<>();

    public static void main(String[] args) {

        init();

        if(args.length == 0) {
            System.out.println("Please provide a day parameter");
            return;
        }

        try {
            days.get(Integer.parseInt(args[0].replaceAll("day", "")) - 1).run();
        } catch (Exception e) {
            System.err.println("Error parsing your input!");
            e.printStackTrace();
        }

    }

    public static void init() {
        days.add(new Day1());
    }

}
