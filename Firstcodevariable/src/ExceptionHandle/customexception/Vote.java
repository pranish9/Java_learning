package ExceptionHandle.customexception;

public class Vote {
    public void eligibilityToVote(int age) throws InvalidAgeException{

if(age < 18){
    System.out.println("cannot vote");
} else {
    System.out.println("Eligible for voting ");
}
    }
}
