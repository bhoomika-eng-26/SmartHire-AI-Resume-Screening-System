package com.smarthire.ai;

public class TestMatcher {

    public static void main(String[] args) {


        double result =
        ResumeMatcher.calculateMatch(
                "Java,Python,MySQL",
                "Java,Python,MySQL,Spring"
        );


        System.out.println(
                "Match Percentage : "
                + result + "%"
        );

    }

}