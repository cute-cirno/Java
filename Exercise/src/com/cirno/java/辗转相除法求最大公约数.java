package com.cirno.java;

import java.util.Scanner;

public class Gcd_with_division_algorithm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two integers separated by spaces.");
        String str = scanner.nextLine();
        scanner.close();
        String [] str_list = str.strip().split("\s");
        int a = Integer.parseInt(str_list[0]), b = Integer.parseInt(str_list[1]),gcd;
        gcd = Gcd(a,b);
        System.out.println(String.format("GCD number is:%d",gcd));
    }
    public static int Gcd(int a,int b){
        return b == 0 ? a:Gcd(b,a%b);
    }
}
