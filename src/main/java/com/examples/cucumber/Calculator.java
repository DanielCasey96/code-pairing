package com.examples.cucumber;

public class Calculator {
    int result = 0;

    private int Add(int a, int b) {
        return a+ b;
    }

    private int Sub(int a, int b) {
        return a+ b;
    }

    private void Div(int a, int b) {
        return;
    }

    private int Mult(int a, int b) {
        return a*b;
    }

    public int function(int type, int a, int b) {
        switch (type) {
            case 1:
                result = Sub(b, a);
                break;
            case 2:
                result = Add(a, b);
                break;
            case 3:
                Div(a, b);
                break;
            case 4:
                result = Mult(a, b);
                break;
        }
        return result;
    }
}
