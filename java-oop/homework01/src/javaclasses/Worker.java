package javaclasses;

/* Write a class Worker that has attributes name, surname, and year of employment.
Create a method that checks if the employee has been with the company for more than 10 years.
Create 3 workers and check whether each worker has been working for more than 10 years in the company. */

import java.time.Year;
public class Worker {

    String firstName;
    String lastName;
    int yearOfEmployment;

    public Worker() {

    }

    public Worker(String firstName, String lastName, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int yearsOfWork() {
        int currentYear = Year.now().getValue();
        return currentYear - yearOfEmployment;
    }

    public boolean hasWorkedMoreThan(int years) {
        return yearsOfWork() > years;
    }
}
