package HwThree;

import java.util.Objects;

public class Pupil extends School {
  private String classNumber;

  public Pupil () {
  }

  public Pupil(String surname, int age, String gender, String status, String classNumber) {
    super(surname, age, gender, status);
    this.classNumber = classNumber;
  }

  public void setClassNumber(String classNumber) {
    this.classNumber = classNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pupil pupil = (Pupil) o;
    return Objects.equals(classNumber, pupil.classNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classNumber);
  }

  @Override
  public String toString() {
    return "Pupil{" +
        "classNumber='" + classNumber + '\'' +
        '}';
  }
}
