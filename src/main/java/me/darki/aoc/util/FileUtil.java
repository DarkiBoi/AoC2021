package me.darki.aoc.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileUtil {

    public static ArrayList<String> getChallengeInputAsString(String path) {
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("inputs/" + path + ".txt"));
            ArrayList<String> listOfLines = new ArrayList<>();
            String line = bufReader.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = bufReader.readLine();
            }
            bufReader.close();
            return listOfLines;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Integer> getChallengeInputAsInteger(String path, int part) {
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("inputs/" + path + "/part" + part + ".txt"));
            ArrayList<Integer> listOfLines = new ArrayList<>();
            String line = bufReader.readLine();
            while (line != null) {
                listOfLines.add(Integer.parseInt(line));
                line = bufReader.readLine();
            }
            bufReader.close();
            return listOfLines;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
