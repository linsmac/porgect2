package com.example.porgect1;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private int mYear, mMonth, mDay;
    private Spinner spinner;
    private Spinner_main spinner_main;
    private TextView date;

    TextView dateTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView nextPageBtn = (ImageView)findViewById(R.id.plus);
        dateTextView = (TextView)findViewById(R.id.dateTextView);

        nextPageBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                TextView dateString = findViewById(R.id.dateTextView);
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, AddView.class);
                intent.putExtra("date",dateString.getText().toString());
                startActivity(intent);
            }

        });


        TextView dateString = findViewById(R.id.dateTextView);//顯示日期的TextView
        CalendarView CalendarView = findViewById(R.id.calendarView);
        CalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull android.widget.CalendarView calendarView, int i, int i1, int i2) {
                dateString.setText( +  i  +"年" + i1 + "月" + i2 + "日");

            }
        });


    }



    private String setDateFormat(int year, int monthOfYear, int dayOfMonth) {
        return String.valueOf(year) + "-"
                + String.valueOf(monthOfYear + 1) + "-"
                + String.valueOf(dayOfMonth);
    }


}