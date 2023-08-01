package Basic;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        //psvm



                // arm strong number
                int r,s=0;
                Scanner sc = new Scanner(System.in);
                System.out.println("enter any number greater than 3 digit");
                int n = sc.nextInt();
                int i = n;
                while(i != 0){
                    r = i % 10;
                    s = s * 10 + r;
                    i = i /10;
                }
                if (s == n)
                    System.out.println("it is pallindrome");
                else
                    System.out.println("it is not a pallin drome");
            }
        }
