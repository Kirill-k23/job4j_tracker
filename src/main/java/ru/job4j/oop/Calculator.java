package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int mu) {
        return x * mu;
    }

    public static int minus(int mi) {
        return mi - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int resultMinus = minus(5);
        System.out.println(resultMinus);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        int rlsDivide = calculator.divide(5);
        int rslSumAllOperation = calculator.sumAllOperation(5);
        System.out.println(rslSumAllOperation);
        System.out.println(rlsDivide);
        System.out.println(rsl);
    }
}