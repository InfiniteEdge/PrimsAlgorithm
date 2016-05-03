package com.example.nick.primsalgorithm;

import android.view.View;

import java.util.LinkedList;


/**
 * Created by Nick on 5/2/2016.
 */
public class City extends MainActivity
{

    private String destination;
    private String distance;
    private String name;

    public City()
    {
        this.name = name;
        this.destination = destination;
        this.distance = distance;
    }


    public void addCityNode(LinkedList cities)
    {
        LinkedList cityNode = new LinkedList();
        String distance = "30";
        String destination = "Sheboygan";



        for(int i = 0; i < cities.size(); i++)
        {
            cityNode.add(cities.get(i) + "-" + distance + "-" + destination);
        }
        System.out.println(cityNode);



    }



}
