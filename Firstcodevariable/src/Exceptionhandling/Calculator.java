package Exceptionhandling;

public class Calculator {
    public void getNumber(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        try{
            System.out.println(100/0); //exception
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Number cannot be divided");
        }

        System.out.println("5");
    }
}
