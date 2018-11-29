package com.example.matix.figures.figury;
import com.example.matix.figures.R;

import com.example.matix.figures.figury.Figura;

public class Kolo extends Figura {

    //(1)
    // dodatkowe POLA potrzebne do okreslenia stanu Kwadratu;
    private String cecha;
    private int rodzaj;
    private float srednica;

    //(2)
    //KONSTRUKTOR - sposob inicjalizowania obiektu
    public Kolo(float  wymiarLiniowy){
        super(wymiarLiniowy);
        cecha = "Srednica";
        rodzaj = R.drawable.circle;
        this.srednica = zmienna(wymiarLiniowy);

        // zawartosc konstruktora - operacje wykonane podczas tworzenia obiektu
    }

    // dodatkowe METODY  - które nie były zdefiniowane w klasie bazowej (Figura), w tym setters i getters
    //.
    //.
    //.
    @Override
    public String getCecha(){return cecha;}

    @Override
    public int getRodzaj() { return rodzaj; }

    @Override
    public float getZmienna(){return srednica;}

    //(3)
    //definicje METOD zadeklarowanych w klasie bazowej jako abstrakcyjne
    @Override // ten znacznik moze byc pominiety; sluzy tylko do poinformownia ze ponizsza metoda jest metoda nadpisana
    public double pole(float wymiarLiniowy) {

        float x = wymiarLiniowy;
        float pierwiastek = x/2;
        float obliczenia = pierwiastek * pierwiastek;
        double pole = obliczenia  * (3.14) ;
        return pole;
        //zawartosc metody - operacje ktore trzeba wykonac aby wyznaczyc pole kwadratu
    }

    @Override
    public float zmienna(float wymiarLiniowy){

        srednica = wymiarLiniowy * 2;
        return srednica;

    }

    // wszystkie metody abstrakcyjne klasy bazowej musza byc zdefiniowane w tej klasie
    //itd.

}