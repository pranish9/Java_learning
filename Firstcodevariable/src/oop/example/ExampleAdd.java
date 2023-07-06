package oop.example;

public class ExampleAdd {
    int add(){
        System.out.println("empty");
        return 0;
    }
    int add(int a){
        int sum = 0;
        sum+=a;
        return sum;
    }
    int add(int a , int b){
        int sum = 0;
        sum=a+b;
        return sum;
    }
    double add(double a, double b){
        double sum = 0;
        sum= a + b;
        return sum;
    }
    double add(double a, int b){
        double sum = 0;
        sum= a + b;
        return sum;
    }
    double add(int a, double b){
        double sum = 0;
        sum= a + b;
        return sum;
    }

}

