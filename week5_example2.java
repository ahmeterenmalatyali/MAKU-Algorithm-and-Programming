/*
Üniversite not hesaplama
Adım 1:Başlat
Adım 2:0 ile 100 arasında vize  notu gir
Adım 3:0 ile 100 arasında final notu gir
Adım 4:vize=(vize*40)/100
Adım 5:final=(final*60)/100
Adım 6:ortalama=final+vize
Adım 7:Eğer ortalama 0-49 ise yaz D
Adım 8:Eğer ortalama 50-59 ise yaz C
Adım 9:Eğer ortalama 60-79 ise yaz B
Adım 10:Eğer ortalama 80-100 ise yaz A
Adım 11:Yaz ortalama
Adım 12:Bitir
*/
import java.util.Scanner;
public class week5_example2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double v;
        do {
            System.out.print("Lütfen Vize sınavı sonucunu giriniz: ");
            v=input.nextInt();
        } while (0>v || 100<v);
        double f;
        do {
            System.out.print("Lütfen Final sınavı sonucunu giriniz: ");
            f=input.nextInt();
        } while (0>f || 100<f);
        f=(f*3)/5;
        v=(v*2)/5;
        double Ort =(double)(f + v);
        System.out.println("Ortalamanız: "+Ort);
        if (Ort>=0 && Ort<50) {
            System.out.println("Notunuz:D");
        }
        else if (Ort>=50 && Ort<60) {
            System.out.println("Notunuz:C");
        }
        else if (Ort>=60 && Ort<80) {
            System.out.println("Notunuz:B");
        }
        else{
            System.out.println("Notunuz:A");
        }
    }
    
}
