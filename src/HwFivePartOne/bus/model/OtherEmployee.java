package HwFivePartOne.bus.model;

import java.util.Objects;

public class OtherEmployee extends School {
private String position;
private int experience;

  public OtherEmployee(String surname, int age, String gender, String status, String position,
      int experience) {
    super(surname, age, gender, status);
    this.position = position;
    this.experience = experience;
  }
  public OtherEmployee() {
    }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
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
    OtherEmployee employee = (OtherEmployee) o;
    return experience == employee.experience &&
        Objects.equals(position, employee.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), position, experience);
  }

  @Override
  public String toString() {
    return "OtherEmployee{" +
        "position='" + position + '\'' +
        ", experience=" + experience +
        '}';
  }
}
