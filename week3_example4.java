/*
1 den 5 e kadar olan sayıların toplamı
Adım 1:Başlat 
Adım 2:T=0
Adım 3:S=1
Adım 4:Eğer S>5 ise git adım 
Adım 5:T=T+S
Adım 6:S=S+1
Adım 7:Git adım 4
Adım 8:Yaz T
Adım 9:Bitir
*/
public class week3_example4 {
    public static void main(String[] args) {
int T=0;
int S=1;
while(S<=5) {
        T = T +S ;
        S=S+1;
    }
System.out.println(T);
    }
    
}
