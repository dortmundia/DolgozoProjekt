package com.company;

import java.io.*;
import java.util.ArrayList;

public class Feladatok {
    private ArrayList<Adatok> lista;
    public Feladatok(){
        Beolvasas();

    }

    private void Beolvasas(){
        String vezeteknev,keresztnev, nem, forint;
        int age, wage;
        lista= new ArrayList<>();
        try{
            FileReader r= new FileReader("adatok.txt");
            BufferedReader br= new BufferedReader(r);
            String sor=br.readLine();
            while(sor!=null)
            {
                String[] helper= sor.split(" ");
                vezeteknev =helper[0];
                keresztnev =helper[1];
                nem =helper[2];
                age = Integer.parseInt(helper[3]);
                wage =Integer.parseInt(helper[4]);
                forint =helper[5];




                lista.add(new Adatok(vezeteknev,keresztnev, nem,age, wage,forint));
                sor= br.readLine();
            }
            br.close();
            r.close();
        }
        catch (IOException e){
            e.getMessage();
        }

    }


//3. Határozza meg és írja ki a képernyőre a minta szerint, hogy hány dolgozó található az állományban.
//4. Határozza meg és írja ki a képernyőre A 25 éven aluliak összfizetését.
//5. Keresse meg és írja ki a képernyőre a legnagyobb fizetéssel rendelkező dolgozó adatait.
//6. Kérjen be a felhasználótól egy összeget. Döntse el, hogy van-e olyan dolgozó, akinek a fizetése a bekért összeg felett van. Ha a felhasználó nem számot adott meg, akkor a “Nem számot adott meg.” felirat jelenjen meg és ismételje meg a bekérést.
//7. A cég diákokat is alkalmaz. Írja ki életkor szerint csoportosítva a kiskorú dolgozók számát.
//8. Készítsen egy szöveges állományt diakok.txt névvel. Írja ki a fájlba az összes kiskorú dolgozó adatait. Az elkészült fájl szerkezete egyezzen meg a forrásállományéval.



    public int F3(){
        return lista.size();
    }
    
    public int F4(){
        int ossz = 0;

        for (Adatok item:lista) {
            if(item.getAge()<25)
            {
               ossz= ossz + item.getWage();
            }
        }
        
        return ossz;
    }

    public String F5(){
        int fizu = 0;
        int id = 0;
        int i = 0;

        for (Adatok item:lista) {
            if(item.getWage()>fizu)
            {
                fizu=item.getWage();
                id=i;
            }
            i++;
        }

        return lista.get(id).toString();
    }


    public String F6(int be) {
        String szoveg="";
        int vane=0;
        for (Adatok item:lista)
        {
            if(be<item.getWage())
            {vane++;}
        }

        if (vane>0)
        {
           szoveg="Van olyan dolgozó, akinek a fizetése "+ be +" Ft felett van!";
        }
        else
        {
            szoveg="Nincs olyan dolgozó, akinek a fizetése "+ be +" Ft felett van!";
        }
        return szoveg;
    }


    public String F7() {
        String szoveg="";
        int age8=0;
        int age9=0;
        int age10=0;
        int age11=0;
        int age12=0;
        int age13=0;
        int age14=0;
        int age15=0;
        int age16=0;
        int age17=0;



        for (Adatok item:lista) // elnézést a csunya megoldás ért
        {
            if(8==item.getAge())
            {
                age8++;
            }

             if(9==item.getAge())
            {
                age9++;
            }

             if(10==item.getAge())
            {
                age10++;
            }

             if(11==item.getAge())
            {
                age11++;
            }

             if(12==item.getAge())
            {
                age12++;
            }

             if(13==item.getAge())
            {
                age13++;
            }

             if(14==item.getAge())
            {
                age14++;
            }

             if(15==item.getAge())
            {
                age15++;
            }

             if(16==item.getAge())
            {
                age16++;
            }

             if(17==item.getAge())
            {
                age17++;
            }
        }
        szoveg= //"8 éves: "+age8+" fő," +
                //" 9 éves: "+age9+" fő, "+
                " 10 éves: "+age10+" fő, "+
                " 11 éves: "+age11+" fő, "+
                " 12 éves: "+age12+" fő, "+
                " 13 éves: "+age13+" fő, "+
                " 14 éves: "+age14+" fő, "+
                " 15 éves: "+age15+" fő, "+
                " 16 éves: "+age16+" fő, "+
                " 17 éves: "+age17+" fő. ";


        return szoveg;
    }

    public Boolean F8() {
        Boolean sikerultE = false;


        try{
            FileWriter w = new FileWriter("diakok.txt");
            for (Adatok item:lista) {
                if (item.getAge()<18)
                {
                    w.write(item.toStringToFile());
                    w.write("\n");
                }
            }

            w.close();

            sikerultE=true;
        }
        catch (IOException e){
            sikerultE=false;
        }

        return sikerultE;
    }
}
