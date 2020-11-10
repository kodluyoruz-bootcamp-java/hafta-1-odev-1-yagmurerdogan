import java.util.Scanner;

public class Main {
    /**
     *Kullanıcıdan alınan ondalıklı bir sayının ondalık kısmına göre
     * aşağı veya yukarı yuvarlama işlemi yapacak bir program yazınız.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yuvarlamak istediğiniz ondalıklı sayıyı virgül ile yazınız: ");
        double sayi = scanner.nextDouble();

        System.out.println("\nAşağı yuvarlamak içim ->1 \nYukarı yuvarlamak" +
                "için ->2'ye basmalısınız.");

        int secim = scanner.nextInt();

        if(secim == 1) {
            System.out.println("Aşağı Yuvarlanmış Sayı: " + Math.floor(sayi));


        }else if(secim == 2) {
            System.out.println("Yukarı Yuvarlanmış Sayı: " + Math.ceil(sayi));


        }else{
            System.out.println("Geçerli bir tuşlama yapmadınız.");
        }


    }
}
