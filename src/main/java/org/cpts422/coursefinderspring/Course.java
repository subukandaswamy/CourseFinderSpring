package org.cpts422.coursefinderspring;

public class Course {

    private String courseID;

    private String courseName;

    private String courseInstructor;

    public Course(String courseID, String courseName, String courseInstructor) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseInstructor='" + courseInstructor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;

        if (getCourseID() != null ? !getCourseID().equals(course.getCourseID()) : course.getCourseID() != null)
            return false;
        if (getCourseName() != null ? !getCourseName().equals(course.getCourseName()) : course.getCourseName() != null)
            return false;
        return getCourseInstructor() != null ? getCourseInstructor().equals(course.getCourseInstructor()) : course.getCourseInstructor() == null;
    }

    @Override
    public int hashCode() {
        int result = getCourseID() != null ? getCourseID().hashCode() : 0;
        result = 31 * result + (getCourseName() != null ? getCourseName().hashCode() : 0);
        result = 31 * result + (getCourseInstructor() != null ? getCourseInstructor().hashCode() : 0);
        return result;
    }
}
