/*
Çarpma kullanmadan çarpmak
Adım 1:Başlat
Adım 2:Klavyeden a x b için a gir
Adım 3:Klavyeden b gir
Adım 4:k=1
Adım 5:T=a
Adım 6:k>b ise git adım 10
Adım 7:T=T+a
Adım 8:k=k+1
Adım 9:Git adım 6
Adım 10:Yaz T
Adım 11:Bitir
*/
package homeworks;
import java.util.Scanner;
public class no_times {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   System.out.println("Lütfen axb için a'yı giriniz");
   int a = input.nextInt();
   System.out.println("Lütfen b yi giriniz");
   int b = input.nextInt();
   int T = 0;
   int k = 1;
        if (a==0 || b==0) {
            System.out.println("0");           
        }
        if(a<0 && b>0) {
            while (k<=b){
       T = T + a;
       k = 1 + k ;  
   }
   System.out.println("axb="+T);            
        }
    if(a>0 && b<0)  {
     while (k<=a){
       T = T + b;
       k = 1 + k ;  
   }
   System.out.println("axb="+T);               
    }
    if(a>0 && b>0) {
   while (k<=b){
       T = T + a;
       k = 1 + k ;  
   }
        
   System.out.println("axb="+T);
        }
        if (a<0 && b<0) {
            while (k<=-b){
       T = T + a;
       k = 1 + k ;  
   }
   System.out.println("axb="+-T);            
            
        }
    }
    
}
