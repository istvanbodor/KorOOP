package hu.pterik.koroop;

import hu.pterik.koroop.kor.Kor;

public class Main {

    public static void main(String[] args) {
        Kor k1 = new Kor();
        System.out.println(k1);
        k1.nagyit(3);
        System.out.println(k1);
        Kor[] korok = new Kor[10];
        for (int i = 0; i < korok.length; i++) {
            korok[i] = new Kor();
        }
        for (int i = 0; i <korok.length ; i++) {
            System.out.println(korok[i]);
        }

        int index =0;
        double legnagyobb =korok[0].terulet();
        for (int i = 1; i < korok.length; i++) {

            if (korok[i].terulet()>legnagyobb)
            {
                index = i;
                legnagyobb = korok[i].terulet();


            }

        }

        System.out.println("A legnagyobb területű kör: " +korok[index].toString());


    }




}
