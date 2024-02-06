package School;

import java.util.Scanner;

public class Students implements Department{
    int regNo;
    String name;

    public Students(int regNo, String name) {
        this.regNo = regNo;
        this.name = name;
    }
    Scanner scanner = new Scanner(System.in);

    //Implementing login method from Department
    public void login() {
        System.out.println("Hello " + name + ", enter your Registration number: ");
        int input = scanner.nextInt();
        if (input == regNo) {
            System.out.println("Hello! Welcome back.");
        } else {
            System.out.println("Incorrect Registration number, try again!");
        }
    }

    void takeCourse() {
        System.out.println("Hi" + name + ", What course are you taking?");
        String input = scanner.nextLine();
        System.out.println("Alright, enjoy your lecture!");

    }
}
