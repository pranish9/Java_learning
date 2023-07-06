package oop.example;

public class ExampleAddOutput {
    public static void main(String[] args) {
        ExampleAdd ad = new ExampleAdd();
        System.out.println(ad.add());
        System.out.println(ad.add(1));
        System.out.println(ad.add(2,5));
        System.out.println(ad.add(2.5,3.5));
    }
}
