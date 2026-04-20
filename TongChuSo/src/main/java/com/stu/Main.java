package com.stu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");

        try {
            long n = sc.nextLong();
            n = Math.abs(n);

            long tong = 0;
            while (n > 0) {
                long chuSo = n % 10;
                tong += chuSo;
                n = n / 10;
            }
            System.out.println("Tổng các chữ số là: " + tong);

        } catch (Exception e) {
            System.out.println("Vui lòng nhập một số nguyên hợp lệ!");
        }
    }
}