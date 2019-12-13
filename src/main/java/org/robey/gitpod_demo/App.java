package org.robey.gitpod_demo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class App {

    public static void main(String args[]) {
        System.out.println("App Running");
    }

    public String concat(String ... themStringsTho) {
        return Arrays.asList(themStringsTho).stream().collect(Collectors.joining(","));
    }

    public String youFillIn(String ... themStringsTho) {
        return "";
    }
}