package ConstructorExp;

public class ConstructorExample {
    public ConstructorExample(){
        System.out.println("Non parameterized Constructor");

    }
    public ConstructorExample(String name){
        System.out.println("parameterized constructor");
    }


    public void getName(){
        System.out.println("Virinchi");
    }

    public void getName(String name){
        System.out.println("VIRINCHI2");
    }
    public static void main(String[] args) {
        ConstructorExample e1 = new ConstructorExample();
        ConstructorExample e2 = new ConstructorExample("ram");
            e1.getName();
            e2.getName("sita");
    }
}
