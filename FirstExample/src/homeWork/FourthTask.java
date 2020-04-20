package homeWork;

import java.util.Scanner;

/**
 * @author Simona Lukoseviciute
 */
public class FourthTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite penkis skaicius.");
        System.out.println("Pirmas skaicius: ");
        int a = scanner.nextInt();
        System.out.println("Antras skaicius: ");
        int b = scanner.nextInt();
        System.out.println("Trecias skaicius: ");
        int c = scanner.nextInt();
        System.out.println("Ketvirtas skaicius: ");
        int d = scanner.nextInt();
        System.out.println("Penktas skaicius: ");
        int e = scanner.nextInt();

        allNumbers(a, b, c, d, e);
        numbersSum(a, b, c, d, e);
    }
    private static void allNumbers(int a, int b, int c, int d, int e){

        System.out.println("Jusu ivesti skaiciai:  " + a + " " + b + " " + c + " " + d + " " + e);
    }
    private static void numbersSum(int a, int b, int c, int d, int e){

        System.out.println("Skaiciu suma =  " + (a + b + c + d + e));
    }
}
