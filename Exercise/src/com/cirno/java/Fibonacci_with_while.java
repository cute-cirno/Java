package com.cirno.java;

public class Fibonacci_with_while {
    public static void main(String[] args){
        int f0 = 0,f1 = 1, count = 1,n;
        System.out.print("1, ");
        while (count<101){
            n = f0+f1;
            f0 = f1;
            f1 = n;
            System.out.printf("%d, ", n);
            count++;
        }
    }
}
