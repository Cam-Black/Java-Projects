package com.qa.stream.foneteams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FOneTeams {
    private final List<String> FOneTeams = Arrays.asList("Red Bull",
            "Mercedes", "Ferrari");

    public void filterTeams(String letter) {
        List<String> newTeams =
                FOneTeams.stream()
                        .filter(str -> str.startsWith(letter))
                        .collect(Collectors.toList());
        System.out.println(newTeams);
    }

    @Override
    public String toString() {
        return "Formula One Teams: " + FOneTeams + ";";
    }
}
