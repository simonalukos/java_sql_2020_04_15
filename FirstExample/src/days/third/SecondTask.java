package days.third;

import days.second.NumberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Simona Lukoseviciute
 */
public class SecondTask {

    private double km;
    private double sanaudos;

    public static void main(String[] args) {

        SecondTask secondTask = new SecondTask();
        secondTask.countSanaudos();
        DecimalFormat decimalFormat = new DecimalFormat("00.00");
        System.out.println("Automobilis 100 km. kuro vidutiniskai sunaudoja: " + decimalFormat.format(secondTask.average()));

    }
    private void countSanaudos(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotus kilometrus.");
        km = NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite kuro sanaudas.");
        sanaudos = NumberUtils.getCorrectNumber(scanner);

    }
    private double average(){
        return (sanaudos *100)/ km;
    }

}
