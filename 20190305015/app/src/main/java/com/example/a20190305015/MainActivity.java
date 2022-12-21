package com.example.a20190305015;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btn_cnc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        describing();
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent reservation=new Intent(getApplicationContext(),ReservationActivity.class);
                startActivity(reservation);
            }
        });
    }
    public void describing()
    {
        btn=findViewById(R.id.reservation);

    }
}