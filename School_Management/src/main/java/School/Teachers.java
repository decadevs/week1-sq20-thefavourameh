package School;

import java.util.Scanner;

public class Teachers extends Staff implements Department{

    public Teachers(int staffId, String name) {
        super(staffId, name);
    }

//Implementing login method from Department
    public void login() {
        System.out.println("Enter your Staff ID: ");
        int input = scanner.nextInt();
        if (staffId == input) {
            System.out.println("Hello Teacher! Welcome back.");
        } else {
            System.out.println("Incorrect ID number");
        }
    }

    void teachCourse() {
        System.out.println("What course are you taking today?");
        String input = scanner.nextLine();
        System.out.println("Alright! Have a wonderful lecture.");
        }
    }

