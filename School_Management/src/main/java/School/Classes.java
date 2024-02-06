package School;

import java.util.Scanner;

public class Classes extends Students {

    public Classes(int regNo, String name) {
        super(regNo, name);
    }

    void classEntry() {
        System.out.println("Hi " + name + ", enter your Registration number: ");
        int input = scanner.nextInt();
        if (input == regNo) {
            System.out.println("Welcome your class begins soon!");
        } else
            System.out.println("Incorrect Registration number, you cannot access the class.");
        }
    }





