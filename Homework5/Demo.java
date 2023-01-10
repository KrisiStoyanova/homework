package Homework5;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Ivan Ivanov";
        person1.age = 30;
        person1.isMan = true;

        Person person2 = new Person();
        person2.name = "Mariya Petrova";
        person2.age = 55;
        person2.isMan = false;


        Student student1 = new Student();
        student1.name = "Petar Georgiev";
        student1.age = 21;
        student1.isMan = true;
        student1.score = 2.00;

        Student student2 = new Student();
        student2.name = "Alexandra Tzvetkova";
        student2.age = 19;
        student2.isMan = false;
        student2.score = 6.00;

        Employee employee1 = new Employee();
        employee1.name = "Vasil Atanasov";
        employee1.age = 17;
        employee1.isMan = true;
        employee1.daySalary = 50;
        employee1.hours = 2;

        Employee employee2 = new Employee();
        employee2.name = "Victoriya Toneva";
        employee2.age = 22;
        employee2.isMan = false;
        employee2.daySalary = 80;
        employee2.hours = 2;

        //create array of person object
        Person[] obj = new Person[10];
        obj = new Person[]{person1, person2, student1, student2, employee1, employee2};

        //create & initialize actual person objects using constructor
        //obj[0] = new Person("Ivan Ivanov", 30, true);
        //obj[1] = new Person("Mariya Petrova", 55, false);
        //obj[2] = new Student("Petar Georgiev", 21, true, 2.00);
        //obj[3] = new Student("Alexandra Tzvetkova", 19, false, 6.00);
        //obj[4] = new Employee("Vasil Atanasov", 17, true, 50, 2);
        //obj[5] = new Employee("Victoriya Toneva", 22, false, 100, 2);

        for (Person person : obj) {
            person.showPersonInfo();
        }

        for (Person student : obj) {
            student.showStudentInfo();
        }

        for (Person employee : obj) {
             employee.showEmployeeInfo();
        }

        for (Person employee : obj) {
            employee.calculateOvertime();
        }
    }
}





