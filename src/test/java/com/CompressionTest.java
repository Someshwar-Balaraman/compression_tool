package com;

import java.io.IOException;
import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompressionTest {
    @Test
    void testGetFrequencyOfA() throws IOException {
        HashMap<Character, Integer> charFrequency = Compression.getFrequency("src/test/resources/test_data.txt");
        Assertions.assertEquals(6, charFrequency.get('a'));
    }
}
