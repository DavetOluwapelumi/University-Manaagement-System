package Models;

import ENUMS.Gender;

public class AdminStaff extends Person {

    private String department;

    public AdminStaff(String name, int age, String email, Gender gender, String department ) {
        super(name, age, email, gender);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department.isEmpty()) {
            throw new IllegalArgumentException(
                    "Department can't be empty"
            );
        }        else{
            this.department = department;
        }
    }

    @Override
    public String getRoleDescription(){
        return "I am an admin staff working in " + department;
    }
}
