package HwFivePartOne.bus.model;

import java.util.Objects;

public class Teacher extends School {
private String subject;

  public Teacher(String surname, int age, String gender, String status, String subject) {
    super(surname, age, gender, status);
    this.subject = subject;
  }

  public Teacher() {
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Teacher teacher = (Teacher) o;
    return Objects.equals(subject, teacher.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), subject);
  }

  @Override
  public String toString() {
    return "Teacher{" +
        "subject='" + subject + '\'' +
        '}';
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }
}
