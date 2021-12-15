package com.example.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class slide15_1 {
//    static void arraylist_greater_than_6(int[] arr) {
//        ArrayList filter_List = new ArrayList();
//        for (var item : arr) {
//            if (item > 6) {
//                filter_List.add(item);
//            }
//        }
//        System.out.println("Danh sach các phần tử lớn hơn 6 là:");
//        for (var item : filter_List) {
//            System.out.println(item);
//        }
//    }

    public static void main(String[] args) {
//        int[] list = {1, 5, 3, 6, 9, 2, 5, 11, 14};
        var arr = new ArrayList<Integer>(
                Arrays.asList(new Integer[]{1, 3, 4, 5, 2, 9, 8})
        );

        ArrayList filter_List = new ArrayList();
        for (var item : arr) {
            if (item > 6) {
                filter_List.add(item);
            }
        }
        System.out.println("Danh sach các phần tử lớn hơn 6 là:");
        for (var item : filter_List) {
            System.out.println(item);
        }
//        arraylist_greater_than_6(list);
    }
}
