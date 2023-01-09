package Homework5;

public class Person {

    String name;
    int age;
    boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public Person() {

    }


    void showPersonInfo() {
        System.out.println("Name: " + name +" "+ "Age: " + age + " " + "Man: " + isMan);
    }


    public void showStudentInfo() {
    }

    public void showEmployeeInfo() {
    }

    public void calculateOvertime() {
    }
}

class Student extends Person {

    double score;
    //2.0 <= score <= 6.0;

    public Student(String name, int age, boolean isMan, double score) {
        super();//reusing parent constructor
        this.name = name;
        this.age = age;
        this.isMan = isMan;

        }


        public void showStudentInfo() {
        System.out.println("Name: " + name + " " + "Age: " + age + " " + "Man: " + isMan + "Score: " + score);
        }


    }


    class Employee extends Person {

        float daySalary;

        public Employee(String name, int age, boolean isMan, float daySalary, int hours) {
            super();//reusing parent constructor
            this.name = name;
            this.age = age;
            this.isMan = isMan;
        }

        double overtime;
        double hours;
        double amount;


        public void calculateOvertime(double hours) {
            if (age < 18) {
                overtime = 0;
            } else {
                overtime = hours * 1.5;
            }
            amount = daySalary + overtime;
        }


        public void showEmployeeInfo() {
            System.out.println("Name: " + name + " " + "Age: " + age + " " + "Man: " + isMan + "Amount: " + amount);
        }

    }





