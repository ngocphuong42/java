package com.example.lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class slide15_2 {

    public static void main(String[] args) {
        var list = new ArrayList<Integer>(
                Arrays.asList(5, 8, 9, 1, 7)
        );

        ArrayList New_List = new ArrayList();
        for (var item : list) {
            New_List.add(item);
            New_List.add(item * 2);
        }
        System.out.println("Danh sach các phần tử và 2 lần của chúng là:");
        for (var item : New_List) {
            System.out.println(item);
        }
        ArrayList List_Reverse = new ArrayList();
        for (int i = (New_List.size() - 1); i >= 0; i--) {
            List_Reverse.add(New_List.get(i));
        }
        System.out.println("Danh sách đảo ngược của danh sách trên là: ");
        for (var item : List_Reverse) {
            System.out.println(item);
        }
    }
}
