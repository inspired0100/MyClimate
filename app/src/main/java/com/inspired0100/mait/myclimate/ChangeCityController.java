package com.inspired0100.mait.myclimate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChangeCityController extends AppCompatActivity {

   private ImageButton mbackButton;
   private  EditText editTextQuery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_city_layout);

        mbackButton =  findViewById(R.id.backButton);
        editTextQuery = findViewById(R.id.queryET);

        mbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });

        editTextQuery.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String newCity = editTextQuery.getText().toString();
                Intent myIntent = new Intent(ChangeCityController.this, WeatherController.class);
                myIntent.putExtra("City", newCity);
                startActivity(myIntent);

                return false;
            }
        });





    }
}
