package com.train.student;

public class Main {

    public static void main(String[] args) {
	    StudentOperations data = new StudentOperations();
        data.addNewStudent(new Student("Albert",
                "", "Einstein",
                "14-03-1879",
                "", "", 1,1, 1));
        data.addNewStudent(new Student("Andrei",
                "Dmitrievich", "Sakharov",
                "21-05-1921",
                "", "", 1,1, 1));
        data.addNewStudent(new Student("Dmitri",
                "Ivanovich", "Mendeleev",
                "08-02-1834",
                "", "", 1,2, 3));
        data.addNewStudent(new Student("Linus",
                "Carl", "Pauling",
                "28-02-1901",
                "", "", 1,2, 3));
        data.addNewStudent(new Student("Emmanuel",
                "Jean-Michel", "Macron",
                "21-12-1977",
                "", "", 2,2, 2));
        data.addNewStudent(new Student("Angela",
                "Dorothea", "Merkel",
                "17-07-1954",
                "", "", 2,2, 2));
        data.addNewStudent(new Student("Donald",
                "John", "Trump",
                "14-06-1946",
                "", "", 2,2, 2));
        data.addNewStudent(new Student("Bruce",
                "Frederick", "Springsteen",
                "23-09-1949",
                "", "", 3,4, 1));
        data.addNewStudent(new Student("Eric",
                "Patrick", "Clapton",
                "30-03-1945",
                "", "", 3,4, 1));
        data.addNewStudent(new Student("Enrico",
                "", "Caruso",
                "25-02-1873",
                "", "", 3,5, 1));
        data.addNewStudent(new Student("Muslim",
                "Magometovich", "Magomayev",
                "17-08-1942",
                "", "", 3,4, 1));
        data.addNewStudent(new Student("Ennio",
                "", "Morricone",
                "10-11-1928",
                "", "", 3,4, 2));
        data.addNewStudent(new Student("Daniel",
                "Jacob", "Radcliffe",
                "23-07-1989",
                "", "", 4,1, 1));
        data.addNewStudent(new Student("Rupert",
                "Alexander", "Grint",
                "24-08-1988",
                "", "", 4,1, 1));
        data.addNewStudent(new Student("Emma",
                "Charlotte", "Watson",
                "15-04-1990",
                "", "", 4,1, 1));

        System.out.println("********************************************");
        data.printListOfDepartment(2);
        System.out.println("********************************************");
        data.printListOfGrade(3, 4);
        System.out.println("********************************************");
        data.printListByAge(1945);
        System.out.println("********************************************");
        data.printListOfGroup(4, 1, 1);
        System.out.println("********************************************");

    }
}
