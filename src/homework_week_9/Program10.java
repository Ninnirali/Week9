package homework_week_9;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Write the programme that tell you which line pass through particular stations.
 * Just use Zone 1 stations name
 */
public class Program10 {
    public static void main(String[] args) {
        HashMap<String,String> underGround = new HashMap<>();
        underGround.put("aldgate","Metropolitan \n"+"Circle");
        underGround.put("baker street","Metropolitan\n"+"Bakerloo\n"+"Circle\n");
        underGround.put("bank","Waterloo & City\n"+"Northern\n" +"Central");
        underGround.put("edgware Road","Hammersmith & City\n" +"District\n" +"Circle");
        underGround.put("marble arch","District\n" +"Bakerloo\n" +"Northern\n" +"Circle");
        underGround.put("euston","Northern\n" +"Victoria");
        underGround.put("elephant & castle","Northern\n" +"Bakerloo");
        underGround.put("embankment","District\n"+"CircleDistrict");



        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Station Name:");
        String stationName=obj.nextLine().toLowerCase();
        if (underGround.containsKey(stationName))
            System.out.println("Under Services: \n"+ underGround.get(stationName));
        else System.out.println("Station is temporary close");
    }
}


