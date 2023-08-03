package ExceptionHandle;

public class ExceptionExp {
    public void getNumber() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        try {
            System.out.println(100 / 0); //exception
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Number cannot be divided");
        }

        System.out.println("5");
    }
    public void displayAge(int age) throws ArithmeticException{
        if(age < 20){
            throw new ArithmeticException("teen age");
        }else{
            System.out.println("Good to go....");
        }
    }
}

