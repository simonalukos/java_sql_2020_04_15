package days.second;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Simona Lukoseviciute
 */

public class FirstTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FirstTask firstTask = new FirstTask();

        int selection = 0;
        while(selection != 5)
        {
            System.out.println("1. Staciojo trikampio plotas\n2. Staciakampio plotas\n3. Kvadrato plotas\n4. Apskritimo plotas\n5. Baigti");
            selection = (int) NumberUtils.getCorrectNumber(scanner);
            switch (selection) {
                case 1:
                    firstTask.countTriangle(scanner);
                    break;
                case 2:
                    firstTask.countRectangle(scanner);
                    break;
                case 3:
                    firstTask.countSquare(scanner);
                    break;
                case 4:
                    firstTask.countCircle(scanner);
                    break;
                case 5:
                    System.out.println("Viso gero!");
                    break;
                default:
                    System.out.println("Tokio veiksmo nera!");
            }
        }
    }
    private void countTriangle(Scanner scanner) {
        System.out.println("Iveskite pirma statini: ");
        int a = (int) NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite antra statini: ");
        int b = (int) NumberUtils.getCorrectNumber(scanner);
        System.out.println("Trikampio plotas yra " + a * b / 2);
    }
    private void countRectangle(Scanner scanner) {
        System.out.println("Iveskite pirma krastine: ");
        int a = (int) NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite antra krastine: ");
        int b = (int) NumberUtils.getCorrectNumber(scanner);
        System.out.println("Staciakampio plotas yra " + a * b);
    }
    private void countSquare(Scanner scanner) {
        System.out.println("Iveskite krastines ilgi: ");
        int a = (int) NumberUtils.getCorrectNumber(scanner);
        System.out.println("Kvadrato plotas yra " + a * 2);
    }
    private void countCircle(Scanner scanner) {
        System.out.println("Iveskite spinduli");
        double r = NumberUtils.getCorrectNumber(scanner);
        DecimalFormat df = new DecimalFormat("0.00");
        double pi = 3.1415;
        System.out.println("Apskirtimo plotas " + df.format(Math.pow(r, 2) * pi));
    }

}
