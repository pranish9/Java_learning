package contdstat.ifelse;

import java.util.Scanner;

public class Ifelse {
    public int getMarks(){
        int mathmarks = 50;
        int scienceMarks = 40;
        if (mathmarks > 50 && scienceMarks < 50){
            System.out.println("A");
        }
        else if (scienceMarks > 30){
            System.out.println("B");
        }

        return mathmarks + scienceMarks;
    }
    public void times(){
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}
