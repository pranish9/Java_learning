package statickeywords;

import java.util.Scanner;

public class StaticOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number two number::: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(StaticExample.getAreaOfCube(a,b));
    }

}
