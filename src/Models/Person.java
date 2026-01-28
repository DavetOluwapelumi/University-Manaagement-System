package Models;
import ENUMS.Gender;

public class Person{
  private String name;
  private int age;
  private String email;
  private Gender gender;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if(name.isEmpty()){
      throw new IllegalArgumentException("Name can't be empty");
    }else{
      this.name = name;
    }
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age <0 || age >150){
      throw new IllegalArgumentException("Age must be between 0-150");
    }
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    if (!email.contains("@")){
      throw new IllegalArgumentException("Invalid email address");
    }
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    if(gender == null){
      this.gender = Gender.OTHER;
      throw new IllegalArgumentException("Gender can't be null, it has been defaulted to OTHER");

    }else {
      this.gender = gender;
    }
  }

  public Person(String name, int age, String email, Gender gender) {
    setName(name);
    setAge(age);
    setEmail(email);
    setGender(gender);

  }

  public String getRoleDescription(){
    return "I am a Person";
  }
}
