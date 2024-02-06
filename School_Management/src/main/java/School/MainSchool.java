package School;

public class MainSchool {
    public static void main(String[] args) {
        //Creating objects of Principal
        Principal p1 = new Principal(1, "Ola Seun");
        //p1.login();
        //p1.expelStudents();
        //p1.admitApplicants();

        //Creating objects of Teachers
        Teachers t1 = new Teachers(3,"Musa Umar");
        Teachers t2 = new Teachers(4,"Chisom Kanu");
        Teachers t3 = new Teachers(2, "Peter John");
        //t1.login();
        //t1.teachCourse();
        //t2.login();
        //t2.teachCourse();
        //t3.login();
        //t3.teachCourse();

        //Creating objects of Non-Academic staff
        Non_academicStaff a1 = new Non_academicStaff(7, "Ene Agbo");
        Non_academicStaff a2 = new Non_academicStaff(5, "Samuel Chidi");
        Non_academicStaff a3 = new Non_academicStaff(8, "Esther Nelson");
        //a1.jobRole();
        //a1.login();
        //a2.jobRole();
        //a2.login();
        //a3.jobRole();
        //a3.login();

        //Creating objects of Students
        Students s1 = new Students(24,"Peter Bola");
        Students s2 = new Students(32, "Great Smart");
        Students s3 = new Students(46, "Glory Samuel");
        //s1.login();
        //s1.takeCourse();
        //s2.login();
        //s2.takeCourse();
        //s3.login();
        //s3.takeCourse();

        //Creating objects of Courses
        Courses co1 = new Courses();
        //co1.count();

        //Creating objects of Classes
       Classes cl1 = new Classes(23, "Abdul Rahman");
       Classes cl2 = new Classes(32, "Great Smart");
       Classes cl3 = new Classes(46,"Glory Samuel");
      // cl1.classEntry();
      // cl2.classEntry();
       //cl3.classEntry();

        //Creating objects of Applicants
        Applicants app1 = new Applicants(20);
        Applicants app2 = new Applicants(16);
        Applicants app3 = new Applicants(22);
        //app1.apply();
        //app2.apply();
        //app3.apply();

    }
}

