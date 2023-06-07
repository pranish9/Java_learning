package contdstat.ifelse.Scanner;

import java.util.Scanner;

public class inpu {
    //input syntax in java
    Scanner sc = new Scanner(System.in);
    public void getStudentGrade(){
        System.out.println("Enter math markd");
        int mathMarks = sc.nextInt();
        System.out.println("enter Science Marks");
        int scienceMarks = sc.nextInt();
        //control D to repeat and dublicate
        if(mathMarks >= 80 && scienceMarks >= 88){
            System.out.println("Distinction.....");
        }else if(mathMarks>=60 && scienceMarks >= 60){
            System.out.println("First Division....");
        }else if(mathMarks>35 && scienceMarks > 35){
            System.out.println("Pass....");
        }else {
            System.out.println("Fail.....");
        }
    }
}
