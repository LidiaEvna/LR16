package com.company;

 class Formula {
         int a;
         int b;
         int c;
         Formula(int a, int b, int c) {
         this.a = a;
         this.b = b;
         this.c = c;
         }
public void displayFormula() {
        double vector = a * Math.pow(b, c);
        System.out.println(vector);
        }
        }

class Formula2 {
    int w;
    int m;
    int z;
    Formula2(int w, int m, int z) {
        this.w = w;
        this.m = m;
        this.z = z;
    }
    public void displayFormula() {
        double vector = w * Math.pow(m, z);
        System.out.println(vector);
    }
}
@FunctionalInterface
 interface Converter <Formula,Formula2>{
        Formula2 conv(Formula t);
        }
public class Main {
    public static void main(String[] args) {
        Formula first = new Formula(34,15,2);
        Converter qf = x -> new Formula2(first.a, first.b, first.c);
        Formula2 second = (Formula2) qf.conv(first);
        second.displayFormula();
    }
}