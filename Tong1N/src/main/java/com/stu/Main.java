package com.stu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập số nguyên dương N: ");
        N = scanner.nextInt();
        if(N <= 0)
        {
            System.out.println("Số Nhập không hợp lệ");
        }
        else
        {
            int sum = 0;
            for (int i = 1; i <= N ; i++) {
                sum += i;
            }
            System.out.println("Tổng: "+sum);
        }

    }
}