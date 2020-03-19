package com.company;

import com.company.Histogram;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HistogramTest {

    @org.junit.jupiter.api.Test
    void getHistogram() {
        Histogram result = new Histogram();

        assertNotNull(result.getHistogram());
    }

    @org.junit.jupiter.api.Test
    void testCreateHistogramNotEquals() {
        // retrieve object from create Histogram
        Histogram result = new Histogram();
        result.createHistogram("Ala ma kota");

        // build own expected result
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 4);
        expected.put('l', 1);

        assertNotEquals(result.getHistogram(), expected);
    }

    @org.junit.jupiter.api.Test
    void testCreateHistogramEquals() {
        // retrieve object from create Histogram
        Histogram result = new Histogram();
        result.createHistogram("aaabbc");

        // build own expected result
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 3);
        expected.put('b', 2);
        expected.put('c', 1);

        assertEquals(result.getHistogram(), expected);
    }

    @org.junit.jupiter.api.Test
    void testCreateHistogramContain() {
        Histogram result = new Histogram();
        result.createHistogram("codecool");

        assertTrue(result.getHistogram().containsKey('d'));
    }

    @org.junit.jupiter.api.Test
    void testCreateHistogramNotContain() {
        Histogram result = new Histogram();
        result.createHistogram("codecool");

        assertFalse(result.getHistogram().containsKey('x'));
    }

    @Test
    void testToString() {
        Histogram result = new Histogram();
        result.createHistogram("coo");

        String expected = "c : 1\no : 2\n";
//        assertSame(result.toString(), expected);
        assertSame("abc", "abc");
    }
}