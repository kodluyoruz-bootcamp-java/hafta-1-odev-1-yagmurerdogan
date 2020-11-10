public class Main {

    /**
     * 0-2000 arası 3,5,7ve 53'e tam blünebilen sayıların
     * aritmetik ortalamasını bulan bir program oluşturun.
     */

    public static void main(String[] args) {
        int sayiToplami = 0;
        int sayiAdet = 0;
        double ortalama;

        for (int i = 0; i < 2000; i++) {
            if ( i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 53 == 0) {
                sayiToplami += i;
                sayiAdet ++;
            }
        }

       if (sayiToplami == 0){
           System.out.println("0-2000 arası 3,5,7 ve 53'e tam bölünen sayı sadece: 0'dır.");
       }else{
           ortalama = (sayiToplami / sayiAdet);
           System.out.println("0-2000 arası 3,5,7 ve 53'e bölünebilen sayı adedi: "+sayiAdet+
                   " tanedir. Ve bu sayıların ortalaması: "+ortalama);
       }
    }
}
