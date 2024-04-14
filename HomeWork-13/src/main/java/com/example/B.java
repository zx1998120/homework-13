package com.example;

public class B {
    private A a;

    public B(A a) {
        this.a = a;
    }

    public int g1(int x) {
        return a.f8(x);
    }
}
