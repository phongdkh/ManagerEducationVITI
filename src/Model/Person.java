package Model;

import java.util.Scanner;

public abstract class Person {
    private int id;
    private String name;
    private String numberPhone;
    private String address;

    public Person() {
    }

    public Person(int id, String name, String numberPhone, String address) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract void input(Scanner scanner);

    public abstract void show();

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
