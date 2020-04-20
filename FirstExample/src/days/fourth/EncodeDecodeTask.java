package days.fourth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Simona Lukoseviciute
 */
public class EncodeDecodeTask {

    private static Map<Integer, String> encode = new HashMap<>();

    public static void main(String[] args) {
        readCode();// fill map with parameters

        List<Integer> letters = readLetter();
        // combine new string into one from separate items
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer l : letters){
            String value = encode.get(l);
            if(value != null){
                stringBuilder.append(value.equals("tarpas") ? " " : value);
            }
        }
        // convert StringBuilder to string and print
        System.out.println(stringBuilder.toString());

    }
    private static List<Integer> readLetter(){
        List<Integer> numbers = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader("laiskas.txt"))){
            String line;
            while ((line = bf.readLine()) != null) {
                // split text line by space
                String[] items = line.split(" ");
                // add elements to list
                for (String item : items){
                   numbers.add(Integer.valueOf(item));
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());

        }
        return numbers;
    }

    private static void readCode(){
        //read file form rood directory
        // try() using for close stream in any case
        // getMessage() - nurodo kokia tiksli klaida
        try(BufferedReader bf = new BufferedReader(new FileReader("koduote.txt"))) {


            String line;
            //read line by line
            while ((line = bf.readLine()) != null){
                // split line by space
                String[] items = line.split(" ");
                //Integer.valueOf convert String to Integer
                encode.put(Integer.valueOf(items[0]), items[1]);

            }
        }catch (IOException e){
            System.out.println("Klaida nuskaitant faila " + e.getMessage());
        }

    }
}
