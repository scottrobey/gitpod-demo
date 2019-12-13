package org.robey.gitpod_demo;

import org.junit.Test;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;

public class AppTest {
    @Test 
    public void testAgain() throws Exception {
    }
    @Test public void testit() {
        String actual = "";
        String expected = "";
        assertThat( actual, CoreMatchers.is(expected));
    }

    @Test
    public void anotherTest() throws Exception {
        assertThat("a", CoreMatchers.any(String.class));
        throw new Exception("");

    }
}