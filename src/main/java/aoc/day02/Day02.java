package aoc.day02;

import aoc.Day;

import java.util.List;
import java.util.stream.Collectors;

public class Day02 implements Day {
    @Override
    public String part1(List<String> input) {
        int duplicate = 0;
        int triplicate = 0;

        for (String str : input) {
            if (str.chars().boxed()
                    .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                    .values().stream().anyMatch(i -> i == 2)) {
                duplicate += 1;
            }

            if (str.chars().boxed()
                    .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                    .values().stream().anyMatch(i -> i == 3)) {
                triplicate += 1;
            }

        }
        return String.valueOf(duplicate * triplicate);
    }

    @Override
    public String part2(List<String> input) {
        for (String str1 : input) {
            for (String str2 : input) {
                int mistakes = 0;
                for (int i = 0; i < str1.length(); i++) {
                    if (str1.charAt(i) != str2.charAt(i)) {
                        mistakes++;
                        if (mistakes > 1) {
                            break;
                        }
                    }
                }
                if (mistakes == 1) {
                    return str1 + ":" + str2;
                }
            }
        }
        return "nope";
    }
}
