/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class week11_example5_v2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen küçük harflerle bir ifade giriniz: ");
        String txt = input.nextLine();
        char[] sesli ={'a','e','i','u','o'};
        int[] yer =new int[255];
        int sayac=0;
        for (int i = 0; i < txt.length(); i++) {
            char h=Character.toLowerCase(txt.charAt(i));
            for (int j = 0; j < sesli.length; j++) {
                if (sesli[j]==h) {                    
                    yer[sayac]=i;
                    sayac++;
                }
            }
        }
        for (int i = 0; i < sayac; i++) {
            System.out.print(+yer[i]+", ");
        }
        System.out.println("\n"+sayac+" tane sesli harf vardır.");
    }
    
}
