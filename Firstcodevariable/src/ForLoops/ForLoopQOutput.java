package ForLoops;

import java.util.Scanner;

public class ForLoopQOutput {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1: Print your name 10 times\n2: palindrome number in java\n3: armstrong number\n4: whileloop 1 to 5\n5: multiplication of any number\n6:break and continue used in this\n7: area of circle");
            System.out.println("enter which lopp do you want to run");
            int n = sc.nextInt();
            ForLoopQ loop = new ForLoopQ();
switch (n){
    case 1:
        loop.Loopa();
        break;
    case 2:
        loop.palin();
        break;
    case 3:
        loop.arm();
        break;
    case 4:
        loop.WhileLoopques();
        break;
    case 5:
        loop.multi();
        break;
    case 6 :
        loop.displayBreak();
        break;
    default:
        System.out.println("invalid number");
}


        }
}
