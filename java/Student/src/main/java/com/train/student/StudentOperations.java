package com.train.student;

import java.util.ArrayList;
import java.util.List;

import static com.train.student.Student.*;

public class StudentOperations {
    private List<Student> list;

    public void addNewStudent(Student student) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(student);
    }

    // список студентов заданного факультета
    public void printListOfDepartment(int departmentId) {
        System.out.println("List of " + convertDepartmentIdToDepartmentName(departmentId)
                + " department students");
        for (Student each: list) {
            if (each.getDepartmentId() == departmentId) {
                System.out.println("Student: " + each.getFirstName() + " "
                        + each.getMiddleName() + " " + each.getSecondName());
            }
        }
    }

    // списки студентов для каждого факультета и курса
    public void printListOfGrade(int departmentId, int gradeId) {
        System.out.println("List of grade " + gradeId + " students for " +
                convertDepartmentIdToDepartmentName(departmentId) + " department");
        for (Student each: list) {
            if (each.getDepartmentId() == departmentId && each.getGradeId() == gradeId) {
                System.out.println("Student: " + each.getFirstName() + " "
                        + each.getMiddleName() + " " + each.getSecondName());
            }
        }
    }

    // список студентов, родившихся после заданного года
    public void printListByAge(int year) {
        int studentBirthYear;
        System.out.println("List of students that were born after " + year + " year");
        for (Student each: list) {
            try {
                studentBirthYear = parseYearFromBirthDate(each.getDateOfBirth());
                if (studentBirthYear > year) {
                    System.out.println("Student: " + each.getFirstName() + " "
                            + each.getMiddleName() + " " + each.getSecondName()
                            + " " + studentBirthYear);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unexpected exception during parsing date of birth for studentId "
                        + each.getStudentId() + ". Details: " + e);
            }
        }
    }

    // список учебной группы
    public void printListOfGroup(int departmentId, int gradeId, int groupId) {
        System.out.println("List of study group students from " +
                convertDepartmentIdToDepartmentName(departmentId) + " department, grade: "
                + gradeId + ", group: " + groupId);
        for(Student each: list) {
            if (each.getDepartmentId() == departmentId
                    && each.getGradeId() == gradeId
                    && each.getGroupId() == groupId) {
                System.out.println("Student: " + each.getFirstName() + " "
                        + each.getMiddleName() + " " + each.getSecondName());
            }
        }
    }

    private int parseYearFromBirthDate(String birthdate) {
        return Integer.parseInt(birthdate.split("-")[2]);
    }

    private String convertDepartmentIdToDepartmentName(int departmentId) {
        String departmentName;
        switch (departmentId) {
            case DEPARTMENT_SCIENCE_ID:
                departmentName = DEPARTMENT_SCIENCE_NAME;
                break;
            case DEPARTMENT_POLITIC_ID:
                departmentName = DEPARTMENT_POLITIC_NAME;
                break;
            case DEPARTMENT_MUSIC_ID:
                departmentName = DEPARTMENT_MUSIC_NAME;
                break;
            case DEPARTMENT_CINEMA_ID:
                departmentName = DEPARTMENT_CINEMA_NAME;
                break;
            default:
                departmentName = DEPARTMENT_POLITIC_NAME;
        }
        return departmentName;
    }
}
