package com.yugeshreganti.beans;

public class MichelinTyres implements Tyres {
    @Override
    public void rotate() {
        System.out.println("Michelin Tyres are rotating");
    }

    @Override
    public String toString() {
        return "MichelinTyres{}";
    }
}
