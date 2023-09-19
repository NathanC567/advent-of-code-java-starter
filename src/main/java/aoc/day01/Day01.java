package aoc.day01;

import aoc.Day;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Integer> prevSums = new HashSet<>();
        prevSums.add(sum);
        int i = 0;

        do {
            int num = Integer.parseInt(input.get(i));
            sum += num;
            i = (i + 1) % input.size();
        } while (prevSums.add(sum));

        return Integer.toString(sum);
    }
}
