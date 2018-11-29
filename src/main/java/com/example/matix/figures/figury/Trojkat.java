package com.example.matix.figures.figury;
import com.example.matix.figures.R;

import com.example.matix.figures.figury.Figura;

public class Trojkat extends Figura {

    //(1)
    // dodatkowe POLA potrzebne do okreslenia stanu Kwadratu;
    private String cecha;
    private int rodzaj;
    private float wysokosc;

    //(2)
    //KONSTRUKTOR - sposob inicjalizowania obiektu
    public Trojkat(float  wymiarLiniowy){
        super(wymiarLiniowy);
        cecha = "Wysokosc";
        rodzaj = R.drawable.triangle;
        this.wysokosc = zmienna(wymiarLiniowy);

        // zawartosc konstruktora - operacje wykonane podczas tworzenia obiektu
    }

    // dodatkowe METODY  - które nie były zdefiniowane w klasie bazowej (Figura), w tym setters i getters
    //.

    @Override
    public String getCecha(){return cecha;}

    @Override
    public int getRodzaj() { return rodzaj; }

    @Override
    public float getZmienna(){return wysokosc;}

    //(3)
    //definicje METOD zadeklarowanych w klasie bazowej jako abstrakcyjne
    @Override // ten znacznik moze byc pominiety; sluzy tylko do poinformownia ze ponizsza metoda jest metoda nadpisana
    public double pole(float wymiarLiniowy) {

        float x = wymiarLiniowy;
        double pole = ((x * x) * 1.73) / 4;

        return pole;
        //zawartosc metody - operacje ktore trzeba wykonac aby wyznaczyc pole kwadratu
    }

    @Override
    public float zmienna(float wymiarLiniowy){

        wysokosc = (wymiarLiniowy * 1.73f) / 2 ;
        return wysokosc;

    }


    // wszystkie metody abstrakcyjne klasy bazowej musza byc zdefiniowane w tej klasie
    //itd.
}