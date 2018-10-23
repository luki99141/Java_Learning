
import java.util.Scanner;

public class Celcius_Farenheits {


    public static void main (String [] Args){

        Scanner userInput = new Scanner(System.in);
        float celcius = 0f;


        System.out.println("Enter a temperature");

        //Set temperature value to a printed number
        celcius = userInput.nextFloat();

        //Print out calculated temperature
        System.out.println(calculateTemp(celcius));

    }

    //Calculate temperature in celcius to farenheit
    private static float calculateTemp(float _celcius){

        //Calculate celcius to farenheit
         float _farenheit = (1.8f * _celcius) + 32;
         return _farenheit;
    }
}
