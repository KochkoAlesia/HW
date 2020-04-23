package HwFivePartOne.bus.model;

import java.util.Objects;

public class School implements Comparable<School> {
private String surname;
private int age;
private String gender;
private String status;

  public School(String surname, int age, String gender, String status) {
    this.surname = surname;
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
        Objects.equals(surname, school.surname) &&
        Objects.equals(gender, school.gender) &&
        Objects.equals(status, school.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surname, age, gender, status);
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    surname = surname;
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
        "Surname='" + surname + '\'' +
        ", age=" + age +
        ", gender='" + gender + '\'' +
        ", status='" + status + '\'' +
        '}';
  }

  @Override
  public int compareTo(School school) {
    return String.valueOf(surname).compareTo(String.valueOf(school.getSurname()));
  }
}
