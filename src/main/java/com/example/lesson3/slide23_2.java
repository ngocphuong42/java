package com.example.lesson3;
import java.util.HashMap;

public class slide23_2 {
    public static void main(String[] args) {
        var dictionary = new HashMap<String, Integer>();
        dictionary.put("Alice", 25);
        dictionary.put("Anny", 45);
        dictionary.put("Tommy", 79);
        dictionary.put("Lenny", 100);
        System.out.println("Tên những người có nhiều hơn 50 đồng là: ");
        for (var entry : dictionary.entrySet()) {
            if (entry.getValue() > 50) {
                System.out.println(entry.getKey() + ";");
            }
        }
        System.out.println("Số tiền của những người có tên bắt đầu bằng chữ A là:");
        for (var entry : dictionary.entrySet()) {
            if (entry.getKey().startsWith("A")) {
                System.out.println(entry.getKey() + " có số tiền: " + entry.getValue());
            }
        }
        var tongtien = 0;
        for (var entry : dictionary.entrySet()) {
            tongtien = tongtien + entry.getValue();
        }
        System.out.println("Tổng tiền của mọi người là:" + tongtien);
    }
}
