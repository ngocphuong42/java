package com.example.lesson2;
import  java.lang.Math;
public class Lesson2_2 {
    public static void main(String[] args) {
        var b ="11";
        var o ="666";
        var t = "8";
        var chuoi = "bootboottot";
        chuoi=chuoi.replace("b","11");
        chuoi=chuoi.replace("o","666");
        chuoi=chuoi.replace("t","8");
        System.out.println(chuoi);
    }



}
//    public static void main(String[] args) {
//        var a = "boooboobobooobooboo";
//        var count =0;
//        for (var i =0; i<=(a.length()-3); i++)
//        {
//            if (a.substring(i,i+3).equals("boo")) {
//                count = count+1;
//            }
//        }
//        System.out.println(+count);
//    }
//
//    public static void main(String[] args) {
//        var a = 0;
//        for (var i = 0; i <=20; i++) {
//            if (i % 7 == 2) {
//                a = i;
//            }
//        }
//        System.out.println("the value to find is:" + a);
//    }
//public static void main(String[] args) {
//        var sum =0;
//        var a1=0;
//        var b1=0;
//        for (var a=0; a<11; a++) {
//            var b = 11 - a;
//            var sum_draft = (a * a + b * b);
//            if (sum_draft > sum) {
//                sum = sum_draft;
//                a1=a;
//                b1 =b;
//            }
//        }
//        System.out.println("Max sum need to define is " +sum +" in case a= "+a1 +" and b= " +b1);
//}

//    public static void main(String[] args) {
//        var a = 1;
//        for (var i = 1; i <= 10; i++) {
//            a=a*2;
//            System.out.println("2^" + i + " = " + a);
//        }
//    }
//public static void main(String[] args) {
//   var a = 1024;
//   var b = 1;
//   var i = 1;
//    for (i=1; i<a; i++)
//    {
//        b=b*2;
////        y=i;
//        if (b==a){
//            break;
//        }
//    }
//    System.out.println(+i);
//}

