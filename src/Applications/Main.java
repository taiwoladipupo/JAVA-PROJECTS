package Applications;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /* The user defines a whole range of numbers, the problem
            is to determine the mean/Average from a range of numbers
                   Determine the most occurring number
                    Determine the maximum number
                       Determine the minimum number */
        java.util.Scanner input = new Scanner(System.in);//imports the Scanner class
        System.out.print("Enter the number of items:");// Prompt the user to enter how many numbers are available

        int n = input.nextInt();//Allows user to be able to type in values/text.
        double [] numbers = new double [n];//creates the array
        double sum = 0;//Creates the double value sum which adds up the whole numbers
    }
}


