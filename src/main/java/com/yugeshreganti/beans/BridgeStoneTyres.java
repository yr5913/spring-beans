package com.yugeshreganti.beans;

public class BridgeStoneTyres implements Tyres {
    @Override
    public void rotate() {
        System.out.println("Bridge Stone Tyres are rotating");
    }

    @Override
    public String toString() {
        return "BridgeStoneTyres{}";
    }
}
