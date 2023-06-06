package TypeCast;

public class TypeCasting {
    int a = 5;
    short c = 5;

    public void wideningcast() {
        System.out.println("Before type casting from int to float ::: "+a);
        int a = 5;
        float b = a;
        System.out.println("after casting from int to float :::" + b);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Before type casting from short to int ::: "+c);
        int d = c;
        System.out.println("after casting from short to int :::" + d);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Before type casting from int to long ::: "+d);
        float e = d;
        System.out.println("after casting from int to float :::" + e);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
    }

    public void narrowcasting() {
        float f = 5.2f;
        System.out.println("before casting from float to int :::"+f);
        int a = (int)f;
        System.out.println("after casting fr :::" + a);


    }
}
