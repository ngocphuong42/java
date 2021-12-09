package com.example.lesson3;

public class slide7 {
    static void gia_tri_chia_het_3(int arr[])
    {
        for (var i=0; i<arr.length; i++){
            if (arr[i] % 3 == 0) {
                System.out.println("Phan tu thu " +i +" = " + arr[i]+ " chia het cho 3");
            }
        }
    }
    static void stt_chia_het_3 (int arr[])
    {
        for (var i=0; i<arr.length; i++){
            if (i % 3 == 0) {
                System.out.println("Phan tu co so thu tu chia het cho 3 la: " + arr[i]);
            }
        }
    }
    static void tong_phan_tu (int arr[])
    {
        var sum =arr[0];
        for (var i=1; i<arr.length; i++){
            sum = sum+arr[i];
            }
        System.out.println("Tong cac phan tu cua list la: "+sum);
    }
    static void max_min (int arr[])
    {
        var max =arr[0];
        var min=arr[0];
        for (var i=1; i<arr.length; i++){
            if (max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("So lon nhat trong mang la:  "+max);
        System.out.println("So be nhat trong mang la:  "+min);
    }

    public static void main(String[] args) {
        int[] list = {1, 5, 3, 6, 9, 2, 5, 11, 14};
        gia_tri_chia_het_3(list);
        stt_chia_het_3(list);
        tong_phan_tu(list);
        max_min(list);
    }
}
