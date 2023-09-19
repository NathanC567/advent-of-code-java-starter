package aoc.day02;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day02Test {

    @Test
    public void testPart1() {
        // Given
        List<String> input = Collections.singletonList("bababc");

        // When
        String result = new Day02().part1(input);

        // Then
        assertEquals("1", result);
    }

    @Test
    public void testPart2() {
        List<String> input = Collections.singletonList("bababc");

        // When
        String result = new Day02().part2(input);

        // Then
        assertEquals(result, result);
    }
}
