import java.util.*;

public class DebugCode {
    public static void main(String[] args) {
        int high, low, count=0;
        final int NUM = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("This program displays " + NUM + " random numbers " + "\nbetween the low and high value you enter " + "\nEnter low value now...");
        low = input.nextInt();

        System.out.print("Enter high the value: ");
        high = input.nextInt();

        while (low < high) {
            System.out.println("The number you enter for a high number, " + high + " , is more than " + low);
            System.out.println("Enter a number higher than " + low + "...");
            high = input.nextInt();

            while (count < low) {
                double result = Math.random();
                int answer = (int) (result * 10 + low);
                if (answer <= high) {
                    System.out.println(answer + "");
                    ++count;
                }
            }
        }
        System.out.println("End of the program");
    }

}