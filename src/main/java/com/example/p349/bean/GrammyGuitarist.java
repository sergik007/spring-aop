package com.example.p349.bean;

import com.example.p342.bean.Singer;
import com.example.p349.bean.Guitar;

public class GrammyGuitarist implements Singer {
    @Override
    public void sing() {
        System.out.println("Gravity is working against me\n" +
                "And gravity wants to bring me down");
    }

    public void sing(Guitar guitar) {
        System.out.println("play: " + guitar.play());
    }
    public void talk() {
        System.out.println("talk");
    }
    public void rest() {
        System.out.println("zzz");
    }

}
