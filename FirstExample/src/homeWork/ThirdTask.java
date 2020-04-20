package homeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Simona Lukoseviciute
 */
public class ThirdTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FirstTask example3 = new FirstTask();

        writeNumbersUntilIts0(sc);

    }
    private static void writeNumbersUntilIts0(Scanner sc) {
        int skaicius = 0;
        int suma = 0;
        do{
            System.out.println("Iveskite skaiciu: ");
            skaicius = getCorrectNumber(sc);
            if(skaicius != 0){
                suma += skaicius;
            }
        }while(skaicius != 0);
        System.out.println("Visu ivestu skaiciu suma yra: "+ suma);

    }
    private static int getCorrectNumber(Scanner sc){
        while(true){
            try {
                int number = sc.nextInt();
                return number;
            } catch (InputMismatchException ex) {
                System.out.println("Ïvedete bloga skaiciu, pakartokite.");
                sc.nextLine();
            }
        }
    }
}

