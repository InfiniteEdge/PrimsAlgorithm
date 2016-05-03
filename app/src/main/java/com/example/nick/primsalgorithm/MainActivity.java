package com.example.nick.primsalgorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity
{
    private Button add;
    private Button build;
    private EditText city;
    private EditText destination;
    private EditText weight;
    LinkedList cities = new LinkedList();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.add = (Button)this.findViewById(R.id.add);
        this.city = (EditText)this.findViewById(R.id.city);
        this.destination = (EditText)this.findViewById(R.id.destination);
        this.weight = (EditText)this.findViewById(R.id.weight);
        this.build = (Button)this.findViewById(R.id.build);



    }



    public void addButtonClicked(View sender)
    {
        String city = this.city.getText().toString();
        cities.add(city);
        Toast.makeText(getApplicationContext(), "Added Successfully!",
                Toast.LENGTH_SHORT).show();

        System.out.println(cities);

    }


    public void buildButtonClicked(View sender)
    {
        City cityList = new City();
        cityList.addCityNode(cities);
        System.out.println(cityList);
    }










}
