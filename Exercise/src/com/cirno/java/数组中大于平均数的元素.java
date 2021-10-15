package com.cirno.java;

import java.util.Scanner;

public class Outstanding_value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter multiple numbers separated by spaces.");
        String str = sc.nextLine();
        sc.close();
        int count=0;
        float average;
        String [] num_list = str.strip().split("\s");
        int len = num_list.length;
        int a[] = new int[len];
        for(int i = 0; i < len; i++){
            a[i] = Integer.parseInt(num_list[i]);
            count += a[i];
        }
        average = (float) (count/len);
        for(int j = 0; j<len;j++){
            if(a[j]>(float)average){
                System.out.print(a[j]+ "\t");
            }
        }

    }
}
