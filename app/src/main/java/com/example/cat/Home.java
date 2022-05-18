package com.example.cat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      CardView  CardinFormation = findViewById(R.id.cardinfo);
        CardinFormation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this , Add_Cat.class);
                startActivity(intent);
            }
        });
       CardView Update_Card = findViewById(R.id.update);
        Update_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this , Update_Cat.class);
                startActivity(intent);
            }
        });
       CardView List_Card = findViewById(R.id.allinlist);
        List_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this , list_cats.class);
                startActivity(intent);
            }
        });
     CardView Delete_Card = findViewById(R.id.delete);
        Delete_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this , Delete_Cat.class);
                startActivity(intent);
            }
        });
    }
}