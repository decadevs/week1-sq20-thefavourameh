package School;

import java.util.Scanner;

public class Principal extends Staff implements Department{
    public Principal(int staffId, String name) {
        super(staffId, name);
    }
    int applicantAge;

    //Implementing login method from Department
    public void login() {
        System.out.println("Enter your Staff ID");
        int input = scanner.nextInt();
        if (input == staffId) {
            System.out.println("Hello Principal! Welcome back.");
        } else {
            System.out.println("Incorrect ID number");
        }
    }

    void expelStudents() {
        System.out.println("How many times has the Student defaulted?");
        int input = scanner.nextInt();
        if (input >= 5) {
            System.out.println("Expel the Student for misconduct.");
        } else {
            System.out.println("Punish the Student but do not expel him/her.");
        }
    }

        void admitApplicants() {
            System.out.println("What is the age of the applicant?");
            int input = scanner.nextInt();
            if (applicantAge < 18) {
                System.out.println("Applicant is less than 18 and is not eligible to be admitted");
            } else {
                System.out.println("Applicant is eligible for admission");
            }

        }
    }