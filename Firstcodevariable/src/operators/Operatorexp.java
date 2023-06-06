package operators;

public class Operatorexp {
    int num1 = 20;
    int num2 = 10;

    public void Arthimat () {
        int store = num1 + num2;
        System.out.println(store);
        System.out.println("addition "+ num1 + " and "+ num2 + " = "+(num1 + num2) );
    }

    public void assign(){
        int num1 = 1;
        int num2 = 3;

        num1 += num2;
        System.out.println("addition of num1 and num2 is" +num1);
        num2 *= num1;
        System.out.println("multiplication " +num2);
    }
    public void compar(){
        int i = 10;
        if ( i == 10){
            System.out.println("i = 10");
        }

    }
    public void logi(){
        int i = 10;
        int a = 20;
        if (i < a && 20 >= a){
            System.out.println("hence then a = 20 and i = 10");
        }
    }
}
