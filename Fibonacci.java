//Name: Andrea M. Donatos 
//Year & Section: DIT 2-1

//Assignment A:
 
package assignment1_2_andmore;

import java.util.Scanner;

public class FibonacciInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the Fibonacci series
        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Ask the user whether to display the series in numbers or words
        System.out.print("Do you want the Fibonacci series in numbers or words? (N/W): ");
        String choice = scanner.next().toUpperCase();

        // Generate the Fibonacci series
        int[] series = new int[n];
        series[0] = 0;
        if (n > 1) {
            series[1] = 1;
            for (int i = 2; i < n; i++) {
                series[i] = series[i - 1] + series[i - 2];
            }
        }

        // Display the Fibonacci series
        if (choice.equals("N")) {
            System.out.println("Fibonacci Series in Numbers:");
            for (int num : series) {
                System.out.print(num + " ");
            }
        } else if (choice.equals("W")) {
            NumberWords numberWords = new NumberWords();
            System.out.println("Fibonacci Series in Words:");
            for (int num : series) {
                System.out.print(numberWords.convertToWords(num) + " ");
            }
        } else {
            System.out.println("Invalid choice. Please choose 'N' for numbers or 'W' for words.");
        }
    }
}
