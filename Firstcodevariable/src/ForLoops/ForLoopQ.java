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
    public void WhileLoopques(){
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
    public void multi(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number mwant the multiplication of");
        int n = sc.nextInt();
        int i = 0;

        while (i < 10) {
            int muti = i * n;
            System.out.println(i +" *" + n +" ="+ muti );
            i++;
        }
    }
    public void displayBreak(){
        for (int i = 0; i < 10; i++){
            if (i == 4){
                continue;
            }
        if (i == 5) {
            break;
        }
            System.out.println(i);
                }
    }
    public double areaOfCircle(){
        double pi =3.14;
        int r = 2;
        return pi*(r*r);

    }
    public float areaOfRectangle(){
       float l =15.4f;
        float b = 34.34f;
        return l *b;

    }
    public int multiPli(){
        int i = 77, j = 234;
        return i *j;

    }
    public String Stringre(){
        Scanner si = new Scanner(System.in);
        System.out.println("what is your name");
        String name = si.nextLine();
        return name;

    }
}
