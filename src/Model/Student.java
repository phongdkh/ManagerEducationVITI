package Model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Student extends Person {
    private String batch;
    private double mark1;
    private double mark2;

    private double avgMark;

    public Student() {
    }

    public Student(int id, String name, String numberPhone, String address, String batch, double mark1, double mark2, double avgMark) {
        super(id, name, numberPhone, address);
        this.batch = batch;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.avgMark = avgMark;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public void input(Scanner scanner) {
        System.out.println("Student ID: ");
        super.setId(scanner.nextInt());
        System.out.println("Student Name: ");
        super.setName(scanner.next());
        scanner.nextLine();
        System.out.println("Student NumberPhone: ");
        super.setNumberPhone(scanner.next());
        System.out.println("Student Address: ");
        super.setAddress(scanner.next());
        scanner.nextLine();
        System.out.println("Student Batch: ");
        setBatch(scanner.next());
        System.out.println("Student Mark1: ");
        setMark1(scanner.nextDouble());
        System.out.println("Student Mark2: ");
        setMark2(scanner.nextDouble());
        setAvgMark(avgMark());
    }

    @Override
    public void show() {
        System.out.println("============STUDER============");
        System.out.println("Studer ID: " + getId());
        System.out.println("Studer Name: " + getName());
        System.out.println("Studer NumberPhone: " + getNumberPhone());
        System.out.println("Studer Address: " + getAddress());
        System.out.println("Studer Batch: " + getBatch());
        System.out.println("Studer Mark 1: " + getMark1());
        System.out.println("Studer Mark 2: " + getMark2());
        System.out.println("Studer AvgMark: " + getAvgMark());
    }


    @Override
    public String toString() {
        return "Student{" +
                "batch='" + batch + '\'' +
                ", mark1=" + mark1 +
                ", mark2=" + mark2 +
                '}';
    }

    public double avgMark() {
        return (mark1 + mark2) / 2;
    }
}
