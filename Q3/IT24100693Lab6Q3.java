import java.util.ArrayList;
import java.util.Scanner;

public class IT24100693Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sumOfSquares = 0;
        int count = 0;
        
        System.out.println("Enter positive numbers (terminate with -99):");
        while (true) {
            System.out.println("Enter a Number :");
            int number = scanner.nextInt();
            if (number == -99) break;
            if (number < 0) {
                System.out.println("Negative numbers are not allowed. Please enter a positive number.");
                continue;
            }
            numbers.add(number);
            sumOfSquares += Math.pow(number, 2);
            count++;
        }
        
        if (count > 0) {
            double rms = Math.sqrt((double) sumOfSquares / count);
            System.out.println("Root Mean Square: " + rms);
        } else {
            System.out.println("No numbers were entered.");
        }
        
        scanner.close();
    }
}