package com.stu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float x, y, z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập cạnh x:");
        x = scanner.nextFloat();
        System.out.println("Vui lòng nhập cạnh y:");
        y = scanner.nextFloat();
        System.out.println("Vui lòng nhập cạnh z:");
        z = scanner.nextFloat();

        if (x + y <= z || x + z <= y || y + z <= x) {
            System.out.println("Tam giác không hợp lệ");
        }
        else {
            if (x == y && y == z) {
                System.out.println("Tam giác đều");
            }
            else if (x == y || x == z || y == z) {
                if (isVuong(x, y, z)) {
                    System.out.println("Tam giác vuông cân");
                } else {
                    System.out.println("Tam giác cân");
                }
            }
            else if (isVuong(x, y, z)) {
                System.out.println("Tam giác vuông");
            }
            else {
                System.out.println("Tam giác thường");
            }
        }
        scanner.close();
    }

    public static boolean isVuong(float a, float b, float c) {
        float a2 = a * a;
        float b2 = b * b;
        float c2 = c * c;
        return (a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2);
    }
}