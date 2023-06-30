import Model.Student;
import Util.ManagerFunction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            ManagerFunction.printMenu();
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    ManagerFunction.inputPerson();
                    break;
                case 2, 3:
                    ManagerFunction.showPerson();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }while (true);
    }
}