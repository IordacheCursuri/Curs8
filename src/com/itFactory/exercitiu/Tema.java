package com.itFactory.exercitiu;

import java.util.*;

public class Tema {
    public static void main(String[] args) {

       // Map<String, String> map = new HashMap<>();

        Set<String> set = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String textulMeu [] = text.split(" ");

        for (String s: textulMeu){

            set.add(s);

         //   map.put(s, s);
        }

        System.out.println(set);

        System.out.println(set.size());





    }

}
