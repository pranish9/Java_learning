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
    public void whichDay() {
        System.out.println("Enter the from 1 to 7");
       int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("input error");

        }
    }

    }

