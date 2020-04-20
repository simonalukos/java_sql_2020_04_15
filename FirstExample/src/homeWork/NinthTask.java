package homeWork;

import java.util.Scanner;

/**
 * @author Simona Lukoseviciute
 */
public class NinthTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu.");
        int x = scanner.nextInt();

        countResult(x);

    }
    private static void countResult(int x){
        int count = 0;
        if(x >= 0){
            count = 2 * x + 8;
            System.out.println("Funkcijos f(x)=2x+8 reiksme: " + count);
        }
        else if(x != 0){
            count = 21 - 7 * x;
            System.out.println("Funkcijos  f(x)=21-7x reiksme: " + count);
        }
    }
}
