package TypeCast;

public class TypeCasting {
    int a = 5;

    public void wideningcast() {
        System.out.println("Before type casting from int to float ::: "+a);
        float b = a;
        System.out.println("after casting from int to float :::" + b);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        

    }

    public void narrowcasting() {
        float f = 5.2f;
        System.out.println("before casting from float to int :::"+f);
        int a = (int)f;
        System.out.println("after casting fr :::" + a);


    }
}
