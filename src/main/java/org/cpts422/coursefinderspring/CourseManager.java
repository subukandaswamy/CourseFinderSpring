package org.cpts422.coursefinderspring;

import org.springframework.stereotype.Component;

public interface CourseManager {

    public void add(Course course);

    public Course[] findall();

    public Course[] findByInstructor(String courseInstructor);
}
