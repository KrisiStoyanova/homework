package Homework5;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        //create array of person object
        Person[] obj = new Person[10];
        obj = new Person[]{obj[0], obj[1], obj[2], obj[3], obj[4], obj[5]};



        //create & initialize actual person objects using constructor
        obj[0] = new Person("Ivan Ivanov", 30, true);
        obj[1] = new Person("Mariya Petrova", 55, false);
        obj[2] = new Student("Petar Georgiev", 21, true, 2.00);
        obj[3] = new Student("Alexandra Tzvetkova", 19, false, 6.00);
        obj[4] = new Employee("Vasil Atanasov", 17, true, 50, 2);
        obj[5] = new Employee("Victoriya Toneva", 22, false, 100, 2);



        for (Person person : obj) {
            person.showPersonInfo();
        }

        for (Person student : obj) {
            student.showStudentInfo();
        }

        for (Person employee : obj) {
             employee.showEmployeeInfo();
             //employee.calculateOvertime();
        }




            //Arrays.stream(obj).forEach(student -> student.showStudentInfo());
            //Arrays.stream(obj).forEach(employee -> employee.showEmployeeInfo());
            //Arrays.stream(obj).forEach(employee -> employee.calculateOvertime());

            // Declaring an array of Person
            //Person[] arr;

            // Allocating memory for 10 objects of type Person
            //arr = new Person[10];

        /*Creating actual Person objects
        arr[0] = new Person();
        arr[1] = new Person();
        arr[2] = new Student();
        arr[3] = new Student();
        arr[4] = new Employee();
        arr[5] = new Employee();

        // Assigning data to Person objects
        arr[0].setData("Ivan Ivanov", 30, true);
        arr[1].setData("Mariya Petrova", 55, false);

        // Assigning data to Student objects
        arr[2].setData("Petar Georgiev", 21, true, 2.0);
        arr[3].setData("Alexandra Tzvetkova", 19, false, 6.0);

        // Assigning data to Employee objects
        arr[4].setData("Vasil Atanasov", 17, true, 50, 2);
        arr[5].setData("Victoriya Toneva", 22, false, 100, 2);

        // Displaying the Person data
        System.out.println("Person data in person arr 0: ");
        arr[0].showPersonInfo();

        System.out.println("Person data in person arr 1: ");
        arr[1].showPersonInfo();

        System.out.println("Person data in student arr 2: ");
        arr[2].showPersonInfo();

        System.out.println("Person data in student arr 3: ");
        arr[3].showPersonInfo();

        System.out.println("Person data in employee arr 4: ");
        arr[4].showPersonInfo();*/


        /*Person person1 = new Person();
        person1
        //person1.name = "Ivan Ivanov";
        //person1.age = 30;
        //person1.isMan = true;

        Person person2 = new Person();
        person2.name = "Mariya Petrova";
        person2.age = 55;
        person2.isMan = false;

        Student student1 = new Student();
        student1.name = "Petar Georgiev";
        student1.age = 21;
        student1.isMan = true;
        student1.score = 2.0;

        Student student2 = new Student();
        student2.name = "Alexandra Tzvetkova";
        student2.age = 19;
        student2.isMan = false;
        student2.score = 6.0;

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
        employee2.daySalary = 100;
        employee2.hours = 2;*/


        }
    }





