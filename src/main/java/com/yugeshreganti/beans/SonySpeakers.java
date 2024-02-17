package com.yugeshreganti.beans;

public class SonySpeakers implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("Playing music from Sony Speakers");
    }
}
