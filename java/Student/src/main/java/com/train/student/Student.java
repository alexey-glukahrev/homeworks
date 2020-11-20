package com.train.student;

public class Student {
    final public static int DEPARTMENT_SCIENCE_ID = 1;
    final public static int DEPARTMENT_POLITIC_ID = 2;
    final public static int DEPARTMENT_MUSIC_ID = 3;
    final public static int DEPARTMENT_CINEMA_ID = 4;
    final public static String DEPARTMENT_SCIENCE_NAME = "Science";
    final public static String DEPARTMENT_POLITIC_NAME = "Politic";
    final public static String DEPARTMENT_MUSIC_NAME = "Music";
    final public static String DEPARTMENT_CINEMA_NAME = "Cinema";

    private int studentId;     //id
    private String secondName;  // Фамилия
    private String firstName;   // Имя
    private String middleName;  // Отчество
    private String dateOfBirth;   // Дата рождения
    private String address;     // Адрес
    private String phoneNumber; // Телефон
    private int departmentId;   // Факультет
    private int gradeId;        // Курс
    private int groupId;        // Группа

    public Student() {
    }

    public Student(String firstName, String middleName, String secondName,
                   String dateOfBirth, String address, String phoneNumber,
                   int departmentId, int gradeId, int groupId) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.departmentId = departmentId;
        this.gradeId = gradeId;
        this.groupId = groupId;
        this.studentId = Math.abs(hashCode());
    }

    public int getStudentId() {
        return studentId;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (departmentId != student.departmentId) return false;
        if (gradeId != student.gradeId) return false;
        if (groupId != student.groupId) return false;
        if (secondName != null ? !secondName.equals(student.secondName) : student.secondName != null) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        if (middleName != null ? !middleName.equals(student.middleName) : student.middleName != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(student.dateOfBirth) : student.dateOfBirth != null) return false;
        if (address != null ? !address.equals(student.address) : student.address != null) return false;
        return phoneNumber != null ? phoneNumber.equals(student.phoneNumber) : student.phoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = secondName != null ? secondName.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + departmentId;
        result = 31 * result + gradeId;
        result = 31 * result + groupId;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", departmentId=" + departmentId +
                ", gradeId=" + gradeId +
                ", groupId=" + groupId +
                '}';
    }
}
