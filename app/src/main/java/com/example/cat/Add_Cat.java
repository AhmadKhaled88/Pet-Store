package com.example.cat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Add_Cat extends AppCompatActivity {

    String CatName , CatBreed , CatDescription ;
    FirebaseDatabase db ;
    DatabaseReference reference ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cat2);


      EditText CatName_EditText = findViewById(R.id.AddCatName);
      EditText CatBreed_EditText = findViewById(R.id.AddCatBreed);
      EditText CatDescription_EditText = findViewById(R.id.AddCatDescription);


        Button uploadcat= findViewById(R.id.UploadCat);
        uploadcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CatName = CatName_EditText.getText().toString();
                CatBreed = CatBreed_EditText.getText().toString();
                CatDescription = CatDescription_EditText.getText().toString();


                if (!CatName.isEmpty() && !CatBreed.isEmpty() && !CatDescription.isEmpty()){


                    Cats cats = new Cats(CatName,CatBreed,CatDescription);
                    db = FirebaseDatabase.getInstance();
                    reference = db.getReference("Cats");
                    reference.child(CatName).setValue(cats).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            CatName_EditText.setText("");
                            CatBreed_EditText.setText("");
                            CatDescription_EditText.setText("");
                            Toast.makeText(Add_Cat.this,"Successfully Update",Toast.LENGTH_SHORT).show();                        }
                    });

                }
            }
        });



    }
    }
