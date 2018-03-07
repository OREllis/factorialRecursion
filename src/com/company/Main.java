package com.company;

class Factorial {

    int factR(int n){
        if (n==1) return 1;
        int result = factR(n-1) * n;
        return result;
    }

    int factI(int n){
        int result =1;

        for (int t=1; t<=n; t++)
            result *= t;

        return result;
    }
}

public class Main{
    public static void main(String args[]){
        Factorial f = new Factorial();

        System.out.println("Recursive factorial of 5: "+f.factR(5));
        System.out.println("Iterative factorial of 5: "+f.factI(5));
    }
}
