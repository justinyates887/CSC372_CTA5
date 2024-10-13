package src;

import java.util.Scanner;

public class RecursiveProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter a number, and then press enter (five total numbers):");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int product = calculateProduct(numbers, 5);
        
        System.out.println("The product of the numbers is: " + product);       
        scanner.close();
    }

    public static int calculateProduct(int[] numbers, int n) {
        if (n == 1) {
            return numbers[0]; // Base case
        } else {
            return numbers[n - 1] * calculateProduct(numbers, n - 1); // Recursive case
        }
    }
}
