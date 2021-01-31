package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        CSV parser = new CSV();
        Menu menu = new Menu();


        menu.start(parser.parse());

    }
}