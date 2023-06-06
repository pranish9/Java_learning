package contstat.switchs;

public class College {

    public void Marko(){
        int marks = 60;
        switch (marks/2){
            case 30:
                System.out.println("fail");
                break;
            case 40:
                System.out.println("pass");
                break;
            case 60:
                System.out.println("A");
                break;
            default:
                System.out.println("absent");
        }}
    public void vowel(){
        String vo = "a";
        switch (vo){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("The string is vowel");
                break;
            default:
                System.out.println("the string is consonant");
        }
    }
}
