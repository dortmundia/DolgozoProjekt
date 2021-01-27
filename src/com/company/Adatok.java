package com.company;


public class Adatok {
    //Az adatok.txt állomány tartalmazza a dolgozók adatait. Egy sor szerkezete az alábbi formátumú
//Vezetéknév Keresztnév nem életkor fizetés Ft

    String vezeteknev,keresztnev, nem, forint;
    int age, wage;


    public Adatok(String vezeteknev, String keresztnev, String nem,  int age, int wage, String forint) {
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.nem = nem;
        this.forint = forint;
        this.age = age;
        this.wage = wage;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public String getNem() {
        return nem;
    }

    public String getForint() {
        return forint;
    }

    public int getAge() {
        return age;
    }

    public int getWage() {
        return wage;
    }

   /* @Override
    public String toString() {
        return
                "A dolgozo neve:" + vezeteknev + keresztnev + '\'' +
                "Neme" + nem + '\'' +
                "Életkora" + age +'\'' +
                "Fizetése" + wage + "Ft";
    }*/
   @Override
   public String toString() {
       return
               "A dolgozo neve:" + vezeteknev + " "+ keresztnev + "  " +
                       "Neme" + nem + " " +
                       "Életkora" + age +"  " +
                       "Fizetése" + wage + forint;
   }

    public String toStringToFile() {
        return
                vezeteknev + " "+ keresztnev + "  " +
                        nem + " " +
                       age +"  " +
                        wage +" "+ forint;
    }

}
