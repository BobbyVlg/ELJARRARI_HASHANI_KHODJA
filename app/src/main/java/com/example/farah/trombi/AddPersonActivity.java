package com.example.farah.trombi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPersonActivity extends AppCompatActivity {

    Button addPerson;
    String nom;
    String prenom;
    EditText etNom;
    EditText etPrenom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);
        etNom = (EditText)findViewById(R.id.txtName);
        etPrenom = (EditText)findViewById(R.id.txtPrenom);

        addPerson = (Button)findViewById(R.id.btnValider);

        addPerson.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nom = etNom.getText().toString();
                prenom = etPrenom.getText().toString();
                Person person = new Person(nom, prenom);
                DataPerson.addPerson(person);

                Toast.makeText(getApplicationContext(),"Nom: "+nom+"\n"+"Prenom: " + prenom+"\n a été ajouter", Toast.LENGTH_LONG).show();
            }
        });
    }
}
