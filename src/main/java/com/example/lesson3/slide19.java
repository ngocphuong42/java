package com.example.lesson3;

public class slide19 {
    public static void main(String[] args) {
        var arr = new boolean[][]{
                {true, true, true},
                {false, false, true},
                {true, true, true}
        };
        /*Cách khai báo khác*/
//        boolean a[][] = {{true, true, true},{false, false, true},{true, true, true}};

        /*Bài 19.1: In ra giá trị hàng thứ 2 cột thứ 3*/
        System.out.println("Bài 19.1: Giá trị hàng thứ 2 cột thứ 3 là: " + arr[1][2]);

        /* Bài 19.2: Đổi trạng thái của nút ở hàng 1 cột 2 */
        boolean arr_1_2 = arr[0][1];
        arr[0][1] = !arr[0][1];
        System.out.println("Bài 19.2: Giá trị của nút ở hàng 1 cột 2 cũ là: " + arr_1_2 + ". Và đã được đổi thành: " + arr[0][1]);

        /*Bài 19.3 Hãy thay đổi trạng thái của tất cả các công tắc thành trạng thái ngược lại của từng công tắc đó*/
        for (var i = 0; i < arr.length; i++) {
            System.out.println("Các giá trị sau khi đảo ngược của hàng " + (i + 1) + " là:");
            for (var j = 0; j < arr[i].length; j++) {
                arr[i][j] = !arr[i][j];
            System.out.println(arr[i][j] + ", ");}
        }
    }
}