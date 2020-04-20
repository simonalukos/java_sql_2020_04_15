package homeWork;

import java.util.Scanner;

/**
 * @author Simona Lukoseviciute
 */
public class FirstTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int skaicius;

        System.out.println("Ïveskite norima skaiciu");
        skaicius = sc.nextInt();

        checkNumber(skaicius);
    }
    private static void checkNumber(int skaicius) {
        if (skaicius % 2 == 0) {
            System.out.println("Jusu ivestas skaicius yra lyginis");
        } else if (skaicius % 2 != 0) {
            System.out.println("Jusu ivestas skaicius yra nelyginis");
        }
    }
}

