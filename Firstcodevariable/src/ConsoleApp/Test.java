package ConsoleApp;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService ss = new StudentServiceImpl();
        //======================= Add Student ===============
        char flag = 'y';
        do{
            Student s = new Student();
            System.out.println("Enter Student Id: ");
            s.setId(sc.nextInt());

            System.out.println("Enter Student First Name: ");
            s.setfName(sc.nextLine());

            System.out.println("Enter Student Last Name: ");
            s.setlName(sc.nextLine());

            System.out.println("Enter Student Age: ");
            s.setAge(sc.nextInt());

            System.out.println("Enter Student Age: ");
            s.setCollage(sc.nextLine());

            System.out.println("Enter Student Age: ");
            s.setFaculty(sc.nextLine());

            ss.addStudent(s);
            System.out.println("Do you want to Continue [y/n]");
            flag = sc.next().charAt(0);
        } while( flag == 'y');
        //====================== get All Student ========================
        List<Student> sList = ss.getAllStudent();
        System.out.println(sList.toString());


    }
}
