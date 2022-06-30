package com.qa.stream;

import com.qa.stream.foneteams.FOneTeams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        //Create a new FOneTeams Object, then print out the list, then filter out by passing a letter as a param
        FOneTeams teamList = new FOneTeams();
        System.out.println(teamList.toString());
        teamList.filterTeams("M");
    }
}
