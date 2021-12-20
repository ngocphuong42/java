package com.example.lesson3;

import java.util.HashMap;

public class slide23_1 extends Object{
    public static void main(String[] args) {
        String[] list= {"Pizza", "Pizza", "Sushi", "Rice", "Rice", "Rice"};
        var dictionary = new HashMap<String, Integer>();
        for (var i=0; i< list.length; i++){
        if (dictionary.containsKey(list[i])){
            dictionary.put(list[i], dictionary.get(list[i])+1);
        }
        else {
        dictionary.put(list[i],1);}
        }
        for (var entry:dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
