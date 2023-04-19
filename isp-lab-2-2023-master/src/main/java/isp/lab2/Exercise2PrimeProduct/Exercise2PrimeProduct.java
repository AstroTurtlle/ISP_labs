package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    public static int isPrime(int n) {
        if(n%2 == 0 && n != 2) return 0;
        for(int i=3;i<=n/2;i=i+2)
            if(n%i==0) return 0;
        return 1;
    }
    /**
     * This method should return the product of the first n prime numbers
     * @param n
     * @param m
     * @return
     */
    public static long getPrimeProduct(int n, int m) {
        long product = 1;
        for(int i=n;i<=m;i++) {
            if(isPrime(i) == 1) product = product*i;
        }
        return product;
    }


    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt()));
    }

}
