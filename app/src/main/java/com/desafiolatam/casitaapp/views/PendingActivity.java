package com.desafiolatam.casitaapp.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.desafiolatam.casitaapp.R;
import com.desafiolatam.casitaapp.main.MainActivity;
import com.desafiolatam.casitaapp.models.Pending;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Samuel on 28-10-2017.
 */

public class PendingActivity extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference dbref = firebaseDatabase.getReference().getRef().child("Tareas");

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending);
        final EditText nameEt = findViewById(R.id.namePendingEt);
        final EditText descriptionEt = findViewById(R.id.descriptionPendingEt);
        Button savebutton = findViewById(R.id.saveBtn);
        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String key = dbref.push().getKey();
                Pending pending = new Pending();
                pending.setDescription(String.valueOf(descriptionEt.getText()));
                pending.setName(String.valueOf(nameEt.getText()));
                pending.setKey(key);
                dbref.child(key).setValue(pending);

                Intent intent = new Intent(PendingActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });



    }
}
