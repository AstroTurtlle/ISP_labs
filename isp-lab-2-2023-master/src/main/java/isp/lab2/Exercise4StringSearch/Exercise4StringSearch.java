package isp.lab2.Exercise4StringSearch;

import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {
        String[] input_words = input.split(",");
        String[] result = new String[input_words.length];
        int i=0;
        for(String j : input_words)
            if(j.contains(substring)) result[i++] = j;
        String[] final_result = new String[i];
        System.arraycopy(result, 0, final_result, 0, i);
        return final_result;
    }

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = readFromConsoleInt();
        String substring = readFromConsoleInt();
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
