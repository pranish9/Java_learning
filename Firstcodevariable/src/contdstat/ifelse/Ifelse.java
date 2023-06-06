package contdstat.ifelse;

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
}
