package com.company;

import java.util.Scanner;

public class B extends A {
    int y;

    void m1() {
        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();
    }
    void m2() {
        System.out.println(x+y);

    }
}
