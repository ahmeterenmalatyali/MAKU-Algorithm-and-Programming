/*
Çarpım tablosu
*/
import java.util.Scanner;
public class week5_example4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //dışarıdaki for'un her i değeri için j, 10'a kadar çalışır  
        for (int i = 1; i < 10; i++) {
            System.out.println(+i+" ile çarpımları:");
            for (int j = 1; j <= 10; j++) {
                System.out.println(+i+"x"+j+"="+i*j);
            }
       }
    }
    
}
