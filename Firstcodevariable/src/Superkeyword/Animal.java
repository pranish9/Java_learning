package Superkeyword;

public class Animal {
    String name = "Virinchi";
    void getName(){
        System.out.println(" this is Animal class");
    }
}
 class HumanBeing extends Animal{
    String name = "your name";
   void getName(){
       System.out.println(super.name);
       super.getName();
   }
}
class Test{
    public static void main(String[] args) {
        HumanBeing h = new HumanBeing();

        h.getName();

    }
}
