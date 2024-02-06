package School;

import java.util.Scanner;

public abstract class Staff {
    int staffId;
    String name;
    Scanner scanner = new Scanner(System.in);

    public Staff(int staffId, String name) {
        this.staffId = staffId;
        this.name = name;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

