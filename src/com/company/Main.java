package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        //global varubes
        double earthDay = 0;
        double earthHour = 0;
        double earthMin = 0;
        double earthSec = 0;
        double sol = 0;
        double ratiotime = 0;
        double earthtime = 0;

        //the scanner
        Scanner timeReader = new Scanner(System.in);

        //list
        ArrayList<Double> arrayListTime = new ArrayList<Double>();

        //text for the user
        System.out.println("write out the date _ the hour _ then the minuits _ and seconds _ \n enter 'Done' when finished");

        //loop to see the weights
        while (timeReader.hasNextDouble()) {
            double x = timeReader.nextDouble();
            arrayListTime.add(x);
        }
        earthDay = arrayListTime.get(0);
        earthHour = arrayListTime.get(1);
        earthMin = arrayListTime.get(2);
        earthSec = arrayListTime.get(3);

        if (earthHour > 24){
            System.out.println("enter an hour value less then 24");
        }
        if (earthMin > 60){
            System.out.println("hi");
        }
        if (earthSec > 60){
            System.out.println("enter a seconds value less then 60");
        }

        earthDay = earthDay -1;

        earthtime = earthDay * 24 * 60 * 60;
        earthtime += earthHour * 60 * 60;
        earthtime += earthMin * 60;
        earthtime += earthSec;

        ratiotime = (24 * 60 * 60) / ((24 * 60 * 60) + (37 * 60) + 22.663) ;

        sol = earthtime * ratiotime;

        double marsDay = 0;
        double marsHour = 0;
        double marsMin = 0;
        double marsSec = 0;

        marsDay = Math.floor(sol / (24. * 60. * 60.));
        sol -= (marsDay * 24 * 60 * 60 );
        marsHour = Math.floor(sol / (60. * 60.));
        sol -= (marsHour * 60 * 60);
        marsMin = Math.floor(sol / (60));
        sol -= (marsMin * 60);
        marsSec = Math.floor(sol);

        System.out.println(marsDay);
        System.out.println(marsHour);
        System.out.println(marsMin);
        System.out.println(marsSec);



    }
}
