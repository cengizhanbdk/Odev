package com.uniyaz.Odev;



    public class Kare extends Sekil{
        private int kenar;

        public Kare(int kenar) {

            this.kenar = kenar;

        }

        @Override
        void alan_hesapla() {
            System.out.println( (kenar * kenar) );

        }
        public void cevre_hesapla() {
            System.out.println( (4 * kenar));
        }
    }

