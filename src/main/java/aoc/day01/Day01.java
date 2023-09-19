package aoc.day01;

import aoc.Day;

import java.util.List;

public class Day01 implements Day {

    @Override
    public String part1(List<String> input) {
        int sum = 0;
        for (String numStr : input) {
            int num = Integer.parseInt(numStr);
            sum += num;
        }
        return Integer.toString(sum);
    }

    @Override
    public String part2(List<String> input) {

        int sum = 0;
        for (String numStr : input) {
            int num = Integer.parseInt(numStr);
            sum += num;

        }
        return Integer.toString(sum);
    }
}
