package com.driver;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth());
    }

    public static class A{
        public static String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A{
        @Contract(pure = true)
        public static @NotNull String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
}

