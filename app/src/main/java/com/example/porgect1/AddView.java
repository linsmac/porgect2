package com.example.porgect1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class AddView extends AppCompatActivity {


    private EditText money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_view);


       TextView date = findViewById(R.id.date);//接收ＭainActivity的數值到ＡddView
       Intent intent = getIntent();
       String value = intent.getStringExtra("date");
       date.setText(value);


        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        final String[] kind = {"飲食","交通","日常生活","娛樂","交通","其他"};
        ArrayAdapter<String> kindList = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,kind);
        spinner.setAdapter(kindList);


        Button nextPageBtn = (Button)findViewById(R.id.button);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText money = findViewById(R.id.money);//將ＡddView的money數值傳到ＭainActivity
                Intent intent = new Intent();
                intent.setClass(AddView.this,MainActivity.class);
                intent.putExtra("MONEY",money.getText().toString());
                startActivity(intent);
            }


        });



        Button thisPageBtn = (Button)findViewById(R.id.button2);
        thisPageBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                Intent intent1 = new Intent();
                intent1.setClass(AddView.this,AddView.class);
                startActivity(intent1);
            }


        });





        // String dateString=getIntent().getStringExtra("DATE");
        //date.setText(dateString);
    }
}
