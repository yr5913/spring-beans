package com.yugeshreganti.beans;

public class BoseSpeakers implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("Playing music from Bose Speakers");
    }
}
