package oop.Interfaceexample.multipleinheritance;

public class Vechile implements Cycle, Bike{
@Override
public void run(){
    System.out.println("VBIke is running");
}

    @Override
    public void speed() {
        System.out.println("speed is more than 100km");

    }

    @Override
    public void color() {
        System.out.println("Color is red");
    }

}
