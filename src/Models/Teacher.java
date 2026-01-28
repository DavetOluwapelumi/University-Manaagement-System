package Models;

import ENUMS.Gender;

public class Teacher extends Person {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject.isEmpty()){
            throw new IllegalArgumentException("Subject can't be empty");
        } else{
            this.subject = subject;
        }
    }

    public Teacher(String name, int age, String email, Gender gender, String subject) {
        super(name, age, email, gender);
        setSubject(subject);
    }

  @Override
    public String getRoleDescription(){
        return "I am teacher teaching " + subject;
    }
}
