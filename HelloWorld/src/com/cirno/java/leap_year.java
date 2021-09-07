package com.cirno.java;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthYear = scanner.nextInt();
        int sum = 0;
        int year;
        for(int i=1;i<=100;i++){
            year = birthYear + i;
            if(year%4==0 && year%100 != 0 || year%400==0)
                sum += 1;
        }
        System.out.println(sum);
    }
}
