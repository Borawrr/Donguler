import java.util.Scanner;

public class donguler {
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    int sayi;

    System.out.print("Bir sayi giriniz : ");
    sayi = scanner.nextInt();

    int toplam = 0;
    int adet = 0;

    for(int i = 1 ; i <= sayi ; i++){

        if(i % 3 == 0 && i % 4 == 0){

            toplam += i;
            adet++;
        }
    }
        double ortalama = toplam / adet;

        System.out.println("0'dan " + sayi + "'ya kadar olan 3 ve 4 e bolunebilen sayilarin toplaminin ortalamasi : " + ortalama);

        scanner.close();
    }

}
