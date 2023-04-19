package isp.lab2.Exercise6WordGuess;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.fill;

public class Exercise6WordGuess {

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

    public static char readFromConsoleLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter guess: ");
        String guess = scanner.nextLine();
        char characterForGuessing = guess.toCharArray()[0];
        return characterForGuessing;
    }

    public static void main(String[] args) throws FileNotFoundException {
        char[] game_word = selectRandomWord().toCharArray();
        int remaining_letters = game_word.length, numberOfTries = 0;
        char[] guessed_word = new char[remaining_letters];
        Arrays.fill(guessed_word, '_'); //Marcam literele neghicite
        while(remaining_letters > 0) {
            char guessed_letter = readFromConsoleLetter();
            remaining_letters = remaining_letters - countOccurence(guessed_letter, game_word);
            for(int i=0;i<game_word.length;i++)
                if(game_word[i] == guessed_letter) guessed_word[i] = guessed_letter;
            System.out.printf("Incercarea %d: %s\n", ++numberOfTries, String.valueOf(guessed_word));
        }
        System.out.printf("Cuvantul a fost: %s\nA fost ghicit din %d incercari.", String.valueOf(game_word), numberOfTries);
    }

}
