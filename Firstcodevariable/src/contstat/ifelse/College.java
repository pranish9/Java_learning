package contstat.ifelse;

public class College {
    public int getMarks(){
        int mathmarks = 50;
        int scienceMarks = 40;
        if (mathmarks > 50 && scienceMarks > 50){
            System.out.println("A");
        }
        else if (mathmarks > 40 && scienceMarks > 30){
            System.out.println("B");
        }
        return mathmarks + scienceMarks;
    }
}
