package com.uniyaz.Odev;

public class Daire extends Sekil{

    private int yaricap;

    public Daire(int yaricap) {

        this.yaricap = yaricap;

    }

    @Override
    void alan_hesapla() {


        System.out.println( (Math.PI * yaricap * yaricap));

    }

    @Override
    void cevre_hesapla() {
        System.out.println((Math.PI*yaricap*yaricap));
    }


}

