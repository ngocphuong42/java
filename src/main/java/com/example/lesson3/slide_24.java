package com.example.lesson3;

import java.util.HashMap;

public class slide_24 {

    public static void main(String[] args) {
        var menu = new HashMap<String, Integer>();
        menu.put("Pizza",120);
        menu.put("Hamburger",80);
        menu.put("Sandwich",50);
        menu.put("Coffee",45);
        menu.put("Cupcake",45);
        String[] list= {"Pizza", "Pizza", "Coffee", "Hamburger"};
        int tongtien = 0;
        for (var i=0;i< list.length;i++)
        {
            tongtien=tongtien+menu.get(list[i]);
        }
        System.out.println("Tổng tiền phải trả là: "+tongtien);
    }
}
