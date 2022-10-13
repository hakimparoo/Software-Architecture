//package com.solid.lsp;


public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        Area reg1 = new Rectangle(width, height);
         System.out.println("==== Rectangle ====");
         System.out.println("Width = " + ((Rectangle)reg1).getWidth());
         System.out.println("Height = " + ((Rectangle)reg1).getHeight());
         System.out.println("Area = " + reg1.getArea());

         Area reg2 = new Square(5);
//         reg2.se(width);
//         reg2.setHeight(height);
         System.out.println("====   Square  ====");
         System.out.println("Width = " + ((Square)reg2).getSide());
         System.out.println("Height = " + ((Square)reg2).getSide());
         System.out.println("Area = " + reg2.getArea());
    }
}
