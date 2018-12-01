package com.example.matix.figures;

import com.example.matix.figures.figury.Figura;

import java.util.Comparator;

public class Sortbyrodzaj implements Comparator<Figura> {

    public int compare(Figura a, Figura b)
    {
        return a.getRodzaj() - b.getRodzaj();
    }
}
