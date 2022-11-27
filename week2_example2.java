/*
fahrenheit'ı celcius'a dönüştürme
*/
import java.util.Scanner;
public class week2_example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fahrenheit derecesini giriniz:");
        double fahrenheit = input.nextDouble(); //Adım 2
        double celcius = (fahrenheit-32) / 1.8; //Adım 3
        System.out.println("Hesaplanan celcius: "+celcius); //Adım 4
    }
    
}
