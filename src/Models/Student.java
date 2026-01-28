package Models;

import ENUMS.Gender;

public class Student extends Person {
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        if( course.isEmpty()){
            throw new IllegalArgumentException("Course can't be empty");
        } else{
            this.course = course;
        }
    }

    public Student(String name, int age, String email, Gender gender, String course) {
        super(name, age, email, gender);
        setCourse(course);
    }

    public String getRoleDescription(){
        return "I am a student studying " + course;
    }
}
