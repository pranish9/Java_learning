package oop.Interfaceexample;

public class Tata implements Car {
    @Override
    public void mileage() {
        System.out.println("Mileage of car is 832km/hr");
    }
    @Override
    public void speed(){
        System.out.println("speed of the car is 78km/hr");
    }
}
