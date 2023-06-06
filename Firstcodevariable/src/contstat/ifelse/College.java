package contstat.ifelse;

public class College {
    public int getMarks(){
        int mathmarks = 50;
        int scienceMarks = 40;
        if (mathmarks > 50 && scienceMarks > 50){
            System.out.println("A");
        }
        return mathmarks;
    }
}
