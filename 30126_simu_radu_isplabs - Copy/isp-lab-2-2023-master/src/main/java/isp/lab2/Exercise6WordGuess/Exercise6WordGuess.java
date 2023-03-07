package isp.lab2.Exercise6WordGuess;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     * @param c
     * @param word
     * @return
     */
    public static String selectRandomWord() throws FileNotFoundException {
        Random random = new Random();
        int word_number = random.nextInt(10);
        int i = 0;
        File MyFile = new File("C:\\ISP\\Laboratoare\\30126_simu_radu_isplabs\\isp-lab-2-2023-master\\src\\main\\java\\isp\\lab2\\Exercise6WordGuess\\words.txt");
        Scanner scanner = new Scanner(MyFile);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            if(i == word_number) {
                return data;
            }
            i++;
        }
        return null;
    }
    public static int countOccurence(char c, char[] word) {
        int nr = 0;
        for(char j : word) {
            if(j == c) {
                nr++;
            }
        }
        return nr;
    }

    public static String readFromConsoleLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter guess: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) throws FileNotFoundException {
        String game_word = selectRandomWord();
        System.out.println(game_word);
        int remaining_letters = game_word.length(), numberOfTries = 0;
        while(remaining_letters > 0) {
            System.out.println(countOccurence('a', game_word.toCharArray()));
        }
    }

}
