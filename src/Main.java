// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            Ödev
                Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
                girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */

        //Kullanıcıdan Değer Alalım.
        Scanner input = new Scanner(System.in);

        // Girilen sayı Tek Çift kontrolü
        boolean cift =true;
        int toplam = 0;
        while (cift) {
            System.out.print("Lütfen Değer Giriniz : ");
            int sayi = input.nextInt();

            if (sayi % 2 == 1){
                cift = false;
            } else if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam +=sayi;
                System.out.println("Güncel Toplam = " + toplam);
            }

        }
        System.out.println("Tek sayı girişi yapıldı çıkış yapılıyor .. ");


    }
}