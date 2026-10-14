package com.lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testNormalString() {
        assertEquals("olleH", App.reverseString("Hello"));
    }

    @Test
    public void testMixedCase() {
        assertEquals("aHsInA", App.reverseString("AnIsHa"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", App.reverseString(""));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("a", App.reverseString("a"));
    }

    @Test
    public void testPalindrome() {
        assertEquals("madam", App.reverseString("madam"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullString() {
        App.reverseString(null);
    }
}