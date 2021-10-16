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
        ArrayList<String> wordList = new ArrayList<>();
        for (String s : strList) {
            boolean flag = true;
            String words = s.toLowerCase();
            for (String value : wordList) {
                if (words.equals(value)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                wordList.add(words);
            }
        }
        for (String word : wordList) {
            int wordCount = 0;
            for (String s : strList) {
                if (word.equals(s))
                    wordCount++;
            }
            System.out.println("word:" + word + "\ttimes:" + wordCount);
        }
    }
}
