package com.example.lesson3;

import java.util.HashMap;

public class slide_25 {
    public static void main(String[] args) {
        String[] list = {"Book", "Book", "Pencil", "Pencil", "Notebook", "Pencil", "Book", "Notebook"};
        var Order = new HashMap<String, Integer>();
        for (var i = 0; i < list.length; i++) {
            if (Order.containsKey(list[i])) {
                Order.put(list[i], Order.get(list[i]) + 1);
            } else {
                Order.put(list[i], 1);
            }
        }
        String product_name = list[0];
        int quantity = 1;
        for (var entry : Order.entrySet()) {
            if (entry.getValue()>=quantity)
            {
                product_name = entry.getKey();
                quantity= entry.getValue();
            }
        }
        System.out.println("Mặt hàng "+product_name+" được mua nhiều nhất với số lượng: "+quantity);
    }
}
