package ForLoops;

import java.util.Scanner;

public class ForLoopQ {
    public void Loopa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String p = sc.nextLine();
        //print youir name  from  1 - 10 times
      for (int i =1 ; i <= 10; i++){
          System.out.println( i + " your name is" +p);
      }
    }
    public void palin(){
        int r,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number greater than 3 digit");
        int n = sc.nextInt();
        for (int i = n ; i > 0; ){
            r = i % 10;
            s = s * 10 + r;
            i = i /10;
        }
if (s == n)
    System.out.println("it is pallindrome");
 else
    System.out.println("it is not a pallin drome");
    }
    public void arm(){
        // arm strong number
        int r,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number greater than 3 digit");
        int n = sc.nextInt();
        for (int i = n ; i > 0; ){
            r = i % 10;
            s = s + r*r*r;
            i = i /10;
        }
        if (s == n)
            System.out.println("it is armstrong");
        else
            System.out.println("it is not a armstrong");

    }
}
