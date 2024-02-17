package com.yugeshreganti.beans;

public class SonySpeakers implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("Playing music from Sony Speakers");
    }

    @Override
    public String toString() {
        return "SonySpeakers{}";
    }
}
