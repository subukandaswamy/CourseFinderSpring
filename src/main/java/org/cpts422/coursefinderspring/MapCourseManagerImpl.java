package org.cpts422.coursefinderspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MapCourseManagerImpl implements CourseManager {

    private final Map<String, List<Course>> courseMap = new HashMap<>();
    @Override
    public void add(Course course) {
        List<Course> instructorCourses = courseMap.getOrDefault(course.getCourseInstructor(), new ArrayList<>());
        instructorCourses.add(course);
        courseMap.put(course.getCourseInstructor(), instructorCourses);
    }

    @Override
    public Course[] findall() {
        List<Course> courses = new ArrayList<>();
        for (List<Course> valList: courseMap.values()) {
            courses.addAll(valList);
        }
        return courses.toArray(new Course[courses.size()]);
    }

    @Override
    public Course[] findByInstructor(String courseInstructor) {
        List<Course> instructorCourses = courseMap.getOrDefault(courseInstructor, new ArrayList<>());
        return instructorCourses.toArray(new Course[instructorCourses.size()]);
    }
}
