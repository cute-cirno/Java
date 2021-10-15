package com.cirno.java;

import java.util.Random;

public class Random_work {
    public static void main(String[] args){
        Random rand = new Random();
        int sum=0,max=77,min=459,tmax,tmin;
        float average;
        int a[] = new int[20];
        for(int i = 0; i < 20; i++){
            a[i] = rand.nextInt(382)+77;
            sum += a[i];
            tmax = a[i];
            tmin = a[i];
            if(tmax>max) max = tmax;
            if(tmin<min) min = tmin;
        }
        average = (float) sum/20;
        System.out.println(String.format("Max:%d\nMin:%d\nAverage:%f\nSum:%d",max,min,average,sum));
    }
}
