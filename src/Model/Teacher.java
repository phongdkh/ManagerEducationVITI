package Model;

import java.util.Scanner;

public class Teacher extends Person {
    private double salary;
    private int numberWorkDay;

    public Teacher() {
    }

    public Teacher(int id, String name, String numberPhone, String address, double salary, int numberWorkDay) {
        super(id, name, numberPhone, address);
        this.salary = salary;
        this.numberWorkDay = numberWorkDay;
    }

    public double getSalary() {
        return numberWorkDay * 800000;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberWorkDay() {
        return numberWorkDay;
    }

    public void setNumberWorkDay(int numberWorkDay) {
        this.numberWorkDay = numberWorkDay;
    }

    @Override
    public void input(Scanner scanner) {
        System.out.println("Teacher ID: ");
        super.setId(scanner.nextInt());
        System.out.println("Teacher Name: ");
        super.setName(scanner.next());
        System.out.println("Teacher NumberPhone: ");
        super.setNumberPhone(scanner.next());
        System.out.println("Teacher Address: ");
        super.setAddress(scanner.next());
        scanner.nextLine();
        System.out.println("Teacher NumberWorkday: ");
        setNumberWorkDay(scanner.nextInt());
        setSalary(getSalary());
    }

    @Override
    public void show() {
        System.out.println("============TEACHER============");
        System.out.println("Teacher ID: " + getId());
        System.out.println("Teacher Name: " + getName());
        System.out.println("Teacher NumberPhone: " + getNumberPhone());
        System.out.println("Teacher Address: " + getAddress());
        System.out.println("Teacher NumberWorkDay: " + getNumberWorkDay());
        System.out.println("Teacher Salary: " + getSalary());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", numberWorkDay=" + numberWorkDay +
                '}';
    }
}
