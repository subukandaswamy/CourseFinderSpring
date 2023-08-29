package org.cpts422.coursefinderspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class ListCourseManagerImpl implements CourseManager {

    private final List<Course> courseList = new ArrayList<>();
    @Override
    public void add(Course course) {
        courseList.add(course);
    }

    @Override
    public Course[] findall() {

        return courseList.toArray(new Course[courseList.size()]);
    }

    @Override
    public Course[] findByInstructor(String courseInstructor) {
        List<Course> result = new ArrayList<>();
        for (Course course: courseList) {
            if(courseInstructor.equals(course.getCourseInstructor())){
                result.add(course);
            }
        }
        return result.toArray(new Course[result.size()]);
    }
}
