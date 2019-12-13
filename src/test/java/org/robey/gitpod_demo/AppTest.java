package org.robey.gitpod_demo;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AppTest {
    @Test 
    public void testAgain() throws Exception {
    }
    @Test public void testit() {
        String actual = "";
        String expected = "";
        assertThat( actual, is(expected));
    }

    @Test
    public void anotherTest() throws Exception {
        assertThat("a", any(String.class));
        throw new Exception("");

    }

    @Test
    public void thisIsAWorkingTest() throws Exception {
        App app = new App();
        assertThat(app.concat("A", "B"), is("A,B"));

    }

    @Test
    public void thisIsAFailingTest() throws Exception {
        App app = new App();
        assertThat(app.youFillIn("A", "B", "C"), is("C,B,A"));
    }
}