package com.cirno.java;

public class Insertion_sort {
    public static void main(String[] args){
        int temp;
        int a[] = new int[]{9,1,7,3,6,2,5,6,4,0};
        for(int i = 1;i < 10; i++){
            for(int j = i; j > 0; j--){
                if(a[j]<a[j-1]){
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else break;
            }
        }
        for(int k = 0; k < 10; k++){
            System.out.print(a[k]+" ");
        }
    }
}