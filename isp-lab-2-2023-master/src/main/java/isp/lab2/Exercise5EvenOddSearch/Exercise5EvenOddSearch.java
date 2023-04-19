package isp.lab2.Exercise5EvenOddSearch;

import java.util.Scanner;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        String[] numbers = input.split(",");
        int[] result = {0, -1, 999, -1};
        for (int i = 0; i < numbers.length; i++) {
            int auxiliary = Integer.parseInt(numbers[i]);
            if (auxiliary % 2 == 0 && auxiliary > result[0]) {
                result[0] = auxiliary;
                result[1] = i;
            }
            if (auxiliary % 2 == 1 && auxiliary < result[2]) {
                result[2] = auxiliary;
                result[3] = i;
            }
        }
        return result;
    }

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = readFromConsoleInt();
        int[] result = findEvenOdd(input);
        if (result[1] != -1 && result[3] != -1)
            for (int i : result)
                System.out.println(i);
        if (result[1] == -1) System.out.println("There are no even numbers");
        if (result[3] == -1) System.out.println("There are no odd numbers");
    }
}
