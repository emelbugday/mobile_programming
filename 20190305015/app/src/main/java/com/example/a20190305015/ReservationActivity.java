package com.example.a20190305015;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class ReservationActivity extends AppCompatActivity {
    Button btn_back;
    Button btn_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        btn_send=findViewById(R.id.send);
        btn_send.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                Toast.makeText(ReservationActivity.this,"The reservation has been saved.",Toast.LENGTH_SHORT).show();
            }
        });

        describing_2();
        btn_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent homepage=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(homepage);
            }
        });
    }
    public void describing_2()
    {
        btn_back=findViewById(R.id.backt_to_main);

    }

    }
