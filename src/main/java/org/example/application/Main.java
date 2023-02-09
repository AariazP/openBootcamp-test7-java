package org.example.application;

import org.example.model.SmartDevice;
import org.example.model.Smartphone;
import org.example.model.Smartwatch;

public class Main {
    public static void main(String[] args) {


        System.out.println(new SmartDevice("Android", "Samsung", "Galaxy S21", "Black", 128,
                8, 4000, 6, 3200, 120));

        System.out.println(new Smartphone("Android", "Samsung", "Galaxy S21", "Black", 128,
                8, 4000, 6, 3200, 120, "Snapdragon 888", "Adreno 660",
                "12MP", "12MP", "Li-Po"));

        System.out.println(new Smartwatch("Android", "Samsung", "Galaxy Watch 4", "Black", 128,
                8, 340, 1, 360, 60, "1.2GHz", "1.15GHz", "1.15GHz", "1.15GHz"));
    }
}