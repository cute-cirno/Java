package com.cirno.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Words_statistics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence separated by spaces.");
        String str = scanner.nextLine();
        scanner.close();
        String [] strList = str.strip().split("\s");
        ArrayList<String> wordList = new ArrayList<String>();
        ArrayList<Integer> wordNumList = new ArrayList<Integer>();
        for(int i = 0; i < strList.length; i++){
            boolean flag = true;
            String words = strList[i].toLowerCase();
            for(int j = 0;j < wordList.size();j++){
                if(words.equals(wordList.get(j))){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                wordList.add(words);
            }
        }
        for(int k=0; k < wordList.size(); k++){
            String word = wordList.get(k);
            int wordCount=0;
            for(int l=0; l < strList.length;l++){
                if(word.equals(strList[l]))
                    wordCount++;
            }
            System.out.println("word:"+word+"\ttiems:"+wordCount);
        }
    }
}
