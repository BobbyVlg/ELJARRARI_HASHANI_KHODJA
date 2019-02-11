package com.example.farah.trombi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Trombinoscpe extends AppCompatActivity {
    DataPerson dataPerson = new DataPerson();
    Button trombinoscope;
    Button ajout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trombinoscpe);

        trombinoscope = (Button)findViewById(R.id.button);
        ajout = (Button)findViewById(R.id.button2);

        trombinoscope.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                navigateTo(ListPersons.class);
            }
        });

        ajout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                navigateTo(AddPersonActivity.class);
            }
        });
    }

    private void navigateTo(Class c) {
        startActivity(new Intent(Trombinoscpe.this,c));
    }
}
