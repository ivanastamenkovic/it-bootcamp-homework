package javaclasses;

public class TaskWorker {
    public static void main(String[] args) {

        int years = 10;

        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();

        worker1.firstName = "Ivana";
        worker1.lastName = "Stamenkovic";
        worker1.yearOfEmployment = 2017;

        worker2.firstName = "Jovana";
        worker2.lastName = "Arsenic";
        worker2.yearOfEmployment = 2014;

        worker3.firstName = "Zorica";
        worker3.lastName = "Kerkez";
        worker3.yearOfEmployment = 2000;

        if (worker1.hasWorkedMoreThan(years)) {
            System.out.println(worker1.firstName + " " + worker1.lastName + " has worked for more than " + years + " years at the company.");
        } else {
            System.out.println(worker1.firstName + " " + worker1.lastName + " has not worked for more than " + years + " years at the company.");
        }

        if (worker2.hasWorkedMoreThan(years)) {
            System.out.println(worker2.firstName + " " + worker2.lastName + " has worked for more than " + years + " years at the company.");
        } else {
            System.out.println(worker2.firstName + " " + worker2.lastName + " has not worked for more than " + years + " years at the company.");
        }

        if (worker3.hasWorkedMoreThan(years)) {
            System.out.println(worker3.firstName + " " + worker3.lastName + " has worked for more than " + years + " years at the company.");
        } else {
            System.out.println(worker3.firstName + " " + worker3.lastName + " has not worked for more than " + years + " years at the company.");
        }

    }
}
