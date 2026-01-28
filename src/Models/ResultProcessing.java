package Models;

import ENUMS.Gender;
import ENUMS.Grade;

public class ResultProcessing extends Student {

    private Grade grade;

    //Constructor
    public ResultProcessing(String name, int age, String email, Gender gender, String course, Grade grade) {
        super(name, age, email, gender, course);
        this.grade = grade;
    }

    // Getter for Grade
    public Grade getGrade() {
        return grade;
    }

    // Setter for Grade
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    // processResult Method
    public void processResult(Grade grade) {

        System.out.println("Processing result for " + getName() + "...");
        System.out.println("Course: " + getCourse());

        try {
            Thread.sleep(3000); // lets the code wait for 3 secs before execution
        } catch (InterruptedException e) {
            System.out.println("Sleep operation was interrupted");
        }


        System.out.println("Result processed successfully!");
        System.out.println(getName() + ", your grade is: " + grade);
    }


}
