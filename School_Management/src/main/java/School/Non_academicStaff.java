package School;

import java.util.Scanner;

public class Non_academicStaff extends Staff implements Department{

    public Non_academicStaff(int staffId, String name) {
        super(staffId, name);
    }

    //Implementing login method from Department
    public void login() {
        System.out.println("Enter your Staff ID: ");
        int input = scanner.nextInt();
        if (input == staffId) {
            System.out.println("Hello " + name + ", welcome back.");
        } else {
            System.out.println("Incorrect ID number, try again.");
        }
    }
    void jobRole(){
        System.out.println("You are a Non-academic staff.");
    }

}
