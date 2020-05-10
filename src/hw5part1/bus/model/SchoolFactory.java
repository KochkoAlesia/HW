package HwFivePartOne.bus.model;

import HwFivePartOne.servise.ScannerWrapper;

public class SchoolFactory {

  private ScannerWrapper sc = new ScannerWrapper();

  public School produce() {

    System.out.println("Enter 1 to produce Pupil");
    System.out.println("Enter 2 to produce Teacher");
    System.out.println("Enter 3 to produce Other Employee School");

    int choice = sc.nextInt(1, 3);

    School result;

    switch (choice) {
      case 1:
        Pupil pupil = new Pupil();
        System.out.println("Enter the pupil's class number and letter");
        String classNumber = sc.nextLine();
        pupil.setClassNumber(classNumber);
        result = pupil;
        break;
      case 2:
        Teacher teacher = new Teacher();
        System.out.println("Enter the subject taught by the teacher");
        String subject = sc.nextLine();
        teacher.setSubject(subject);
        result = teacher;
        break;
      case 3:
        OtherEmployee otherEmployee = new OtherEmployee();
        System.out.println("Enter the employee's position");
        String position = sc.nextLine();
        otherEmployee.setPosition(position);
        System.out.println("Enter the employee's work experience");
        int experience = sc.nextInt();
        otherEmployee.setExperience(experience);
        result = otherEmployee;
        break;
      default:
        return null;
    }

    System.out.println("Enter surname");
    String surname = sc.nextLine();
    result.setSurname(surname);

    System.out.println("Enter age");
    int age = sc.nextInt();
    result.setAge(age);

    System.out.println("Enter gender");
    String gender = sc.nextLine();
    result.setGender(gender);

    System.out.println("Enter status");
    String status = sc.nextLine();
    result.setStatus(status);
    return result;
  }
}

