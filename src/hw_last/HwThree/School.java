package HwLast.HwThree;

import java.util.Objects;

public abstract class School {

  private String Surname;
  private int age;
  private String gender;
  private String status;

  public School(String surname, int age, String gender, String status) {
    Surname = surname;
    this.age = age;
    this.gender = gender;
    this.status = status;
  }

  public School() {
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    School school = (School) o;
    return age == school.age &&
        Objects.equals(Surname, school.Surname) &&
        Objects.equals(gender, school.gender) &&
        Objects.equals(status, school.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Surname, age, gender, status);
  }

  public String getSurname() {
    return Surname;
  }

  public void setSurname(String surname) {
    Surname = surname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "School{" +
        "Surname='" + Surname + '\'' +
        ", age=" + age +
        ", gender='" + gender + '\'' +
        ", status='" + status + '\'' +
        '}';
  }

  private enum SchoolType {
    PUPIL,
    TEACHER(),
    OTHER_EMPLOYEE()
  }
}
