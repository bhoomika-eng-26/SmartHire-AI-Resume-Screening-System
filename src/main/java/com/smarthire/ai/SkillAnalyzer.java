package com.smarthire.ai;

import java.util.ArrayList;
import java.util.List;

public class SkillAnalyzer {


    public static String findMatchedSkills(String candidateSkills,
                                           String requiredSkills) {


        if(candidateSkills == null || candidateSkills.trim().isEmpty()) {
            return "No Resume Skills Found";
        }


        if(requiredSkills == null || requiredSkills.trim().isEmpty()) {
            return "No Job Skills Found";
        }



        String[] candidate =
                candidateSkills.toLowerCase().split(",");


        String[] required =
                requiredSkills.toLowerCase().split(",");



        List<String> matched = new ArrayList<>();


        for(String r : required) {

            for(String c : candidate) {


                if(r.trim().equals(c.trim())) {

                    matched.add(r.trim());

                    break;
                }

            }

        }



        if(matched.isEmpty()) {
            return "No Matching Skills";
        }


        return String.join(", ", matched);

    }





    public static String findMissingSkills(String candidateSkills,
                                           String requiredSkills) {


        if(requiredSkills == null || requiredSkills.trim().isEmpty()) {
            return "No Job Skills Found";
        }


        if(candidateSkills == null || candidateSkills.trim().isEmpty()) {
            return requiredSkills;
        }



        String[] candidate =
                candidateSkills.toLowerCase().split(",");



        String[] required =
                requiredSkills.toLowerCase().split(",");



        List<String> missing = new ArrayList<>();



        for(String r : required) {


            boolean found = false;



            for(String c : candidate) {


                if(r.trim().equals(c.trim())) {

                    found = true;
                    break;

                }

            }



            if(!found) {

                missing.add(r.trim());

            }

        }



        if(missing.isEmpty()) {

            return "No Missing Skills";

        }


        return String.join(", ", missing);

    }

}