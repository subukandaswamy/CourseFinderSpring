package org.cpts422.coursefinderspring;

import org.springframework.stereotype.Component;

@Component
public class CourseLister {

    private CourseManager courseManager;

    public CourseLister(CourseManager courseManager) {
        this.courseManager = courseManager;
        this.courseManager.add(new Course("CPTS_422","Software Testing","Subu"));
        this.courseManager.add(new Course("CPTS_101","Intro to EECS","Subu"));
        this.courseManager.add(new Course("CPTS_521","Software Maintenance","venera"));
    }

    private void displayCourses(Course[] courses){
        for (Course course: courses) {
            System.out.println(course);
        }
    }

    public void displayAllCourses(){
        displayCourses(courseManager.findall());
    }

    public void displayCoursesByInstructor(String courseInstructor){
        displayCourses(courseManager.findByInstructor(courseInstructor));
    }

}
