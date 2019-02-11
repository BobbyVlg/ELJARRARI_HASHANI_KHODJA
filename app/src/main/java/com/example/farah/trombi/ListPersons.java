package com.example.farah.trombi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListPersons extends AppCompatActivity {
    ListView listViewPersons;
    private ArrayList<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_persons);

        persons = DataPerson.getPersons();

        listViewPersons = (ListView)findViewById(R.id.listPersons);

        final PersonAdapter adapter = new PersonAdapter(ListPersons.this, persons);
        listViewPersons.setAdapter(adapter);

    }
}


