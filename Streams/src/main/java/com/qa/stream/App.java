package com.qa.stream;

import com.qa.stream.foneteams.FOneTeams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        //Create a new FOneTeams Object, then print out the list, then filter out by passing a letter as a param
        FOneTeams teamList = new FOneTeams();
        System.out.println(teamList);
        teamList.filterTeams("M");

        ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(1d,2d,3d,4d,5d,6d,7d,8d,9d));

        List<Double> mySquares =
                numbers.stream()
                        .map(x -> Math.pow(x, 2))
                        .collect(Collectors.toList());
        System.out.println(mySquares);
    }
}
