package com.example.matix.figures;

import com.example.matix.figures.figury.Figura;

import java.util.Comparator;

public class SortbyCecha implements Comparator<Figura> {

    public int compare(Figura a, Figura b) {
        return Double.compare(a.getWymiarLiniowy(), b.getWymiarLiniowy());
    }
}
