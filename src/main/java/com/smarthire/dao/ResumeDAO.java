package com.smarthire.dao;

import com.smarthire.model.Resume;

public interface ResumeDAO {

    boolean uploadResume(Resume resume);

    String getSkillsByUserId(int userId);

}