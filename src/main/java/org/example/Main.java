package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    String s = "My name is Maaz Khan";

   System.out.println(s);
   System.out.println(reverseString(s));
    }

    public static String reverseString(String str) {

        String arr[] = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length - 1; i >= 0 ; i--) {
            sb.append(arr[i]);
            if(i > 0) { sb.append(' ');}

        }
        return sb.toString();
    }


    }


