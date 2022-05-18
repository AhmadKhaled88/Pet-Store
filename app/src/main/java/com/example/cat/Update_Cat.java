package com.example.cat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Update_Cat extends AppCompatActivity {

    DatabaseReference databaseReference ;
    Button updateinfo ;
    EditText catname , catbreed , catdes ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_cat);

        catname = findViewById(R.id.name);
        catdes = findViewById(R.id.breed);
        catbreed = findViewById(R.id.description);
        updateinfo=findViewById(R.id.updateinfo);

        updateinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Catname = catname.getText().toString();
                String CatBreed = catbreed.getText().toString();
                String CatDes = catdes.getText().toString();

                UpdateData(Catname,CatBreed,CatDes);


            }
        });


    }

    private void UpdateData(String catname, String catBreed, String catDes) {

        HashMap cats = new HashMap();
        cats.put("catname",catname);
        cats.put("catDes",catBreed);
        cats.put("catBreed",catDes);

        databaseReference = FirebaseDatabase.getInstance().getReference("Cats");
        databaseReference.child(catname).updateChildren(cats).addOnCompleteListener(new OnCompleteListener() {
            @Override
            public void onComplete(@NonNull Task task) {

                if (task.isSuccessful()){



                }

            }
        });

    }
    }
