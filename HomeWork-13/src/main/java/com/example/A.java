package com.example;

public class A {
    public int f1(int x) {
        x = x + 1;
        return x;
    }

    public int f2(int x) {
        x = x + 2;
        return x;
    }

    public int f3(int x) {
        x = x + 3;
        return x;
    }

    public int f4(int x) {
        x = x + 4;
        return x;
    }

    public double f5(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) x / y;
    }

    public int f6(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("x can't be negative");
        }

        return x + 5;
    }

    public String f7(String s) {
        return s + " more stuff";
    }

    public int f8(int x) {
        // Assume this calls a SQL database such as "select * from where something = x"
        return x + 8;
    }
}

