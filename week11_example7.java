/*
Klavyeden büyük harflerle girilen kelimenin bir baştan bir sondan harf alarak yazan program
 */
import java.util.Scanner;
public class week11_example7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen büyük harflerle bir ifade giriniz: ");
        String txt = input.nextLine();
        for (int i = 0; i < txt.length()/2; i++) {
            System.out.print(Character.toLowerCase(txt.charAt(i)));
            System.out.print(Character.toLowerCase(txt.charAt(txt.length()-1-i)));
        }
        if(txt.length()%2==1){
            System.out.print(Character.toLowerCase(Character.toLowerCase(txt.charAt(txt.length()/2))));
        }
    }
    
}
