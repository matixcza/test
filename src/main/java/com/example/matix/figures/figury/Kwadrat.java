package com.example.matix.figures.figury;

import android.media.Image;

import com.example.matix.figures.R;
import com.example.matix.figures.figury.Figura;

public class Kwadrat extends Figura {

    //(1)
    // dodatkowe POLA potrzebne do okreslenia stanu Kwadratu;
    private String cecha;
    private int rodzaj;
    private float przekatna;

    //(2)
    //KONSTRUKTOR - sposob inicjalizowania obiektu
    public Kwadrat(float  wymiarLiniowy){
        super(wymiarLiniowy);
        cecha = "Przekatna";
        rodzaj = R.drawable.cube;
        this.przekatna = zmienna(wymiarLiniowy);

        // zawartosc konstruktora - operacje wykonane podczas tworzenia obiektu
    }
    // dodatkowe METODY  - które nie były zdefiniowane w klasie bazowej (Figura), w tym setters i getters
    //.
    //.
    @Override
    public String getCecha(){return cecha;}

    @Override
    public int getRodzaj() { return rodzaj; }

    @Override
    public float getZmienna(){return przekatna;}

    //(3)
    //definicje METOD zadeklarowanych w klasie bazowej jako abstrakcyjne
    @Override // ten znacznik moze byc pominiety; sluzy tylko do poinformownia ze ponizsza metoda jest metoda nadpisana
    public double pole(float wymiarLiniowy) {

        float pole = (wymiarLiniowy * wymiarLiniowy) ;
        double x = (double) pole;
        return x;
              //zawartosc metody - operacje ktore trzeba wykonac aby wyznaczyc pole kwadratu
    }

    @Override
    public float zmienna(float wymiarLiniowy){

        przekatna = wymiarLiniowy * 1.41f;
        return przekatna;

    }


    // wszystkie metody abstrakcyjne klasy bazowej musza byc zdefiniowane w tej klasie
    //itd.
}