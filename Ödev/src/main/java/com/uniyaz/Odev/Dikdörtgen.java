package com.uniyaz.Odev;

public class Dikdörtgen extends Sekil{

   private int kenar1;
   private int kenar2;

    public Dikdörtgen( int kenar1, int kenar2) {

        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }

    @Override
    void alan_hesapla() {
        System.out.println( (kenar1 * kenar2) );

    }

    @Override
    void cevre_hesapla() {

        System.out.println( (2 * (kenar1+kenar2)));

    }
}
