package com.vaishnavi;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "   Vaishnavi Kale ";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.strip().split(" ")));
    }
}
