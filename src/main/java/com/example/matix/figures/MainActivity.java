package com.example.matix.figures;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.LinearLayout;

import com.example.matix.figures.figury.Figura;
import com.example.matix.figures.figury.Kwadrat;
import com.example.matix.figures.figury.Trojkat;
import com.example.matix.figures.figury.Kolo;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;



public class MainActivity extends Activity {

    final Figura[] figury = generateFigures();
    int numberElements = figury.length;
    private CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   //wczytywanie layout'u statycznego
        LinearLayout ln = (LinearLayout) findViewById(R.id.linearLayout1);

        buildListView();


        Button buttonSort = findViewById(R.id.button_sort_rodzaj);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sortArray(1);
            }
        });

        Button buttonSortPole = findViewById(R.id.button_sort_pole);
        buttonSortPole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sortArray(2);
            }
        });

        Button buttonSortCecha = findViewById(R.id.button_sort_cecha);
        buttonSortCecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sortArray(3);
            }
        });


    }


    public Figura[] generateFigures(){

        int a=100;
        //losowanie liczb
        Random generator = new Random(); //generator liczb pseudolosowych
        float[][] los=new float[a][2];

        for(int nr = 0; nr < a; nr = nr + 1){
            los[nr][0] = generator.nextInt(3);
            los[nr][1] =  generator.nextFloat();
        }

        // generowanie figur

        Figura[] figury = new Figura[a]; //tablica figur
        for(int nr = 0; nr < a; nr = nr + 1){
            if (los[nr][0]==0) {
                figury[nr]= new Kwadrat(los[nr][1]);
            }
            else if (los[nr][0]==1) {
                figury[nr]= new Trojkat(los[nr][1]);
            }
            else {
                figury[nr]= new Kolo(los[nr][1]);
            }
        }

        return figury;

    }

    public void sortArray(int parametr){

        switch(parametr){

            case 1:
                Arrays.sort(figury, new Sortbyrodzaj());
                break;

            case 2:
                Arrays.sort(figury, new SortbyPole());
                break;

            case 3:
                Arrays.sort(figury, new SortbyCecha());
                break;

        }
        customAdapter.notifyDataSetChanged();

    }



    private void buildListView() {

        Context context = getApplicationContext();
        ListView listView=(ListView)findViewById(R.id.listView);
        customAdapter = new CustomAdapter(context, figury);
        listView.setAdapter(customAdapter);

    }

}
