package School;

import java.util.Scanner;

public class Courses {
    Scanner scanner = new Scanner(System.in);

    void count(){
        System.out.println("How many courses are you offering this semester? (type with digit)");
        int input = scanner.nextInt();
        if (input < 5){
            System.out.println("Total number of courses must be more than 5, try again.");
        } else if (input > 10) {
            System.out.println("Total number of courses should not exceed 10.");
        } else {
            System.out.println("Okay,your input have been recorded.");
        }
}
}
