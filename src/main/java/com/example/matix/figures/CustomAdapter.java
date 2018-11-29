package com.example.matix.figures;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.matix.figures.figury.Figura;

import java.text.DecimalFormat;

class CustomAdapter extends BaseAdapter {


    private Figura figury[];
    private Context mContext;

    public CustomAdapter (Context context, Figura figury[]){
        this.mContext = context;
        this.figury = figury;
    }

    @Override
    public int getCount() {
        return figury.length;
    }

    @Override
    public Object getItem(int i){
        return null;
    }

    @Override
    public long getItemId(int i){
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        LayoutInflater inflater= LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.customlayout,null);
        ImageView imageView_figura= (ImageView) view.findViewById(R.id.imageView_rodzaj);
        TextView textView_pole= (TextView)view.findViewById(R.id.textView_pole);
        TextView textView_wymiarliniowy= (TextView)view.findViewById(R.id.textView_wymiarliniowy);
        TextView textView_cecha= (TextView)view.findViewById(R.id.textView_cecha);


        double pole= figury[i].getPole();
        String pole1 = formatNumber(pole);
        double wymiarLiniowy = figury[i].getZmienna();
        String wymiarliniowy1 = formatNumber(wymiarLiniowy);


        imageView_figura.setImageResource(figury[i].getRodzaj());
        textView_pole.setText(pole1);
        textView_wymiarliniowy.setText(wymiarliniowy1);
        textView_cecha.setText(figury[i].getCecha());

        return view;
    }

    public static String formatNumber(double number) {
        DecimalFormat df = new DecimalFormat("0.000");
        return df.format(number);
    }

}