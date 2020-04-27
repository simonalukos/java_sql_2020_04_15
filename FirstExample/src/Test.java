import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Simona Lukoševičiūtė
 */
public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite du skaicius ir zenkla tarp ju pvz.: 2 + 2.");
        String line = scanner.nextLine();

        String[] chars =  line.split(" ");

        int firstNumber = (int) getCorrectNumber(scanner, chars [0]);
        int secondNumber = (int) getCorrectNumber(scanner, chars [2]);
        String action = chars [1];

        returnAction(firstNumber, secondNumber, scanner, action);
    }
    public static double getCorrectNumber(Scanner scanner){

        while(true) {
            try {
                double number = scanner.nextDouble();
                return number;
            } catch(InputMismatchException ex) {
                System.out.println("Ivedete bloga skaiciu. Pakartokite");
                scanner.nextLine();
            }
        }
    }
    public static double getCorrectNumber(Scanner scanner, String number) {
        try {
            return Integer.parseInt(number);
        }catch(NumberFormatException e){
            System.out.println("Ivedete bloga skaiciu teks pakartoti");
            return getCorrectNumber(scanner);
        }
    }

    public static int getSum(int firstNumber, int secondNumber){

        int sum = firstNumber + secondNumber;
        return sum;
    }
    public static int getMinus(int firstNumber, int secondNumber){

        int minus = firstNumber - secondNumber;
        return minus;
    }
    public static int getMultiply(int firstNumber, int secondNumber){

        int multiply = firstNumber * secondNumber;
        return  multiply;
    }
    public static double getDivision(int firstNumber, int secondNumber){

        DecimalFormat df = new DecimalFormat("0.00");
        double division = (double)firstNumber / secondNumber;
        return  division;
    }
    public static void returnAction(int firstNumber, int secondNumber, Scanner scanner, String action){

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        switch (action){

            case "+":
                System.out.println(firstNumber + " + " + secondNumber + " = " + getSum(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println(firstNumber + " - " + secondNumber + " = " + getMinus(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println(firstNumber + " * " + secondNumber + " = " + getMultiply(firstNumber, secondNumber));
                break;
            case "/":
                System.out.println(firstNumber + " / " + secondNumber + " = " + decimalFormat.format(getDivision(firstNumber, secondNumber)));
                break;
            default:
                System.out.println("Tokio veiksmo nera");
        }
    }
}
