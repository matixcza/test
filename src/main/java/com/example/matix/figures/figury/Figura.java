package com.example.matix.figures.figury;


public abstract class Figura {

    //(1)
    // POLA charakteryzujace wspolne wlasnosci wszystkich figur
    private float wymiarLiniowy;
    private double pole;


    //(2)
    // METODY definiujace dostep do pol klasy Figura tzw. getters i setters
    //np.
    public Figura(float wymiarLiniowy){
        this.wymiarLiniowy = wymiarLiniowy;
        this.pole = pole(wymiarLiniowy);
        //this.rodzaj = rodzaj;

    }

    public float getWymiarLiniowy() {
        return wymiarLiniowy;
    }

    public double getPole(){
        return pole;
    }

    public int getRodzaj(){
        return 0;
    }

    public String getCecha() { return ""; }

    public float getZmienna(){return 0;}

    //(3)
    // deklaracje METOD ABSTRAKCYJNYCH (tylko nazwa i argumenty)
    // sa to metody, ktore sa wykorzystywane dla wszystkich typow figur, ale zaleznie od rodzaju figury nalezy zastosowac inna definicje metody
    // metody abstrakcyjne sa definiowane w klasach pochodnych (klasach dziedziczacych z klasy Figura)
    public abstract double pole(float wymiarLiniowy);

    public abstract float zmienna(float wymiarLiniowy);


}
