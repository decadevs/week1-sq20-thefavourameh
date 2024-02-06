package School;

import java.util.Scanner;

public class Applicants {
    int applicantAge;

    Scanner scanner = new Scanner(System.in);

    public Applicants(int applicantAge) {
        this.applicantAge = applicantAge;
    }

    void apply() {
        System.out.println("How old are you?");
        int input = scanner.nextInt();
        if (input < 18) {
            System.out.println("You are ineligible for admission.");
        } else {
            System.out.println("You are eligible for admission.");
        }
    }
}




