package homeWork;

/**
 * @author Simona Lukoseviciute
 */
public class SixthTask {

    public static void main(String[] args) {

        String[] skaiciai = new String[4];
        skaiciai[0] = "1";
        skaiciai[1] = "2";
        skaiciai[2] = "3";
        skaiciai[3] = "4";

        String[] raides =  new String[4];
        raides[0] = "a";
        raides[1] = "b";
        raides[2] = "c";
        raides[3] = "d";

        System.out.println(String.format("[%s]", returnNumbersLetters(skaiciai, raides)));
    }
    private static String returnNumbersLetters(String[] skaiciai, String[] raides){

        String count;
        count = skaiciai[0] + "," + raides[0] + "," + skaiciai[1] + "," + raides[1] + ","
                + skaiciai[2] + "," + raides[2] + "," + skaiciai[3] + "," + raides[3];
        return count;
    }
}