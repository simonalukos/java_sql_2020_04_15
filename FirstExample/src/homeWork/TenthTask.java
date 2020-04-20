package homeWork;

import java.util.Scanner;

/**
 * @author Simona Lukoseviciute
 */
public class TenthTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;

        System.out.println("Irasykite zodi, kuriame yra raidziu 'a'.");
        word = scanner.nextLine();

        System.out.println("A raidziu zodyje yra: " + checkWordHasLetterA(word, 'a'));

    }

    private static int checkWordHasLetterA(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (letter == word.charAt(i)) {
                count++;
            } else {
                count = 0;
            }
        }
        return count;
    }
}