import ENUMS.Grade;
import Models.*;
import ENUMS.Gender;
import Models.ResultProcessing;

public class Main {
    public static void main(String[] args) {

        Person[] person = new Person[3];




        try {
            person[0] = new Student("David", 21, "david@example.com", Gender.MALE, "Computer Science");
            person[1] = new Teacher("Titi", 21, "david@example.com", Gender.FEMALE, "Biology");
            person[2] = new AdminStaff("Ola", 23, "Ola@example.com", Gender.MALE, "Registrar");



            for (Person i : person){
                System.out.println("Name: " + i.getName() + " Gender: " + i.getGender() + " Role Description: " + i.getRoleDescription());

            }

        } catch (Exception e) {
            System.out.println(("an error as occurred" + e.getMessage()));
        } finally {
            System.out.println("operations completed");
        }

        ResultProcessing[] processResult = new ResultProcessing[3];

        processResult[0] = new ResultProcessing("Grace", 21, "Grace@example.com", Gender.FEMALE, "Backend", Grade.DISTINCTION);

        System.out.println("About to process Result");
        processResult[0].processResult(Grade.DISTINCTION);
    }
}

