package com.example.porgect1;


import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;



/*
public class Spinner_main {
    private Spinner spinner;
    private final String[] kind = {"飲食", "日常用品", "交通", "娛樂", "學習深造"};
    private ArrayAdapter<String> kindList;
    private Context context;

    public Spinner_main(Context context) {
        this.context = context;
    }

    public void setSpinner(Spinner spinner){
        this.spinner = spinner;
        this.kindList = new ArrayAdapter<String>(context, R.layout.activity_main, kind);
        this.kindList.setDropDownViewResource(R.layout.activity_main);
        this.spinner.setAdapter(kindList);
    }*/
public class Spinner_main {//最簡單一的字體太小
    private Spinner spinner;
    private final String[] kind = {"飲食", "日常用品", "交通", "娛樂", "學習深造"};
    private ArrayAdapter<String> kindList;
    private Context context;

    public Spinner_main(Context context) {
       this.context = context;
    }

    public void setSpinner(Spinner spinner){
        this.spinner = spinner;
        this.kindList = new ArrayAdapter<String>(context, R.layout.support_simple_spinner_dropdown_item, kind);


        this.spinner.setAdapter(kindList);
    }

//    protected void onCreat(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Spinner spinner = (Spinner)findViewById(R.id.spinner);
//        final String[] kind = {"飲食", "日常用品", "交通", "娛樂", "學習深造"};
//        ArrayAdapter<String> lunchList = new ArrayAdapter<>(Spinner_main.this,
//                android.R.layout.simple_spinner_dropdown_item,
//                kind);spinner.setAdapter(lunchList);}
}
