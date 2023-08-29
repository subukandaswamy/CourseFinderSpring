package org.cpts422.coursefinderspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class CourseFinderSpringApplication implements CommandLineRunner {

	private final CourseLister courseLister;

	public CourseFinderSpringApplication(CourseLister courseLister) {
		this.courseLister = courseLister;
	}


	public static void main(String[] args) {
		SpringApplication.run(CourseFinderSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("All Courses:");
		courseLister.displayAllCourses();
		if(args.length >0){
			System.out.println("Courses for Instructor: " + args[0]);
			courseLister.displayCoursesByInstructor(args[0]);
		}
	}
}
