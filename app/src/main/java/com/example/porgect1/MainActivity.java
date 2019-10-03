package com.example.porgect1;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private int mYear, mMonth, mDay;
    private Spinner spinner;
    private Spinner_main spinner_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView dateText = (TextView)findViewById(R.id.dataText);
        Button dateButton = (Button)findViewById(R.id.button);
        spinner = (Spinner)findViewById(R.id.spinner);
        spinner_main = new Spinner_main(getApplicationContext());
        spinner_main.setSpinner(spinner);


        dateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);
                new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        String format = "您設定的日期為:"+ setDateFormat(year,month,day);
                        dateText.setText(format);                    }

                }, mYear,mMonth, mDay).show();            }

        });
    }
    private String setDateFormat(int year,int monthOfYear,int dayOfMonth){
        return String.valueOf(year) + "-"
                + String.valueOf(monthOfYear + 1) + "-"
                + String.valueOf(dayOfMonth);
    }



}