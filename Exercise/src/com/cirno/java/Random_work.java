package com.cirno.java;

import java.util.Random;

public class Random_work {
    public static void main(String[] args){
        Random rand = new Random();
        int sum=0,max=77,min=459,temp_max,temp_min;
        float average;
        int[] a = new int[20];
        for(int i = 0; i < 20; i++){
            a[i] = rand.nextInt(382)+77;
            sum += a[i];
            temp_max = a[i];
            temp_min = a[i];
            if(temp_max>max) max = temp_max;
            if(temp_min<min) min = temp_min;
        }
        average = (float) sum/20;
        System.out.printf("Max:%d\nMin:%d\nAverage:%f\nSum:%d%n",max,min,average,sum);
    }
}
