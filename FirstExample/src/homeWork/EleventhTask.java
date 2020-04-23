package homeWork;

import java.util.Scanner;

/**
 * @author Simona Lukoseviciute
 */
public class EleventhTask {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        String word;

        System.out.println("Irasykite zodi.");
        int count = countLetters(scanner.nextLine(), "ab");


        System.out.println("Rasta raidziu zodyje " + count);


    }
    private static int countLetters(String word, String  letters){

        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            if(letters.charAt(0) == word.charAt(i) && word.length() >= i + 1 && word.charAt(i + 1) == letters.charAt(1)) {
                count++;
            }
        }

        return count;
    }
}
