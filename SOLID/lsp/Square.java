//package com.solid.lsp;

public class Square extends Area  {
    private int side;

    Square(int side) {
         this.setSide(side);
//        this.side=side;
    }

    public void setSide(int side) {
        this.side=side;
    }

    public int getSide() {
        return side;
    }

    public int getArea()
    {
        return this.side*this.side;
    }
    
    
}
