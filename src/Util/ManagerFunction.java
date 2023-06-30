package Util;

import Model.Person;
import Model.Student;
import Model.Teacher;

import java.util.*;

public class ManagerFunction {
    static List<Person> listPerson = new ArrayList<>();

    public static void printMenu() {
        System.out.println("PRINT MENU");
        System.out.println("1. Input Student or Teacher");
        System.out.println("2. Show Student list.");
        System.out.println("3. Show Teacher list.");
        System.out.println("4. Sort the average scores of all students in ascending order.");
        System.out.println("5. Sort by name (Alphabetical) ABC .... of teacher");
        System.out.println("6. Exit");
    }

    public static void inputPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INPUT PERSON");
        System.out.println("1. Input Teacher");
        System.out.println("2. Input Student");
        int choose = scanner.nextInt();
        if (choose == 1) {
            Teacher teacher = new Teacher();
            teacher.input(scanner);
            listPerson.add(teacher);
        } else {
            Student student = new Student();
            student.input(scanner);
            listPerson.add(student);
        }
    }

    public static void showPerson() {
        for (Person person : listPerson) {
            if (person instanceof Student student) {
                student.show();
            } else if (person instanceof Teacher teacher) {
                teacher.show();
            }
        }
    }

//    public static void sortByAvg(List<Person> personList){
//        Collections.sort(personList, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                if(o1 instanceof Student && o2 instanceof Student){
//                    Student s1 = (Student) o1;
//                    Student s2 = (Student) o2;
//                    double avgMark1 = s1.avgMark();
//                    double avgMark2 = s2.avgMark();
//                    return Double.compare(avgMark1, avgMark2);
//                }
//                return 0;
//            }
//        });
//    }
}
