package homeWork;

import java.util.Scanner;

/**
 * @author Simona Lukoseviciute
 */
public class FifthTask {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Irasykite penkis zodzius.");
            System.out.println("Pirmas zodis: ");
            String a = scanner.nextLine();
            System.out.println("Antras zodis: ");
            String b = scanner.nextLine();
            System.out.println("Trecias zodis: ");
            String c = scanner.nextLine();
            System.out.println("Ketvirtas zodis: ");
            String d = scanner.nextLine();
            System.out.println("Penktas zodis: ");
            String e = scanner.nextLine();

            showTheWords(a, b, c, d, e);

        }
        private static void showTheWords(String a, String b, String c, String d, String e){
            System.out.println(String.format("Jusu ivesti zodziai: %s, %s, %s, %s, %s.", a, b, c, d, e));
        }
}

