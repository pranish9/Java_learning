package Arrays;
import java.util.Scanner;
public class ArrayExample {
    public void display() {
        int number[] = new int[10];
        number[0] = 1;
        number[1] = 5;
        number[2] = 10;
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

    public void plus() {
        int num[] = {1, 2, 3, 4};
        int sum = 0;
        //for (int i = 0;
        //sum += numbers[i];
        //}
        for (int i : num) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Sum of numbers[] : " + sum);
    }

    public void displayStringArray() {
        String stringArray[] = {"KIST", "NCCS", "VIRINCHO"};
        System.out.println("This is index1 value " + stringArray[1]);

        for (String s : stringArray) {
            System.out.println(s);
        }

        for (String s : stringArray) {
            if (s.equalsIgnoreCase("nccs")) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    public void multidimensionalArray() {
        String[][] array = {{"java", "C#", "C"},
                {"Python", "JS", "C++"}};
        System.out.println(array[0][0]);
        System.out.println(array[1][1]);
    }
    public void multiInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        sc.nextLine();
        String[][] multiArray = new String[rows][columns];

        System.out.println("Enter the elements of the array:");

        // Taking input from the user to populate the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("element[" +i+"]["+j+"]]=");
                multiArray[i][j] = sc.nextLine();
                
            }
        }

        // Using a for-each loop to iterate through the 2D array
        for (String[] row : multiArray) {
            for (String num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next row
        }

        sc.close(); // Close the scanner when done
    }

    }


