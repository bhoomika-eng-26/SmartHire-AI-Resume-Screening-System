package com.smarthire.ai;

public class ResumeMatcher {


    public static double calculateMatch(
            String resumeSkills,
            String jobSkills) {


        if(resumeSkills == null || jobSkills == null) {
            return 0;
        }


        String[] resume =
                resumeSkills.toLowerCase()
                .split(",");


        String[] job =
                jobSkills.toLowerCase()
                .split(",");


        int matched = 0;


        for(String r : resume) {


            String resumeSkill =
                    normalizeSkill(r);



            for(String j : job) {


                String jobSkill =
                        normalizeSkill(j);



                if(resumeSkill.equals(jobSkill)
                        || resumeSkill.contains(jobSkill)
                        || jobSkill.contains(resumeSkill)) {


                    matched++;
                    break;

                }

            }

        }



        double percentage =
                ((double) matched / job.length) * 100;



        return Math.round(percentage * 100.0) / 100.0;

    }



    private static String normalizeSkill(String skill) {


        skill = skill.trim()
                .replace(" ", "");



        // MySQL and SQL treated as same skill
        if(skill.equals("mysql")) {

            skill = "sql";

        }


        return skill;

    }

}