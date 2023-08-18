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
            s.setfName(sc.next());

            System.out.println("Enter Student Last Name: ");
            s.setlName(sc.next());

            System.out.println("Enter Student Age: ");
            s.setAge(sc.nextInt());

            System.out.println("Enter Student Collage: ");
            s.setCollage(sc.next());

            System.out.println("Enter Student faculty: ");
            s.setFaculty(sc.next());

            ss.addStudent(s);
            System.out.println("Do you want to Continue [y/n]");
            flag = sc.next().charAt(0);
        } while(flag == 'y');
        //====================== get All Student ========================
        List<Student> sList = ss.getAllStudent();
        System.out.println(sList.toString());

        //============= Delete Student ==================
        System.out.println("Do you want to delte student [y/n]");
        char flag1 = 'y';
        flag1 = sc.next().charAt(0);
        if(flag1=='y'){
            System.out.println("Enter Index to delete");
            ss.deleteStudent(sc.nextInt());
//            ================= Get All Student ==================
            System.out.println("Student after the Deletation");
            System.out.println(ss.getAllStudent());
        }
    }
}
