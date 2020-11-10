public class Main {
    /**
     *Bir araba nesnesi oluşturup arabaya ait özellikleri kurucu metodlar
     * sayesinde tanımlayabildiğimiz bir sınıf yazın.
     */

    public static void main(String[] args) {
        Car car = new Car("Toyota", "C-HR",2020,48260,"Beyaz");
    }
}

    class Car {
        String marka;
        String model;
        int sene;
        int km;
        String renk;

        public Car(String marka, String model, int sene, int km, String renk) {
            this.marka = marka;
            this.model = model;
            this.sene = sene;
            this.km = km;
            this.renk = renk;

            System.out.println("Aracın; \nMarkası: "+ marka+ "\nModeli: "+ model+
                    "\nYılı: "+ sene+ "\nKilometresi: "+km+"\nRengi: "+ renk);
        }
    }
