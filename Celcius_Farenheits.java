
import java.util.Scanner;

public class Celcius_Farenheits {
    public static void main (String [] Args){

        Scanner userInput = new Scanner(System.in);
        float celcius = 0f;

        System.out.println("Enter a temperature");

        celcius = userInput.nextFloat();
        System.out.println((1.8f * celcius) + 32);
    }
}
