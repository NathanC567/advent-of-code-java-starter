package aoc.day01;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day01Test {

    @Test
    public void testPart1() {
        // Given
        List<String> input = Collections.singletonList("-5");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals(input.get(0), result);
    }

    @Test
    public void testPart2() {
        // Given
        List<String> input = Arrays.asList("3", "1", "1", "-1", "2", "-1", "-1");

        // When
        String result = new Day01().part2(input);

        // Then
        assertEquals(result, result);
    }
}
