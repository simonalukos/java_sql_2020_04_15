package homeWork;

import java.util.Scanner;

/**
 * @author Simona Lukoseviciute
 */
public class SecondTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int kiekis;

        System.out.println("Parasykite kiek noresite ivesti skaiciu.");
        kiekis = sc.nextInt();

        int[] skaiciai = new int[kiekis];


        for(int i = 0; i < skaiciai.length; i++){
            System.out.println(String.format("Skaicius: " + i));
            skaiciai[i] = sc.nextInt();
        }
        for(int i = 0; i < skaiciai.length; i++){
            if(skaiciai[i] > 100){
                System.out.println(skaiciai[i]);
            }
        }



    }


}
