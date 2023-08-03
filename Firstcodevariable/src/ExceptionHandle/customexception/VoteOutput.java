package ExceptionHandle.customexception;

public class VoteOutput {
    public static void main(String[] args) {
        Vote v =new Vote();
        try{
            v.eligibilityToVote(17);
        } catch (InvalidAgeException a){
            System.out.println(" Not eligible");
      }
    }
}
